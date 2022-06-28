package ____자바정리8_이차반복문;

import java.util.Random;
import java.util.Scanner;

/* 
  [틱택토]
  
 	조건1) 구글 크롬에 "틱택토" 검색후 게임을 한번하고 
  	          아래와같이 만들어보기.
   조건2) P1 , P2 를 플레이어가 번갈아가면서 플레이.
   조건3) 먼저 한줄을 완성하면 승리
   [추천조건] P2 는 com으로 대체해보자.(com은 랜덤으로 플레이)
 
  [처음화면]
  0,0,0
  0,0,0
  0,0,0
  [p1]인덱스 입력 : 6
  =============
  [1턴]
  0,0,0
  0,0,0
  1,0,0
  [p2]인덱스 입력 : 1
  =============
  [2턴]
  0,2,0
  0,0,0
  1,0,0
  [p1]인덱스 입력 : 3
  =============
  [3턴]
  0,2,0
  1,0,0 
  1,0,0
  [p2]인덱스 입력 : 2
  =============
  [4턴]
  0,2,2
  1,0,0
  1,0,0
  [p1]인덱스 입력 : 0
  =============
  [5턴]
  1,2,2
  1,0,0
  1,0,0
  [p1] 승리
  
 */
public class 이차원반복문3_문제04_틱택토 {
	public static void main(String[] args) {
		int[] tic = new int[9];
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int turn = 1;
		int count1 = 0;
		int count2 = 0;
		int a = 0; // 가로
		int b = 0; // 세로
		int c = 0; // 대각선
		while (true) {
			for (int i = 0; i < tic.length; i++) {
				System.out.print(tic[i] + " ");
				if (i % 3 == 2) {
					System.out.println();
				}
			}
			if (a == 1 || b == 1 || c == 1) {
				if(turn == 1) {
					System.out.println("p2 승리");
				}else if(turn == 2) {
					System.out.println("p1 승리");
				}
				break;
			}
//			if(count1 == 4 && count2 == 4) { //무승부 : 4개, 4개 뒀을때 안끝나면 무승부, 선플레이어가 5개 둠
//				System.out.println("무승부");
//				break;
//			}
			if (turn == 1) { // p1
				System.out.println("ME turn");
				int me = scan.nextInt();
				boolean check = false;
				for (int i = 0; i < tic.length; i++) {
					if (tic[i] == 1 || tic[i] == 2) {
						if (i == me) {
							System.out.println("다시 선택하세요.");
							check = true;
							break;
						}
					} else if (tic[i] == 0) {
						if (i == me) {
							check = false;
						}
					}
				}
				if (check == false) {
					tic[me] = 1;
					turn = 2;
					count1 += 1;
				}
			} else if (turn == 2) { // p2
				System.out.println("COM turn");
				// int com = ran.nextInt(tic.length);
				int com = scan.nextInt();
				boolean check = false;
				for (int i = 0; i < tic.length; i++) {
					if (tic[i] == 1 || tic[i] == 2) {
						if (i == com) {
							System.out.println("다시 선택하세요.");
							check = true;
							break;
						}
					} else if (tic[i] == 0) {
						if (i == com) {
							check = false;
						}
					}
				}
				if (check == false) {
					tic[com] = 2;
					turn = 1;
					count2 += 1;
				}
			}
			// 승리 : 0,1,2 / 3,4,5 / 6,7,8 / 0,3,6 / 1,4,7 / 2,5,8 / 0,4,8 / 2,4,6
			// 무승부 : 4개, 4개 뒀을때 안끝나면 무승부, 선플레이어가 5개 둠
			// 0 일떄 1,2 / 3,6 / 4,8
			// 6 7 8
			// 3 4 5
			// 0 1 2
			int c1 = 0;
			int c2 = 0;
			for (int i = 0; i < tic.length; i++) { // 0,1,2 / 3,4,5 / 6,7,8 // 가로
				if (tic[i] == 1) {
					c1 += 1;
				} else if (tic[i] == 2) {
					c2 += 1;
				} else {
					c1 = 0;
					c2 = 0;
				}
				if (c1 == 3 || c2 == 3) {
					a = 1;
				}
				if (i % 3 == 2) {
					c1 = 0;
					c2 = 0;
				}
			}
			int index1 = 0;
			int index2 = 0;
			for (int i = 0; i < 3; i++) { // 0 3 6 / 1 4 7 / 2 5 8 // 세로
				if (tic[i] == 1) {
					index1 = i;
					int c3 = 0;
					if (index1 <= 2) {
						for (int j = index1; j < tic.length; j += 3) {
							if (tic[j] == 1) {
								c3 += 1;
								//System.out.println(c3);
							}
//							else {
//								count2 = 0;
//							}
							if (c3 == 3) {
								b = 1;
							}
						}
					}
				} else if (tic[i] == 2) {
					index2 = i;
					int c4 = 0;
					if (index2 <= 2) {
						for(int j = index2; j < tic.length; j+=3) {
							if(tic[j] == 2) {
								c4 += 1;
							}
							if(c4 == 3) {
								b = 1;
							}
						}

					}
				}
			}
			int c5 = 0;
			int c6 = 0;
			for(int i = 0; i < tic.length; i++) { // 0,4,8 / 2,4,6 // 대각선
				if(tic[i] == 1 && i % 2 == 0) {
					c5 += 1;
				}else if(tic[i] == 2 && i % 2 == 0) {
					c6 += 1;
				}
				if(c5 == 3 || c6 == 3) {
					c = 1;
				}
			}

		}

	}
}
