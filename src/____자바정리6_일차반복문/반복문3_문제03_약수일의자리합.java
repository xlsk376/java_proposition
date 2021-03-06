package ____자바정리6_일차반복문;
/*
	[문제] 
		[1] 48의 약수중 일의자리가 3의배수인 수를 전부 출력하시오.
		[2] 위 조건의 약수의 합도 출력하시오.
	[정답]
		3 6 16 
		악수의 합 : 25		
*/
public class 반복문3_문제03_약수일의자리합 {
	public static void main(String[] args) {
		
		int total = 0;
		
		for(int i = 1; i <= 48; i++) {
			int a = i % 10;
			if(48 % i == 0 && a % 3 == 0) {
				System.out.print(i+ " ");
				total += i;
			}
		}
		System.out.println();
		System.out.println("약수의 합 : " + total);
		
		
	}
}
