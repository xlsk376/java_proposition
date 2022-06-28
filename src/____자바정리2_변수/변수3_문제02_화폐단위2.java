package ____자바정리2_변수;
/*
	[문제]  
		거스름돈 174900원을 거슬러주려고 한다.
	    단, 일천원 단위는 매진되어 오백원 단위로 거슬러준다면,
	    각 단위별로 몇 장씩 나눠줘야 하는지 구하시오.
	[정답]
		 오만원  : 3, 일만원  : 2, 오천원 : 0, 
		 일천원  : 0, 오백원  : 9, 일백원 : 4
 */
public class 변수3_문제02_화폐단위2 {
	public static void main(String[] args) {
		int 거스름돈 = 174900;
		int 오만원 = 거스름돈 / 50000;
		int 일만원 = 거스름돈 % 50000 / 10000;
		int 오천원 = 거스름돈 % 10000 / 5000;
		int 일천원 = 0;
		int 오백원 = 거스름돈 % 5000 / 500;
		int 일백원 = 거스름돈 % 500 / 100;
		
		System.out.println("오만원 : " + 오만원);
		System.out.println("일만원 : " + 일만원);
		System.out.println("오천원 : " + 오천원);
		System.out.println("일천원 : " + 일천원);
		System.out.println("오백원 : " + 오백원);
		System.out.println("일백원 : " + 일백원);
	}
}
