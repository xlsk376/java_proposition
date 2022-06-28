package ____자바정리6_일차반복문;
/*
	[문제] 
		[1] 48의 약수중 일의자리가 3의배수인 수를 전부 출력하시오.
		[2] 위 조건의 약수의 합도 출력하시오.
	[정답]
		3 6 16 
		악수의 합 : 25		
*/
public class 반복문3_문제03_약수일의자리합2 {
	public static void main(String[] args) {
		int num = 48;
		int i = 1;
		int total = 0;
		while(i <= num) {
			int a = i % 10;
			if(num % i == 0 && a % 3 == 0) {
				System.out.print(i + " ");
				total += i;
			}
			i += 1;
		}	
		System.out.println();
		System.out.println("악수의 합 : " + total);
	}
}
