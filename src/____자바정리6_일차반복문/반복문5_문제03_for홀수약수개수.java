package ____자바정리6_일차반복문;
/*
	[문제] 
		48의 약수중 홀수의 개수를 출력하시오.
		for를 사용하시오.
 */
public class 반복문5_문제03_for홀수약수개수 {
	public static void main(String[] args) {
		
		int count = 0;
		for(int i = 1; i <= 48; i++) {
			if(48 % i == 0) {
				System.out.print(i + " ");
				if(i % 2 == 1) {
					count += 1;
				}
			}
		}
		System.out.println();
		System.out.println("count : "+count);
		
		
	}
}
