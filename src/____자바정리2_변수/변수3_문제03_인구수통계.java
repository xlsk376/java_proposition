package ____자바정리2_변수;
/*
	[문제] 
	  	어느 도시에 전체 인구가 400000명이다. 
	    그중 나이가 19세 이하 인구는 35%이다.
	    그리고 나이가 40세 이상 인구는 25%이다.	      
	 	위 도시의 19세 이하 인구 수에서 40세 이상 인구 수를 뺀 인구 수를 구하시오.		 
	[정답] 
		40000
 */
public class 변수3_문제03_인구수통계 {
	public static void main(String[] args) {
		double total = 400000;
		double 십구세 = total*0.35;
		double 사십세 = total*0.25;
		double 차이 = 십구세 - 사십세;
		System.out.println((int)차이);
		
		
	}
}
