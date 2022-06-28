package ____자바정리9_이차배열;

import java.util.Arrays;
import java.util.Random;
/*
[경마 게임]
[1] 5 * 20 의 배열이 있다.
[2] 각 줄은 말이 달릴 트랙을 의미한다.
[3] 매 턴당 랜덤으로 1~4칸의 거리를 이동할수있다.
[4] 말이 전부 도착하면 게임은 끝난다. 각말들의 순위를 출력한다. 
[5] 단, 말이 동시에 도착하면 등수는 같다. 
*/
public class 이차원배열5_문제01_경마 {
	
	public static void main(String[] args) {
		
		int size = 5;
		int len = 20;
		int map[][] = new int[size][len];
		int total[] = new int[size];
		Random ran = new Random();		
		for(int i = 0; i < len; i++) {			
			for(int j = 0; j < size; j++) {
				int r = ran.nextInt(4) + 1;
				if(total[j] < 20) {
					map[j][i] = r;
					total[j] += r;
				}	
			}	
		}
		for(int i = 0; i < size; i++) {
			System.out.println(Arrays.toString(map[i]));
		}
		
		//출력 
		total = new int[size];
		int show[][] = new int[size][len];
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < size; j++) {

				if(total[j] < 20) {
					show[j][total[j]] = 0;
				}
				total[j] += map[j][i];
				
				if(total[j] < 20) {
					show[j][total[j]] = 1;
				}else {
					show[j][len-1] = 1;
				}
				
			}
			System.out.println("---------------------------------------------------------------------------");
			for(int x = 0; x < size; x++) {
				for(int y = 0; y < len; y++) {
					if(show[x][y] == 1) {
						System.out.print("[" + (x + 1) + "]");
					}else {
						System.out.print("[ ]");
					}
				}
				System.out.println();
			}
			boolean check = false;
			for(int j = 0; j < size; j++) {
				if(total[j] < len-1) {
					check = true;
					break;
				}
			}
			if(check == false) {
				break;
			}						
		}				
	}
}
