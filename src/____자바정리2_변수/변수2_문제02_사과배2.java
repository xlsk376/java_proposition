package ____자바정리2_변수;
/*
	[문제]
		사과 8개의 무게는 1056g이다.
		배 1개는 사과 1개의 117%의 무게를 갖고 있다.
		사과 5개 배 7개를 구입하였다. 
		과일 전체의 총 무게를 구하시오. 
		소수점 두 자리까지 구하시오.
	[정답]
		1741.08
*/
public class 변수2_문제02_사과배2 {
	public static void main(String[] args) {
		double 사과8 = 1056;
		double 배8 = 사과8 * 1.17;		
		double 사과5 = 사과8 / 8 * 5;
		double 배7 = 배8 / 8 * 7;
		System.out.printf("%.2f", 사과5 + 배7);
	}
}
