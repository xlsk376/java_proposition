package ____자바정리6_일차반복문;
/*
	[문제] 
		9의 배수중 100보다 큰수중 일의 자리가 6인 첫번째 9의 배수 출력하시오.
	[정답]
		126
*/
public class 반복문2_문제07_일의자리2 {	
	public static void main(String[] args) {	
		int i = 100;
		boolean run = true;
		while(run == true) {
			int a = i % 10;
			if(i % 9 == 0 && a == 6) {
				System.out.println(i);
				run = false;
			}
			i = i + 1;
		}
	}
}
