package ____자바정리1_산술연산자;
/*
	[문제]	  	
		철수는 현금 10000원을 가지고 마트에 갔다.
		사과 1개의 가격은 200원이고, 귤 1개의 가격은 110원이다. 
		사과 3개와 귤 10개를 사려고 한다.  
		모두 사면 거스름돈은 얼마인지 구하시오.
	[정답]
		8300
*/  
public class 산술연산자1_문제02_마트 {
	public static void main(String[] args) {	
		int cash = 10000;
		int a = 200;
		int b = 110;
		
		System.out.println("사과 3개 : " +(3*a));
		System.out.println("귤 3개 : " +(10*b));
		System.out.println(cash - ((3*a) + (10*b)));
	}
}
