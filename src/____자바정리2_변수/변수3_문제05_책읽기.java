package ____자바정리2_변수;
/*
	[문제] 
		철수는 동화책을 읽고 있다. 
		동화책의 총 페이지 수는 128페이지이다.
		현재 동화책 72페이지까지 읽었다.
		지금까지 읽은 페이지는 몇 퍼센트인지 구하시오.
		소수점 두 자리까지 구하시오.	
	[정답] 
		43.75
 */
public class 변수3_문제05_책읽기 {
	public static void main(String[] args) {	
		double 총페이지 = 128.0;
		double 현재 = 72.0;
		double 퍼센트 = 현재*100/총페이지;
		System.out.printf("%.2f",퍼센트);
		
	}
}
