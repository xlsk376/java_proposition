package ____자바정리7_일차배열;

import java.util.Arrays;
import java.util.Random;

/*
	[문제] 
		a 배열안에 1 또는 7만 랜덤으로 저장후 출력. 
		단, 7의 개수는 3개여야한다.
		전부 랜덤위치여야한다.
	[예]
		정답 { 1, 7, 7, 1, 1, 7, 1};
		오답 { 7, 1, 1, 7, 1, 1, 1};
*/
public class 배열3_문제06_랜덤숫자제한 {	
	public static void main(String[] args) {
		int a [] = new int[7];
		Random ran = new Random();
		int c1 = 0;
		int c7 = 0;
		for(int i = 0; i < a.length;) {
			int r = ran.nextInt(2);
			if(r == 0 && c7 < 3) {
				a[i] = 7;
				i += 1;
				c7 += 1;
			}else if(r == 1 && c1 < 4){
				a[i] = 1;
				i += 1;
				c1 += 1;
			}
			if(c1 == 4 && c7 == 3) {
				break;
			}
			
		}
		System.out.println(Arrays.toString(a));
	}
}
