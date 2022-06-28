package ____자바정리6_일차반복문;
/*
	[문제] 아래조건을 충족하는 식을 작석하시오.
		 [조건1] 10~1까지 거꾸로 반복문을 실행한다.
		 [조건2] 3의 배수일때는 "안녕" 을 출력한다.
		 [조건3] 3의 배수가 아닐때는 숫자를 출력한다. 
	[정답]
		10 안녕 8 7 안녕 5 4 안녕 2 1 
*/
public class 반복문1_문제01_연습2 {	
	public static void main(String[] args) {
		int i = 10;
		while(i >= 1) {
			if(i % 3 == 0) {
				System.out.print("안녕" + " ");
			}else {
				System.out.print(i + " ");				
			}
			i = i - 1;
		}
	}
}
