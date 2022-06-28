package ____자바정리5_조건문;

import java.util.Random;
/*
	[문제]
		눈금이 1 ~ 6 인 주사위 2개가 있다.
		주사위 2개를 던저서 나온숫자의 합을 출력하시오.
		단 주사위눈금이 서로 같다면 숫자의 두배를 출력하시오.
	[예시]
		2, 3 : 5
		3, 3 : 6 * 2
*/
public class 조건문4_문제07_주사위2 {
	public static void main(String[] args) {	
		Random ran = new Random();
		int a = ran.nextInt(6) + 1;
		int b = ran.nextInt(6) + 1;
		int c = a + b;
		System.out.println(a + " " + b);
		if(a == b) {
			System.out.println(c * 2);
		}
		if(a != b) {
			System.out.println(c);
		}
	}
}
