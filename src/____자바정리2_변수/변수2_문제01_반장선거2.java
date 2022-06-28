package ____자바정리2_변수;
/*
	[문제] 
		철수네 반은 학생이 40명이다.
	 	철수, 영희, 민수는 반장선거에 나갔다.
	 	민수는 40%를 획득했고, 
	 	영희는 9표를 얻었다.
	 	나머지는 철수가 득표를 했다.
	 	철수의 득표 수를 구하시오.
	 [정답]
	 	15
 */
public class 변수2_문제01_반장선거2 {
	public static void main(String[] args) {
		double 전체 = 40;
		double 영희표 = 9;
		double 민수표 = 전체 * 0.4;
		int 철수표 = (int)(전체 - 영희표 - 민수표);		
		System.out.println(철수표);
	}
}
