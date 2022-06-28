package ____자바정리6_일차반복문;
/*
	[문제] 
		9의 배수중 100보다 큰 첫번째 배수 출력하시오. 
	[정답]
		108
*/
public class 반복문2_문제04_첫번째배수2 {
	public static void main(String[] args) {
		int n = 100;
		boolean run = true;
		while(run == true) {
			if(n % 9 == 0) {
				System.out.println(n);
				run = false;
			}
			n = n + 1;
		}
	}
}
