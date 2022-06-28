package ____자바정리6_일차반복문;
/*
	[문제] 
		128의 5번째 약수에서 2번째 약수를 뺀값을 구하시오.
	[정답]
		5번째 약수에서 2번째 약수를 뺀값 : 14
 */
public class 반복문3_문제06_약수빼기2 {
	public static void main(String[] args) {
		int num = 128;	
		int i = 1;
		int 배수5 = 0;
		int 배수2 = 0;
		int count = 0;
		while(i <= num) {
			if(num % i == 0) {
				count += 1;
				System.out.println(i);
				if(count == 2) {
					배수2 = i;
				}
				if(count == 5) {
					배수5 = i;
				}
			}
			i += 1;
		}
		System.out.println("5번째 약수에서 2번째 약수를 뺀값 : " + (배수5 - 배수2));
	}
}
