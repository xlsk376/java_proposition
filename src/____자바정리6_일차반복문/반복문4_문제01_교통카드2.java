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
public class 반복문4_문제01_교통카드2 {
	public static void main(String[] args) {					
		int 교통카드 = 720;
		int 현금 = 1000;
		int 총요금 = 19400;
		int 학생1 = 0;
		int 학생2 = 25;
		boolean run = true;
		while(run == true) {
			if(교통카드 * 학생1 + 현금 * 학생2 == 총요금 ) {
				System.out.println("교통카드 학생수 : " + 학생1);
				System.out.println("현금 학생수 : " + 학생2);
				run = false;
			}else {
				학생1 += 1;
				학생2 -= 1;				
			}
		}
	} 
}
