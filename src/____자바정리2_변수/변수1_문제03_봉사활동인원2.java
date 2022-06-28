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
public class 변수1_문제03_봉사활동인원2 {
	public static void main(String[] args) {			
		int 총학생 = 31;
		int 남학생 = 3;
		int 여학생 = 남학생 * 3;
		
		int 봉사True = 남학생 + 여학생;
		int 봉사False = 총학생 - 봉사True;
		int 결과 = 봉사False - 봉사True;
		
		System.out.println(결과);
     }
}
