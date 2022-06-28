package ____자바정리6_일차반복문;

import java.util.Random;
/* 
	[철수의마블]
		철수는 마블게임을 하고있다. 	
		0~20까지의 지점이 있고 철수는 0의 위치에 있다. 
		20이 넘어가면 게임종료이다. 
		주사위는 1~6사이의 숫자가 나온다.	
		3의 배수의 자리는 함정이다.(3,6,9,12,15,18) 
		함정에서는 한번더 주사위를 던지고 4이상의 숫자가 나오면 함정탈출이되며 한칸 앞으로 전진한다.
		함정에 실패하면 뒤로 한칸 물러나게된다. 	
		철수가 게임을 끝날때까지 철수의 이동경로를 전부 출력하시오.
*/
public class 반복문7_문제04_철수의마블2 {
	public static void main(String[] args) {
		Random ran = new Random();
		int 철수 = 0;
		while(true) {
			if(철수 >= 20) {
				System.out.println("종료");
				break;
			}
			int r = ran.nextInt(6) + 1;
			System.out.println("주사위에서 " + r + "이 나왔습니다.");
			철수 += r;
			System.out.println("철수 : " + 철수);
			if(철수 % 3 == 0) {
				r = ran.nextInt(6) + 1;
				System.out.println("[함정] 주사위에서 " + r + "이 나왔습니다.");
				if(r >= 4) {
					철수 += 1;
					System.out.println("[함정탈출성공]");
				}else {
					철수 -= 1;
					System.out.println("[함정탈출실패]");
				}
				System.out.println("철수 : " + 철수);
			}
		}
	}
}
