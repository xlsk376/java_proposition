package ____자바정리2_변수;
/*
	[문제]
		귤 6개의 무게는 840g, 사과 3개의 무게는 750g이다.
		귤 5개와 사과 4개의 무게를 구하시오.
	[정답]
		1700
 */
public class 변수1_문제10_사과귤 {
	public static void main(String[] args) {
		double 귤 = 840/6;
		double 사과 = 750/3;
		
		double 귤5 = 귤*5;
		double 사과4 = 사과*4;
		
		System.out.println(귤5+사과4);
		
	}
}
