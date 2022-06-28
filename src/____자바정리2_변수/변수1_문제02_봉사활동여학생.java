package ____자바정리2_변수;
/*
	[문제]
   		철수네 반 학생은 30명이다.
   		남학생은 16명이다.
   		이 중에서 남학생은 3명, 
   	 	여학생은 남학생의 3배의 학생이 봉사활동을 하였다.
    	봉사활동을 하지 않은 여학생은 몇 명인지 구하시오.
    [정답] 
    	5
 */
public class 변수1_문제02_봉사활동여학생 {
	public static void main(String[] args) {
		int total = 30;
		int m = 16;
		int w = total - m;
		//봉사활동 한 여학생 : 3*3
		System.out.println(w - 9);
	}
}
