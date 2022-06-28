package ____자바정리6_일차반복문;
/*
	[문제]
		8의 배수를 작은수부터 순차적으로 출력하는데 50에서 100사이의 8의배수만 출력하시오.
		for를 사용하시오.
*/
public class 반복문5_문제02_for범위안배수 {
	public static void main(String[] args) {
		
		for(int i = 50; i <= 100; i++) {
			if(i % 8 == 0) {
				System.out.println(i);
			}
		}
	}
}
