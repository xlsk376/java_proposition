package ____자바정리2_변수;
/*
	[문제]
		철수네 반 학생은 16명이다.
		8명은 양로원에 봉사활동을 다녀왔고,
		4명은 지하철 봉사활동을 다녀왔다. 
		봉사활동을 다녀오지 않은 
		학생의 비율은 몇 % 인지 구하시오.
		소수점 두 자리까지 구하시오. 
	[정답] 
		25.00
 */
public class 변수3_문제08_학생비율 {
	public static void main(String[] args) {
		double 반 = 16;
		double 양로원 = 8;
		double 지하철 = 4;
		double 남은학생 = 반-양로원-지하철;
		double 퍼센트 = 남은학생/반*100;
		System.out.println(퍼센트);
		
	}
}
