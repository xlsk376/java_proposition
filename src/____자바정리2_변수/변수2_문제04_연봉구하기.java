package ____자바정리2_변수;
/*
	[문제] 
		내 연봉에서 세금 10%를 제외하면 1350만원이다.
		세금을 제외하기 전 내 월급은 얼마인지 구하시오.
	[정답] 
		125
 */
public class 변수2_문제04_연봉구하기 {	
	public static void main(String[] args) {
		// x 에서 10% 제외한 금액이 1350
		// x*0.9 = 1350
		double a = 1350/0.9;
		a = a/12;
		System.out.println(a);
		
		
	}
}
