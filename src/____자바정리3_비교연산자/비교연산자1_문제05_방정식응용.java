package ____자바정리3_비교연산자;
/*
	[문제]
		모두 true가 출력 되도록 값을 변경하시오.
		단, 변수의 값은  0을 사용하지마시오.
 */
public class 비교연산자1_문제05_방정식응용 {
	public static void main(String[] args) {
		int a = 2;
		int b = 2;
		int c = 2;
		System.out.println(a + b == c + 16);		
		a = 2;
		b = 2;
		c = 2;
		System.out.println(a - -b == c - 10);		
		a = 2;
		b = 2;
		c = 2;
		System.out.println(a * -b == c * 2);		
		a = 2;
		b = 2;
		c = 2;
		System.out.println(a / b + 2 == c / 4);		
		a = 2;
		b = 2;
		c = 2;
		System.out.println(a % b == c + 3);	
	}
}
