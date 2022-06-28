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
public class 변수3_문제08_학생비율2 {
	public static void main(String[] args) {
		int 총학생 = 16;
		int 양로원 = 8;
		int 지하철 = 4;
		
		int 봉사False = 총학생 - 양로원 - 지하철;
		
		double 일퍼센트 = (double)총학생 / 100;
		
		double 봉사False퍼센트 = 봉사False / 일퍼센트;
		System.out.printf("%.2f" , 봉사False퍼센트);
	}
}
