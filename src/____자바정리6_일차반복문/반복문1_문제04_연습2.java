package ____자바정리6_일차반복문;
/*
	[문제]
		[1] 반복문을 사용해서 5 ~ 15 사이를 전부출력한다.
		[2] 반복중에 7보다 큰수중 4의배수는 숫자대신 "배수" 를 출력한다.
		[3] 반복문 종료후 7보다 큰수중 4의배수의 개수를 출력한다.
	[정답]
		5 6 7 배수 9 10 11 배수 13 14 15 
		7보다 큰수 중 4의배수의 개수 : 2개
 */
public class 반복문1_문제04_연습2 {
	public static void main(String[] args) {
		int i = 5;
		int count = 0;
		while(i <= 15) {
			if(i > 7 && i % 4 == 0) {
				System.out.print("배수 ");
				count += 1;
			}else {
				System.out.print(i + " ");
			}
			i = i + 1;
		}
		System.out.println();
		System.out.println("7보다 큰수 중 4의배수의 개수 : " + count + "개");
	}
}
