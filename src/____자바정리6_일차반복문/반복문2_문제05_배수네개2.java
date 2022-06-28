package ____자바정리6_일차반복문;
/*
	[문제] 
		1~ 999 의 범위안의 숫자중에서 8의 배수를 큰수부터 차례대로 4개 출력하시오.
	[정답]
		992 984 976 968 
*/
public class 반복문2_문제05_배수네개2 {
	public static void main(String[] args) {
		int i = 999;
		int count = 0;
		boolean run = true;
		while(run == true) {
			if(i % 8 == 0) {
				System.out.print(i + " ");
				count += 1;
				if(count == 4) {
					run = false;
				}
			}
			i -= 1;	
		}
	}
}
