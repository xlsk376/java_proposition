package ____자바정리6_일차반복문;
/*
	[문제]
		18의 약수를 전부 출력하시오.
	[정답]
		1 2 3 6 9 18 
 */
public class 반복문3_문제01_약수2 {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 18) {
			if(18 % i == 0) {
				System.out.print(i + " ");
			}
			i += 1;
		}
	}
}
