package ____자바정리6_일차반복문;
/*
	[문제] 
		100의 약수중에서 큰수부터 4개만 출력
	[정답]
		100 50 25 20 
 */
public class 반복문3_문제04_약수큰수2 {
	public static void main(String[] args) {
		boolean run = true;
		int i = 100;
		int count = 0;
		while(run == true) {
			if(100 % i == 0) {
				System.out.print(i + " ");
				count += 1;
				if(count == 4) {
					run = false;
				}
			}
			i -= 1;
			if(i == 1) {
				run = false;
			}
		}	
	}
}
