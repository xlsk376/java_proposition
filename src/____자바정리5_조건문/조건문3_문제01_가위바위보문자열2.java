package ____자바정리5_조건문;

import java.util.Scanner;
/*
	[문제]
	[가위(0) 바위(1) 보(2) 게임]
		[1] player1 은 "가위" , "바위" , "보" 를 입력받는다.
		[2] player2 는 "가위" , "바위" , "보" 를 입력받는다.
		[3] player1과 player2를 비교해서 "비김" "승리" "패배" 를 출력한다.
*/
public class 조건문3_문제01_가위바위보문자열2 {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("가위바위보게임");
		System.out.println("player1 입력 : ");
		String player1 = scan.next();
		System.out.println("player2 입력 : ");
		String player2 = scan.next();
		if(player1.equals(player2)) {
			System.out.println("비김");
		}
		if(player1.equals("가위") && player2.equals("바위")) {
			System.out.println("p2 승리");
		}
		if(player1.equals("바위") && player2.equals("보")) {
			System.out.println("p2 승리");
		}
		if(player1.equals("보") && player2.equals("가위")) {
			System.out.println("p2 승리");
		}
		if(player1.equals("가위") && player2.equals("보")) {
			System.out.println("p1 승리");
		}
		if(player1.equals("바위") && player2.equals("가위")) {
			System.out.println("p1 승리");		
		}
		if(player1.equals("보") && player2.equals("바위")) {
			System.out.println("p1 승리");
		}
		scan.close();
	}
}
