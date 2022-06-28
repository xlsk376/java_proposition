package ____자바정리2_변수;
/*
	[문제]
	 	철수는 자전거를 타고 일정한 빠르기로 2시간 동안 37876m를 갔다.
	 	철수가 자전거를 타고 30초 동안 간 거리를 구하시오.
	 	소수점 두 자리까지 구하시오. 
	[정답] 
		157.82
 */
public class 변수3_문제04_자전거거리 {
	public static void main(String[] args) {
		// 2시간 : 37876 = 30초 : x
		
		double 거리1 = 37876.0;
		double 시간1 = 2*60*60;
		double 시간2 = 30;
		double 거리2 = 거리1*시간2 / 시간1;
		System.out.printf("%.2f",거리2);
	}
}
