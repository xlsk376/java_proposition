package ____자바정리7_일차배열;

import java.util.Arrays;
/*
	[문제] 
	아래 배열 c는 번호와 값이 한쌍인 배열이다. 
	번호를 하나를 입력받고 c배열에 있는 번호이면, 
	그번호와  값만 제외하고 d배열에 복사한다.
	[예] 1002 ==> d[] = {1001, 40, 1003, 70};
 */
public class 배열6_문제05_가로배열삭제후저장 {
	public static void main(String[] args) {	
		int c[] = { 1001, 40, 1002, 65, 1003, 70 };
		int d[] = null;
		int index = -1;
		int number = 1002;
		for(int i = 0; i < c.length; i++) {
			if(c[i] == number) {
				index = i;
			}
		}
		if(index == -1) {
			System.out.println("찾는번호가 없습니다.");
		}else {
			
			int dindex = 0;
			for(int j = 0; j < c.length; j+=2) {
				if(index != j) {
					d[dindex] = c[j];
					d[dindex +1] = c[j+1];
					dindex += 2;
				}
			}		
		}
		System.out.println(Arrays.toString(d));
	}
}
