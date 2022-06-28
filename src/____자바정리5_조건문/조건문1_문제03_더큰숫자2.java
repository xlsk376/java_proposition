package ____자바정리5_조건문;

import java.util.Scanner;
/*
	[문제] 
	[더큰숫자]
		숫자 2개를 입력받고 더큰숫자의 값을 출력하시오.
	[예시]
		a = 10;
		b = 20;
	[결과]
		20
 */
public class 조건문1_문제03_더큰숫자2 {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		System.out.println("숫자1 입력 : ");
		a = scan.nextInt();
		System.out.println("숫자2 입력 : ");
		b = scan.nextInt();
		if(a > b) {
			System.out.println(a);
		}
		if(a < b) {
			System.out.println(b);
		}
		scan.close();
	}
}
