package ____자바정리7_일차배열;

import java.util.Arrays;
import java.util.Random;

/*
	[문제] a 배열안에 1 또는 7만 랜덤으로 저장후 출력. 
		만약에 7이 연속으로 3개면 당첨 아니면 꽝
	[예] 1,7,7,1,1,7,7
	
 */
public class 배열3_문제01_복권만들기 {	
	public static void main(String[] args) {
		int a [] = new int[7];
		Random ran = new Random();
		int count = 0;
		boolean check = false;
		for(int i = 0; i < a.length; i++) {
			int r = ran.nextInt(2);
			if(r == 0) {
				a[i] = 1;
				count = 0;
			}else {
				a[i] = 7;
				count += 1;
			}
			if(count == 3) {
				check = true;
			}
		}
		System.out.println(Arrays.toString(a));
		if(check == true) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝");
		}
		
		
	}
}
