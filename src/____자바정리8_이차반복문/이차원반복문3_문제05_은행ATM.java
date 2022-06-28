package ____자바정리8_이차반복문;

import java.util.Arrays;
import java.util.Scanner;
/*
 ㅇ [ATM] 
  
  	-전체 기능구현
	[1] 기본메뉴 출력 : [1.회원가입][2.로그인][3.종료]
	[2] 로그인 성공시 새로운매뉴 출력 : [1.송금][2.잔액조회][3.로그아웃]
	[3] 관리자로그인 : 로그인시 admin , admin 으로 로그인하면 새로운매뉴 출력 :
		[1.회원전체목록][2.로그아웃]
 */

// 문자열 공부후 다시 작성하기

public class 이차원반복문3_문제05_은행ATM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int MAX = 5;	
		String[] idList = new String[MAX];
		String[] pwList = new String[MAX];
		int[] moneyList = new int[MAX];
		//int idList[] = new int[MAX];
		
		int count = 0;
		String log = "";
		
		while(true) {
			System.out.println("[1.회원가입][2.로그인][3.종료]");
			int sel = scan.nextInt();
			if(sel == 1) { // 회원가입
				if(count == 5) {
					System.out.println("가득참");
				}else {
					System.out.println("가입할 아이디 입력");
					String id = scan.next();
					boolean check = false;
					for(int i = 0; i < idList.length; i++) {
						if(id.equals(idList[i])) {
							check = true;
							break;
						}
					}
					if(check == true) {
						System.out.println("아이디 중복");
					}else {
						idList[count] = id;
						count += 1;
					}
					
				}
			}else if(sel == 2) { // 로그인
				
			}else if(sel == 3) { // 종료
				break;
			}else if(sel == 4) { // 조회
				  System.out.println(Arrays.toString(idList));
				 //System.out.println(Arrays.toString(pwList));
			}
		}
		
		
	}
}
