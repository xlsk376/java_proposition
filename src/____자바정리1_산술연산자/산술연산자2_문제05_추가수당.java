package ____자바정리1_산술연산자;
/*
	[문제]
		철수는 하루 8시간 아르바이트를 하고 있다.
		아르바이트 수당은 한 시간에 9400원이다. 
		오늘 철수는 4시간 추가 근무를 하여 총 12시간 근무를 하였다.
		오늘 추가 근무한 4시간 중 3시간은 야근 수당을 받게 되었다.
		오늘 철수가 받을 수당은 얼마인지 구하시오.
		단, 야근 수당은 일반 수당의 1.5 배이다.
		소수점 두 자리까지 구하시오.
	[정답]
		126900.00
*/
public class 산술연산자2_문제05_추가수당 {
	public static void main(String[] args) {
		//하루 8시간, 1 : 9400, 총 12시간 근무  +4시간 중 3시간 야근 수당 야근 수당은 일반 수당 1.5배
		//야근 수당 1 : 9400*1.5
		System.out.printf("%.2f",(9*9400+(9400*1.5)*3));
		
	}
}
