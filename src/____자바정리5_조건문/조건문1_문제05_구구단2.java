package ____자바정리5_조건문;

import java.util.Scanner;
/*
	[문제]
	[구구단 게임]
		[1] 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
		[2] 입력받은 숫자를 사용해 구구단 문제를 출력한다. (예) 3 * 2 =
		[3] 정답을 입력받는다.
		[4] 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */
public class 조건문1_문제05_구구단2 {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자1 입력 : ");
		int a = scan.nextInt();
		System.out.println("숫자2 입력 : ");
		int b = scan.nextInt();
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
