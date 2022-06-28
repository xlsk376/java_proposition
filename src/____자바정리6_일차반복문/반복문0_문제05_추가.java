package ____자바정리6_일차반복문;

import java.util.Random;

public class 반복문0_문제05_추가 {
	public static void main(String[] args) {
		/* 
		[문제]
		[반복가위바위보]	 	
			철수와 민수는 계단에서 가위바위보를 한다. 	 	
			철수와 민수는 각각 0 ~ 2 의 랜덤값을 저장한다.
			0 : 가위 , 1 : 바위 , 2 : 보를 뜻한다.	 
			철수와 민수는 50번째 계단의 위치에서 시작을 한다.
			룰은 다음과 같다.	
			이기면 3칸올라가기, 비기면 2칸올라가기, 지면 1칸올라가기.	 	
			둘중 아무나 100이상 도착하거나 둘사이의 간격이 10이상이면 게임은 종료된다. 
			게임이 종료될때까지 두사람의 이동경로를 출력하시오.
		*/
		
		Random ran = new Random();
		int win = 3;
		int same = 2;
		int lose = 1;
		int c = 50;
		int m = 50;
		while(true) {
			int r1 = ran.nextInt(3);
			int r2 = ran.nextInt(3);
			
			System.out.println(c + " " +m);
			if(r1 == 0 && r2 == 2) {
				c += win;
				m += lose;
			}else if(r1 == 1 && r2 == 0) {
				c += win;
				m += lose;
			}else if(r1 == 2 && r2 == 1) {
				c += win;
				m += lose;
			}else if(r1 == r2) {
				c += same;
				m += same;
			}else {
				m += win;
				c += lose;
			}
			if(c >= 100 || m >= 100 || c-m >= 10 || m-c >= 10) {
				System.out.println(c + " " + m);
				System.out.println("종료");
				break;
			}
			
		}
	
	}
}
