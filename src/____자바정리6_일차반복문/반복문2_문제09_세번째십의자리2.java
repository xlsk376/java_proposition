package ____자바정리6_일차반복문;
/*
	[문제] 
		9의 배수중 100보다 큰수중에서 십의 자리가 6인 세번째 9의 배수 출력하시오.
	[정답]
		360
*/
public class 반복문2_문제09_세번째십의자리2 {
	public static void main(String[] args) {
		boolean run = true;
		int i = 100;
		int count = 0;
		int 배수9 = 0;
		while(run == true) {
			int a = i % 100 / 10;
			if(i % 9 == 0 && a == 6) {
				System.out.println(i);
				count += 1;
				if(count == 3 ) {
					배수9 = i;
					run = false;
				}
			}
			i += 1;
		}
		System.out.println(배수9);
	}
}
