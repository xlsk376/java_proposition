package ____자바정리4_논리연산자;
/*
	[문제]
	   	아래내용을 식으로 작성하시오.		
	[설명]
		철수네 반 전체학생은 31명입니다.
	   	그 중 남학생은 9명이고, 나머지는 여학생입니다.
	   	이중에서 남학생은 7명 , 여학생은 전체여학생중 12명이 봉사할동을 하였습니다.
	   	봉사활동을 하지않은 남학생수가 봉사활동을 한남학생보다 적고,
	   	봉사활동을 하지않은 여학생수가 봉사활동을 한여학생보다 적다.
	[결과]
		true
*/
public class 논리연산자3_문제02_봉사활동2 {
	public static void main(String[] args) {
		int 전체 = 31;
		int 남학생 = 9;
		int 여학생 = 전체 - 남학생;
		int 봉사true남학생 = 7;
		int 봉사true여학생 = 12;
		int 봉사false남학생 = 남학생 - 봉사true남학생;
		int 봉사false여학생 = 여학생 - 봉사true여학생;
		System.out.println(봉사false남학생 < 봉사true남학생 && 봉사false여학생 < 봉사true여학생);
	}
}
