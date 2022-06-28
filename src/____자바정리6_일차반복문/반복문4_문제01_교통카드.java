package ____자바정리6_일차반복문;
/*
	[문제]
		철수네 반 학생 25명이 체험학습을 하러 가기위해
		버스를 탔는데 , 총요금이 19400원이였다.	
		교통카드를 사용하면 720원이고 , 
		현금으로 지불하면 1000원일때, 	
		교통카드를 사용한 학생수와 현금을 사용한 학생수를 출력하시오.
	[정답]
		교통카드 학생수 : 20
		현금 학생수 : 5
*/
public class 반복문4_문제01_교통카드 {
	public static void main(String[] args) {					
		int total = 25;
		int 교통카드 = 720;
		int 현금 = 1000;
		int x = total;
		int y = 0;
		while(true) {
			if(교통카드*x + 현금*y == 19400 ) {
				System.out.println("교통카드 학생수 : "+x);
				System.out.println("현금 학생수 : " +y);
				break;
			}
			x -= 1;
			y += 1;
		}
		
		
	} 
}
