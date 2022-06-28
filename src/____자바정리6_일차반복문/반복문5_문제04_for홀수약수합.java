package ____자바정리6_일차반복문;
/*
	[문제] 
		48의 약수중 홀수의 합을 출력하시오.
		for를 사용하시오.
 */
public class 반복문5_문제04_for홀수약수합 {
	public static void main(String[] args) {
		int total = 0;
		for(int i = 1; i <= 48; i++) {
			if(48 % i == 0 && i % 2 == 1) {
				total += i;
			}
		}
		System.out.println(total);
	
	}
}
