package ____자바정리6_일차반복문;
/*
	[문제] 
		[1] 48의 약수중 일의자리가 2~6사이인 수를 출력하시오.
		[2] 위 조건의 약수의 개수도 출력하시오.
	[정답]
		2 3 4 6 12 16 24 
		악수의 개수 : 7개
 */
public class 반복문3_문제02_약수일의자리 {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 1; i <= 48; i++) {
			int a = i % 10;
			if(48 % i == 0 && a >= 2 && a <= 6) {
				System.out.print(i + " ");
				count += 1;
			}
		}
		System.out.println();
		System.out.println("악수의 개수 : " + count);
		
		
	}
}
