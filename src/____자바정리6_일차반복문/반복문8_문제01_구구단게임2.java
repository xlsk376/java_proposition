package ____자바정리6_일차반복문;

import java.util.Random;
import java.util.Scanner;
/*
	[랜덤구구단 게임] (반복문사용)
		1. 랜덤구구단 게임을 10회 반복한다.
		2. 정답을 맞추면 1문제당 10점이다.
		3. 게임 종료 후, 성적을 출력한다.
		4. 단, 3번연속으로틀리면 즉시종료하며 0점이된다.
*/
public class 반복문8_문제01_구구단게임2 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);	
		int i = 1;
		int score = 0;
		int combo = 0;
		while(true) {
			if(i == 10) {
				break;
			}
			int a = ran.nextInt(8) + 2; // 0~7 + 2
			int b = ran.nextInt(9) + 1; // 0~8 + 1
			int c  = a * b;
			System.out.printf("%d * %d = " , a , b);
			int me = scan.nextInt();
			if(c == me) {
				score += 10;
				System.out.println("정답");
				combo = 0;
			}else {
				System.out.println("오답");
				combo += 1;
				if(combo == 3) {
					System.out.println("연속실패 : " + combo);
					score = 0;
					break;
				}
			}		
			i += 1;
			
		}
		System.out.println("점수 : " + score);
		scan.close();
	}
}
