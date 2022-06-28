package ____자바정리6_일차반복문;
/*
	[문제]
		[1] 5 ~ 15 사이의 숫자를 전부출력한다.
		[2] 5의 배수일때는 숫자 대신 "배수" 를 출력한다.
		[2] 반복문 종료후 5의배수의 합을 저장후 출력한다.
	[정답]
		배수 6 7 8 9 배수 11 12 13 14 배수 
		5의 배수의 합 : 30
*/
public class 반복문1_문제02_연습 {
	public static void main(String[] args) {
		int total = 0;
		for(int i = 5; i <= 15; i++) {
			if(i % 5 == 0) {
				System.out.print("배수 ");
				total += i;
			}else {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("5의 배수의 합 : "+total);
	}
}
