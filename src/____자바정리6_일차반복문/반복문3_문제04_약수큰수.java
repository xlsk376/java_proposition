package ____자바정리6_일차반복문;
/*
	[문제] 
		100의 약수중에서 큰수부터 4개만 출력
	[정답]
		100 50 25 20 
 */
public class 반복문3_문제04_약수큰수 {
	public static void main(String[] args) {
		
		int count = 0;
		for(int i = 100; i >= 1; i--) {
			if(100 % i == 0) {
				System.out.print(i + " ");
				count += 1;
				if(count == 4) {
					break;
				}
			}
		}
		
	}
}
