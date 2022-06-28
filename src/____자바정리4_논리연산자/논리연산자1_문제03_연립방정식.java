package ____자바정리4_논리연산자;
/*
	[문제]
		다음식의 결과가 전부 true 가되도록 변수의 값을 저장하시오.
*/
public class 논리연산자1_문제03_연립방정식 {
	public static void main(String[] args) {	
		int a = 0;
		int b = 0;		
		System.out.println(a + b == 4 && a - b == 2);	
		int c = 0;
		int d = 0;		
		System.out.println(3 * c - d == 1 && -2 * c + d == -3);		
		int e = 0;
		int f = 0;		
		System.out.println(5 * e - 2 * f == 2 && e + 3 * f == 14);		
	}
}
