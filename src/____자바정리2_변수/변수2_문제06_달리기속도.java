package ____자바정리2_변수;
/*
	[문제] 
		철수와 민수는 일정한 빠르기로 운동장을 돌았다.
		철수는 4바퀴에 56분이 걸린다. 
		민수는 7바퀴에 1시간 24분이 걸린다. 	  	
		철수와 민수가 똑같이 3바퀴를 돌았을 때,
		철수 분속에서 민수 분속을 빼면 몇 분인지 구하시오.
		소수점 두 자리까지 구하시오.
	[정답] 
		6.00
*/
public class 변수2_문제06_달리기속도 {
	public static void main(String[] args) {
		double 철수1 = 56.0/4.0;
		double 민수1 = 84.0/7.0;
		double 철수3 = 철수1*3;
		double 민수3 = 민수1*3;
		double 차이 = 철수3 - 민수3;
		System.out.println(철수3 + " " + 민수3);
		System.out.println(차이);
		
		
	}
}
