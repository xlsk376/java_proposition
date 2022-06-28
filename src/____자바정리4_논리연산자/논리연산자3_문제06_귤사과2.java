package ____자바정리4_논리연산자;
/*
	[문제]
		아래내용을 식으로 작성하시오.
	[설명]
		귤 6개의 무개는 840g, 사과 3개의 무게는 750g 입니다.
		귤 5개의 무게가 사과2개의 무게보다 크고,
	    사과 4개의 무게가 귤 7개의 무게보다 크다.
	[결과]
		true
*/
public class 논리연산자3_문제06_귤사과2 {	
	public static void main(String[] args) {
		double 귤6 = 840;
		double 사과3 = 750;
		double 귤1 = 귤6 / 6;
		double 사과1 = 사과3 / 3;
		System.out.println(귤1 * 5 > 사과1 * 2 && 사과1 * 4 > 귤1 * 7);
	}
}
