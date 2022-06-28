package ____자바정리2_변수;
/*
	[문제]
		귤 6개의 무게는 840g, 사과 3개의 무게는 750g이다.
		귤 5개와 사과 4개의 무게를 구하시오.
	[정답]
		1700
 */
public class 변수1_문제10_사과귤2 {
	public static void main(String[] args) {
		int 귤6 = 840;
		int 사과3 = 750;
		
		int 귤1 = 귤6/6;
		int 사과1 = 사과3/3;
		
		int 귤5 = 귤1 * 5;
		int 사과4 = 사과1 * 4;
		
		System.out.println(귤5 + 사과4);
	}
}
