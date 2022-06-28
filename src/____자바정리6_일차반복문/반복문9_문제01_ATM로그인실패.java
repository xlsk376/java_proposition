package ____자바정리6_일차반복문;

import java.util.Scanner;
/*
	[ATM로그인실패]
		[1] [1.로그인]  이후 새로운매뉴 출력 : [1.잔액확인] [2.로그아웃]
		[2] 로그인을 3번실패시 강제종료 시키시오. 		
*/
public class 반복문9_문제01_ATM로그인실패 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String id1 = "qwer";
		String pw1 = "1234";
		int money1 = 10000;
		String id2 = "asdf";
		String pw2 = "2345";
		int money2 = 20000;
		String log = "";
		boolean run = true;
		while (run == true) {
			System.out.println("==[ATM]==");
			System.out.println("[1.로그인] [2.종료]");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			if (sel == 1) {			
				System.out.println("[로그인] 아이디입력 : ");
				String id = scan.next();
				System.out.println("[로그인] 비밀번호입력 : ");
				String pw = scan.next();
				if(id.equals(id1) && pw.equals(pw1)) {				
					System.out.println(id1 +"님이 로그인합니다");
					log = id1;
				}else if(id.equals(id2) && pw.equals(pw2)) {
					System.out.println(id2 +"님이 로그인합니다");
					log = id2;
				}else {
					System.out.println("아이디와 비밀번호를 확인하세요.");
				}	
				while(log.equals("") == false) {
					System.out.println(log + "님 로그인중");
					System.out.println("[1.잔액확인] [2.로그아웃]");
					System.out.print("메뉴 선택 : ");
					int sel2 = scan.nextInt();
					if(sel2 == 1) {
						if(log.equals(id1)) {
							System.out.println(log + "님 잔액 : " + money1);							
						}
						else if(log.equals(id2)) {
							System.out.println(log + "님 잔액 : " + money2);	
						}
					}else if(sel2 == 2) {	
						System.out.println("로그아웃합니다.");
						log = "";
					}
				}						
			} else if (sel == 2) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
		scan.close();
	}
}
