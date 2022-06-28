package ____자바정리5_조건문;

import java.util.Scanner;
/*
	[문제]
	[가위(0) 바위(1) 보(2) 게임]
		[1] "가위","바위","보"를 0,1,2 숫자로 대신표현한다.
		[2] player1 은 0~2 사이의 숫자를 입력받는다. 
		[3] player2 는 0~2 사이의 숫자를 입력받는다. 
		[4] player1과 player2를 비교해서 "비김" "승리" "패배" 를 출력한다.
*/
public class 조건문3_문제02_가위바위보정수2 {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		System.out.println("가위바위보게임");
		System.out.println("player1 입력 : ");
		int player1 = scan.nextInt();
		System.out.println("player2 입력 : ");
		int player2 = scan.nextInt();
		if(player1 == player2) {
			System.out.println("비김");
		}
		if(player1 == 0 && player2 == 1) {
			System.out.println("p2 승리");
		}
		if(player1 == 1 && player2 == 2) {
			System.out.println("p2 승리");
		}
		if(player1 == 2 && player2 == 0) {
			System.out.println("p2 승리");
		}
		if(player1 == 0 && player2 == 2) {
			System.out.println("p1 승리");
		}
		if(player1 == 1 && player2 == 0) {
			System.out.println("p1 승리");		
		}
		if(player1 == 2 && player2 == 1) {
			System.out.println("p1 승리");
		}
		scan.close();
	}
}
