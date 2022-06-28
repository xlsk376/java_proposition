package ____자바정리6_일차반복문;
/*
	[문제] 
		9의 배수중 100보다 큰 첫번째 배수 출력하시오. 
	[정답]
		108
*/
public class 반복문2_문제04_첫번째배수 {
	public static void main(String[] args) {
//		int i = 1;
//		int a = 0;
//		while(true) {
//			if(i % 9 == 0) {
//				if(i >= 100) {
//					a = i;
//					break;
//				}
//			}
//			i += 1;
//		}
//		System.out.println(a);
		
		int i = 100;
		while(true) {
			if(i % 9 == 0) {
				System.out.println(i);
				break;
			}
			i += 1;
		}
		
	}
}
