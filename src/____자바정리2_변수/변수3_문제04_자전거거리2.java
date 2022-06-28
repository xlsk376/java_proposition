package ____자바정리2_변수;
/*
	[문제]
	 	철수는 자전거를 타고 일정한 빠르기로 2시간 동안 37876m를 갔다.
	 	철수가 자전거를 타고 30초 동안 간 거리를 구하시오.
	 	소수점 두 자리까지 구하시오. 
	[정답] 
		157.82
 */
public class 변수3_문제04_자전거거리2 {
	public static void main(String[] args) {
		double 거리 = 37876;
		double 일초 = 거리 / 7200;
		double 삼십초 = 일초 * 30;
		System.out.printf("%.2f",  삼십초);
	}
}
