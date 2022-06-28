package ____자바정리2_변수;
/*	
 	[문제]
		철수네 반 학생은 31명이다.
	   	이 중에서 남학생은 3명, 
	    여학생은 남학생의 3배의 학생이 봉사활동을 하였다.
	   	철수네 반에서 봉사활동을 하지 않은 학생과 
	    봉사활동 한 학생의 차이는 얼마인지 구하시오.
	[정답] 
		7
*/	
public class 변수1_문제03_봉사활동인원 {
	public static void main(String[] args) {			
		int total = 31;
		int a = 3 + (3*3);
		int b = total - a;
		System.out.println(a + " " + b);
		System.out.println(b - a);
     }
}
