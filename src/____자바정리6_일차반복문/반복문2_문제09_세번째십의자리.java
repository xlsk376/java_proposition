package ____자바정리6_일차반복문;
/*
	[문제] 
		9의 배수중 100보다 큰수중에서 십의 자리가 6인 세번째 9의 배수 출력하시오.
	[정답]
		360
*/
public class 반복문2_문제09_세번째십의자리 {
	public static void main(String[] args) {
		
		int i = 100;
		int count = 0;
		while(true) {
			int a = i % 100/10;
			if(i % 9 == 0 && a == 6) {
				count += 1;
				if(count == 3) {
					System.out.println(i);
					break;
				}
			}
			i += 1;
		}
	}
}
