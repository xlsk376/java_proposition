package ____자바정리2_변수;
/*
	[문제] 
		내 연봉에서 세금 10%를 제외하면 1350만원이다.
		세금을 제외하기 전 내 월급은 얼마인지 구하시오.
	[정답] 
		125
 */
public class 변수2_문제04_연봉구하기2 {	
	public static void main(String[] args) {
		double 세후연봉 = 1350;
		double 연봉1퍼센트 = 세후연봉 / 90;		
		System.out.println("연봉1퍼센트 : " + 연봉1퍼센트);
		double 세금 = 연봉1퍼센트 * 10;
		System.out.println("세금 : " + 세금);
		double 세전연봉 = 세후연봉 + 세금;
		System.out.println("세전연봉 : " + 세전연봉);
		
		int 월급 = (int)(세전연봉 / 12);
		System.out.println("월급 : " + 월급);
	}
}
