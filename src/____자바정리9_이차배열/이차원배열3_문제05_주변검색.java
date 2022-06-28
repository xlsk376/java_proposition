package ____자바정리9_이차배열;

import java.util.Arrays;
/* 
		mine = {0,9,0},
			   {9,0,9},
			   {0,0,9}
				  
		위 mine배열의 숫자 0의 자리에 숫자를 저장할려고한다.
		저장할숫자는 주변 8방향을 검사후 9의 개수를 저장후출력.
				
		예) 아래와 같이 출력  
			   {2,9,2},
			   {9,4,9},
			   {1,3,9}

*/
public class 이차원배열3_문제05_주변검색 {	

	public static void main(String[] args) {
		int mine[][] = {
				{0,9,0},
				{9,0,9},
				{0,0,9}
		};

		for(int i = 0; i < mine.length; i++) {
			for(int j = 0; j < mine[i].length; j++) {
				if(mine[i][j] == 0) {
					int y = i - 1;
					int x = j - 1;
					int count = 0;
					for(int i2 = y; i2 <= y + 2; i2++) {
						for(int j2 = x; j2 <= x + 2; j2++) {
							if(i2 == 0 && j2 == 0) {
								continue;
							}
							if(i2 < 0 || j2 < 0 || i2 >= mine.length || j2 >= mine[i].length) {
								continue;
							}
							if(mine[i2][j2] == 9) {
								count += 1;
							}
						}
					}
					mine[i][j] = count;
				}
			}
		}
		for(int i = 0; i < mine.length; i++) {
			System.out.println(Arrays.toString(mine[i]));
		}
		
		
		
	}
}
