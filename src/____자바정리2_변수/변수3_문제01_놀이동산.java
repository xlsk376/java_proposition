package ____자바정리2_변수;
/*
  	[문제]
	   철수는 놀이공원에 갔다. 
	   놀이공원 입장료는 15000원이다.
	   철수는 각종 할인을 받아 9000원에 입장했다.
	   몇 % 할인받은 것인지 구하시오.
	   소수점 두 자리까지 구하시오.
	[정답] 
		40.00
 */
public class 변수3_문제01_놀이동산 {
	public static void main(String[] args) {
		double 입장료 = 15000.0;
		double 할인 = 9000.0;
		double 할인금액 = 입장료-할인;
		double 할인퍼센트 = 할인금액/입장료 * 100;
		System.out.printf("%.2f",할인퍼센트);
		
		
	}
}
