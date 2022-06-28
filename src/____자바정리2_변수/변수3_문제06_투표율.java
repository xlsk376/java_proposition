package ____자바정리2_변수;
/*
	[문제]
 		철수네 반은 학생이 40명이다.
 	 	철수, 영희, 민수 이렇게 세 학생은 반장선거에 출마했다.
 	 	민수는 득표를 40%를 획득했고, 
 	 	영희는 9표를 획득했다.
 	 	나머지는 철수가 득표를 했다.
 	 	철수의 득표는 몇 % 인지 구하시오. 	
 	[정답] 
 		37.50
 */
public class 변수3_문제06_투표율 {
	public static void main(String[] args) {
		double total = 40;
		double 영희 = 9.0;
		double 민수 = total*0.4;
		double 철수 = 40-영희-민수;
		철수 = 철수/total*100;
		System.out.println(철수);
		
		
	}
}
