package ____자바정리7_일차배열;

import java.util.Arrays;
import java.util.Random;

/*
	아래의 배열은 철수의 마블을 배열로 표현한것이다.
	p1은 철수이고 p2는 민수를 뜻한다. 
	지금은 p1의 차례이고 
	주사위를 던저서 랜덤으로 (1~6)이 나오게된다. 
	철수는 현재 6의 위치에 있고,
 	철수의 위치는 주사위 숫자만큼 앞으로 이동한다.
	[조건]
		[1]	철수가 민수의 위치에 도달하면 민수는 잡힌것이되어서 맨앞으로 이동한다.
		[2] 철수의 현위치와  주사위의 합이 배열의 길이를 넘어가면 
			철수는 맨앞으로 이동하고 초과한숫자만큼 더이동한다. 
 */
public class 배열7_문제05_철수마블잡기 {
	public static void main(String[] args) {
		int p1[] = { 0, 0, 0, 0, 0, 0, 1, 0, 0 ,0};
		int p2[] = { 0, 0, 0, 0, 0, 0, 0, 0, 2 ,0};
		int dice = 0;
		Random ran = new Random();
		int c = 0;
		int m = 0;
		for(int i = 0; i < p1.length; i++) { // 시작위치
			if(p1[i] == 1) {
				c = i;
			}
			if(p2[i] == 2) {
				m = i;
			}
		}
		boolean check = false;
		int win1 = 0;
		int win2 = 0;
		
		while(true) {
			System.out.println("p1 : " + Arrays.toString(p1));
			System.out.println("p2 : " + Arrays.toString(p2));
			dice = ran.nextInt(6)+1;
			System.out.println("주사위 : " + dice);
			if(check == false) {
				System.out.println("p1 turn");
				p1[c] = 0;
				c += dice;
				if(c >= p1.length) {
					c -= p1.length;
					p1[c] = 1;
					win1 += 1;
				}else {
					p1[c] = 1;
				}
				if(c == m) {
					p2[m] = 0;
					m = 0;
					p2[m] = 2;
				}
				check = true;
			}
			else {
				System.out.println("p2 turn");
				p2[m] = 0;
				m += dice;
				if(m >= p2.length) {
					m -= p2.length;
					p2[m] = 2;
					win2 += 1;
				}else {
					p2[m] = 2;
				}
				if(c == m) {
					p1[c] = 0;
					c = 0;
					p1[c] = 1;
				}
				check = false;
			}
			if(win1 == 3 || win2 == 3) {
				System.out.println("p1 : " + Arrays.toString(p1));
				System.out.println("p2 : " + Arrays.toString(p2));
				break;
			}
		}
		
	}
}
