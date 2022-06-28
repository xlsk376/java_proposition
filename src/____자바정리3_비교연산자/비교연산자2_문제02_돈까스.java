package ____자바정리3_비교연산자;
/*
	[문제]
		철수는 3만 원을 가지고 친구 3명 포함 총 4명이어서,
		돈까스를 각각 1개씩 사 먹었더니 남은 돈이 2000원이다.
		아래씩이 모두 true 가 나오도록 변수들의 값을 변경하시오.
*/
public class 비교연산자2_문제02_돈까스 {
	public static void main(String[] args) {						
		int 돈 = 0;
		int 친구 = 0;
		int 거스름돈 = 0;
		int 돈가스 = 0;				
		
		System.out.println(돈 == 30000);
		System.out.println(거스름돈 == 2000);
		System.out.println(친구 == 4);
		System.out.println(돈 - 친구 * 돈가스 == 거스름돈 );				
     }
}
