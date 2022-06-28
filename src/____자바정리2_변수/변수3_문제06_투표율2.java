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
public class 변수3_문제06_투표율2 {
	public static void main(String[] args) {
		int 총학생 = 40;
		double 민수 = 총학생 * 0.4;
		System.out.println(민수);
		int 영희 = 9;
		double 철수 = 총학생 - 민수 - 영희;
		System.out.println(철수);
		
		double 일퍼센트 = 총학생 / 100.0;			
		double 철수퍼센트 = 철수 / 일퍼센트;
		System.out.printf("%.2f", 철수퍼센트);
	}
}
