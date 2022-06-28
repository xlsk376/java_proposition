package ____자바정리7_일차배열;

import java.util.Arrays;
import java.util.Random;

/*
	bingo 배열을 3줄마다 줄바꿈을 하여 출력하면 아래와 같다.
	
	0,0,1,
	0,0,1,
	1,1,1,
	
	가로나 세로의 값1이 연속으로 3개면 빙고이다. 
	bingo 배열은 빙고가 2개 인것이다.
	
	[문제]
		[1] test 배열에 0 또는 1을 랜덤으로 저장한후 3줄마다 줄바꿈하여 출력한다.
		[2] 빙고의 개수 출력 
 */
public class 배열7_문제04_빙고판정 {
	public static void main(String[] args) {
		int bingo[] = {
			0,0,1,
			0,0,1,
			1,1,1,
		};
		
		int test[] = new int[9];
		Random ran = new Random();
		for(int i = 0; i < test.length; i++) {
			test[i] = ran.nextInt(2);
			System.out.print(test[i] + " ");
			if(i % 3 == 2) {
				System.out.println();
			}
		}
		int count1 = 0;
		int a = 0;
		for(int i = 0; i < test.length; i++) { // 빙고 조건 : 0 1 2 / 3 4 5 / 6 7 8 
			if(test[i] == 1) {
				count1 += 1;
			}else {
				count1 = 0;
			}
			if(count1 == 3) {
				a += 1;
			}
			if(i % 3 == 2) {
				count1 = 0;
			}
		}
		int index = 0;
		int b = 0;
		for(int i = 0; i < 3; i++) { // 0 3 6 / 1 4 7 / 2 5 8
			if(test[i] == 1) {
				index = i;
				int count2 = 0;
				if(index <= 2) {
					for(int j = index; j < test.length; j+=3) {
						if(test[j] == 1) {
							count2 += 1;
							//System.out.println(count2);
						}
//						else {
//							count2 = 0;
//						}
						if(count2 == 3) {
							b += 1;
							
						}
					}
				}
			}
		}
		
		if(a >= 1 || b >= 1) {
			System.out.println("빙고 : " + (a+b));
			System.out.println(a + " " + b);
		}else {
			System.out.println("아니다!!");
		}
		
		
	}
}
