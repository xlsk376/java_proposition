package ____자바정리6_일차반복문;
/*
	[문제]
		[1] 반복문을 사용해 1 ~ 15를 출력한다.
		[2] 5보다크고 10보다 작으면서 3의 배수일때는 숫자대신 "안녕"을 출력한다.
		[3] 그외는 전부 숫자를 출력한다. 	
	[정답]
		1 2 3 4 5 안녕 7 8 안녕 10 11 12 13 14 15 
 */
public class 반복문1_문제03_연습2 {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 15) {
			if(i >= 5 && i <= 10 && i % 3 == 0) {
				System.out.print("안녕 ");
			}else {
				System.out.print(i + " ");
			}
			i = i + 1;
		}
	}
}
