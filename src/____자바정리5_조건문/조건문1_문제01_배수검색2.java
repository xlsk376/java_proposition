package ____자바정리5_조건문;

import java.util.Scanner;
/*
	[문제]
	[4의 배수 판별] 		
		[1] 변수 a에 숫자를 입력받는다.
		[2] 입력받은 숫자의 값이 4의 배수이면 "4의 배수이다." 를 출력하시오.
		[3] 4의배수가 아니면 "4의 배수가 아디다." 를 출력하시오.
		[4] 어떤수를 4로 나눠서 나머지가 0 이면 4의 배수이다.
 */
public class 조건문1_문제01_배수검색2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		int a;
		System.out.println("숫자입력 : ");
		a = scan.nextInt();
		if(a % 4 == 0) {
			System.out.println("4의 배수이다.");
		}
		if(a % 4 != 0) {
			System.out.println("4의 배수가 아니다.");
		}
		scan.close();
	}
}
