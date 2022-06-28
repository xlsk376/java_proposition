package ____자바정리5_조건문;

import java.util.Random;
import java.util.Scanner;
/*
	[문제]
	[랜덤 구구단 게임]
		[1] 구구단 문제를 출제하기 위해, 숫자(1~9) 2개를 랜덤으로저장한다.
	  	[2] 구구단 문제를 출력한다. (예)	3 x 7 = 
	  	[3] 문제에 해당하는 정답을 입력받는다.
	  	[4] 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */

public class 조건문4_문제01_랜덤구구단2 {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int a = ran.nextInt(9) + 1;
		int b = ran.nextInt(9) + 1;
		System.out.print(a + " * " + b + " = ");
		int c = scan.nextInt();
		if(a * b == c) {
			System.out.println("정답");
		}
		if(a * b != c) {
			System.out.println("땡");
		}
		scan.close();
	}
}
