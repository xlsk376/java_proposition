package ____자바정리7_일차배열;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
	[주사위]
		1. 플레이어는 [p1]과 [p2] 2명이다. 한번씩 번갈아 가면서 행동한다. 
		2. [1.주사위][2.패스] 를 선택할수있다. 주사위는 (1~4)의 랜덤값을 가진다. 
		3. 주사위숫자만큼 현재위치에서 앞으로 이동한다. 
		4. 이동한자리가 다른 플레이어와 같은 위치에 놓이게 되면, 상대 플레이어는 잡히게 되어 맨앞(인덱스 0) 으로 강제 이동된다.
		5. 상대를 잡은 위치가 맨앞(인덱스 0)의 위치에 있을때는 안전지대이다.(잡히지않는다.)
		6. 이동거리가 배열의 마지막위치를 초과하면,맨앞(인덱스 0)으로 이동하고 초과한숫자만큼 추가이동한다.
		7. 먼저 3바퀴를 돌면 이긴다.
		[p1] 주사위 : 1
		1 0 0 0 0 0 0 0 0 0
		2 0 0 0 0 0 0 0 0 0
  
		[p2] 주사위 : 3
		0 1 0 0 0 0 0 0 0 0
		0 0 0 2 0 0 0 0 0 0
		 
		[p1] 주사위 : 2
		[p1]이 [p2]를 잡았다!
		0 0 0 0 1 0 0 0 0 0
		2 0 0 0 0 0 0 0 0 0 
*/
public class 배열8_문제03_철수마블 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		int[] map1   = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] map2   = {2, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int p1 = 0;
		int p2 = 0;
		int p1Count = 0;
		int p2Count = 0;
		int turn = 1;
		Random ran = new Random();
		while(true) {
			System.out.println("p1 : " + p1Count + "바퀴");
			System.out.println("p2 : " + p2Count + "바퀴");
			System.out.println(Arrays.toString(map1));
			System.out.println(Arrays.toString(map2));
			System.out.println("[1]주사위 [2]패스");
			
			if(p1Count == 3 || p2Count == 3) {
				if(p1Count == 3) {
					System.out.println("p1 승리");
				}else {
					System.out.println("p2 승리");
				}
				break;
			}					
			if(turn % 2 == 1) {
				int r = ran.nextInt(2) + 1;
				if(r == 1) {
					r = ran.nextInt(4) + 1;
					map1[p1] = 0;
					p1 += r;
					if(p1 >= map1.length) {
						p1 -= map1.length;
						p1Count += 1;
					}										
					map1[p1] = 1;		
					System.out.println(r + "만큼 이동합니다.");
				}else {
					System.out.println("패스합니다.");
				}
				turn += 1;
			}else {
				int r = ran.nextInt(2) + 1;
				if(r == 1) {
					r = ran.nextInt(4) + 1;
					map2[p2] = 0;
					p2 += r;
					if(p2 >= map2.length) {
						p2 -= map2.length;
						p2Count += 1;
					}										
					map2[p2] = 2;		
					System.out.println(r + "만큼 이동합니다.");
				}else {
					System.out.println("패스합니다.");
				}
				turn += 1;
			}
			if(p1 == p2 && p1 != 0 && p2 != 0) {
				if(turn  % 2 == 1) {
					System.out.println("p1 잡혔다.");
					map1[p1] = 0;
					p1 = 0;
					map1[p1] = 1;
					
				}else {
					System.out.println("p2 잡혔다.");
					map2[p2] = 0;
					p2 = 0;
					map1[p2] = 1;
				}
			}	
		}
	}
}
