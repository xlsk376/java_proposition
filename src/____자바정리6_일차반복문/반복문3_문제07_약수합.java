package ____자바정리6_일차반복문;
/*
	[문제] 
		128의 3번째 약수 부터 6번째 약수의 전체합을 출력하시오.
	[정답]
		3번째 약수 부터 6번째 약수의 전체합 : 60
 */
public class 반복문3_문제07_약수합 {
	public static void main(String[] args) {
		
		int count = 0;
		int total = 0;
		
		for(int i = 1; i <= 128; i++) {
			if(128 % i == 0) {
				count += 1;
				if(count >= 3 && count <= 6) {
					total += i;
				}
			}
		}
		System.out.println(total);
	}
}
