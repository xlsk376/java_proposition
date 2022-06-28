package ____자바정리2_변수;
/*
  	[문제]
  		과일상점에 과일 250개가 있다. 
  		그중에 오전에 120개가 팔렸고, 오후에는 80개가 팔렸다.
  		남은 과일은 전체 과일의 몇 % 인지 구하시오.
  		소수점 두 자리까지 구하시오.
  	[정답] 
  		20.00
 */
public class 변수3_문제07_판매통계 {
	public static void main(String[] args) {
		double 과일 = 250.0;
		double 오전 = 120.0;
		double 오후 = 80.0;
		double 남은과일 = 과일-오전-오후;
		double 퍼센트 = 남은과일/과일*100;
		System.out.println(퍼센트);
	}
}
