package ____자바정리4_논리연산자;
/*
	[문제]
		아래식이 전부 true 가되도록 변수의 값을 변경하시오.
*/
public class 논리연산자1_문제02_or연산자 {	
	public static void main(String[] args) {		
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;		
		System.out.println(a == b || c == d);		
		System.out.println(a != b || c == d);
		System.out.println(a == b || c != d);
		System.out.println(a != b || c != d);				
	}
}
