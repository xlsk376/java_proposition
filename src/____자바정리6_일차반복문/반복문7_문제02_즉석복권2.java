package ____자바정리6_일차반복문;

import java.util.Random;
/*
	[즉석복권]
		랜덤으로 1또는 7 을 10번출력한다. 
		7이 연속으로 3번이상이면 "당첨" 아니면 "꽝" 출력하시오.
	[예시]
		7 7 1 1 1 7 1 : 꽝
		1 7 7 7 1 1 7 : 당첨
*/
public class 반복문7_문제02_즉석복권2 {
	public static void main(String[] args) {
		Random ran = new Random();
		int count = 0;
		boolean win = false;
		for(int i = 0; i < 7; i++) {
			int r = ran.nextInt(2);
			if(r == 0) {
				System.out.print(7 + " ");
				count += 1;
				if(count == 3) {
					win = true;
				}
			}else {
				System.out.print(1 + " ");
				count = 0;
			}
		}
		if(win) {
			System.out.println(" : 당첨");
		}else {
			System.out.println(" : 꽝");
		}
		
	} 
}
