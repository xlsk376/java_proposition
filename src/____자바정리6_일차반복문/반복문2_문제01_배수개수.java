package ____자바정리6_일차반복문;
/*
	[문제] 
		50에서 100까지 자연수중에서 9의 배수의 개수를 출력하시오.
	[정답]
		9의 배수 개수 : 6개
*/
public class 반복문2_문제01_배수개수 {
	public static void main(String[] args) {
		
		int count = 0;
		for(int i = 50; i <= 100; i++) {
			if(i % 9 == 0) {
				count += 1;
			}
		}
		System.out.println(count);
		
	}
}
