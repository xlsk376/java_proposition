package ____자바정리6_일차반복문;
/*
	[문제] 
		128의 5번째 약수에서 2번째 약수를 뺀값을 구하시오.
	[정답]
		5번째 약수에서 2번째 약수를 뺀값 : 14
 */
public class 반복문3_문제06_약수빼기 {
	public static void main(String[] args) {
		int count = 0;
		int a = 0;
		int b = 0;
		for(int i = 1; i <= 128; i++) {
			if(128 % i == 0) {
				count += 1;
				if(count == 2) {
					a = i;
				}else if(count == 5) {
					b = i;
				}
			}
		}
		System.out.println(b-a);
		
		
	}
}
