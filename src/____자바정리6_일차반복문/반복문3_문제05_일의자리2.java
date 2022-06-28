package ____자바정리6_일차반복문;
/*
	[문제] 
		128의 약수중에서 순서대로 약수를 출력했을때, 일의자리가 4인 두번째 약수를 출력하시오.
	[정답]
		64
*/
public class 반복문3_문제05_일의자리2 {
	public static void main(String[] args) {
		int num = 128;
		int i = 1;
		int count = 0;
		int num2 = 0;
		while(i <= num) {
			int a = i % 10;
			if(num % i == 0 && a == 4) {
				count += 1;
				if(count == 2) {
					num2 = i;
				}
			}			
			i += 1;
		}
		System.out.println("일의자리가 4인 두번째 약수 : " + num2);		
	}
}
