package ____자바정리3_비교연산자;
/*
	[문제]
		모두 true가 출력 되도록 값을 변경하시오.
 */
public class 비교연산자1_문제02_비교연산자변수 {
	public static void main(String[] args) {		
		int a = 0;
		int b = 0;
		System.out.println(a == b);
		a = -2;
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
	}
}