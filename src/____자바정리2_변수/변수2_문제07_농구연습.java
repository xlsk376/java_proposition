package ____자바정리2_변수;
/*
	[문제1]
		철수가 농구 연습을 하고 있다.
		12번을 슛 시도를 했다.
		슛 한 번의 퍼센트는 얼마인지 구하시오.
		소수점 두 자리까지 구하시오.
	[정답1]
		8.33
		
	[문제2]
		12번의 슛이 100퍼센트라고 했을 때, 
		1퍼센트는 슛 몇 번 인지 구하시오.
		소수점 두 자리까지 구하시오.
	[정답2]
		0.12
*/
public class 변수2_문제07_농구연습 {
	public static void main(String[] args) {	
		// 12: 100 = 1 : x
		double 슛퍼센트 = 100.0/12.0;
		System.out.printf("%.2f", 슛퍼센트);
		
		System.out.println();
		// 12 : 100 = x : 1
		double 슛 = 12.0/100.0;
		System.out.printf("%.2f", 슛);
	}
}
