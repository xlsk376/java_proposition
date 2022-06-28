package ____자바정리8_이차반복문;

import java.util.Arrays;
import java.util.Random;

/*
	[숫자 야구 게임]		
	[1] com 배열에 0~9사이의 숫자 3개를 저장 단 com배열안에 중복값이 없어야한다.
	[2] me 배열에 0~9사이의 숫자 3개를 직접저장한다 단 me배열안에 중복값이 없어야한다.
	[3] com 과 me 를 비교해서 숫자가 같고 자리도 같으면 strike + 1;
	[4] com 과 me 를 비교해서 숫자가 같고 자리가 틀리면 ball + 1;
	[5] 사용자에게 strike 와 ball  개수를 출력한다. 
	매턴마다 위를 반복하면서 strike += 3 이 될때까지 반복한다.
	
*/
public class 이차원반복문2_문제07_숫자야구 {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] com = new int[3];
		int[] me = new int[3];

		for (int i = 0; i < com.length;) {
			int r = ran.nextInt(10);
			boolean check = false;
			for (int j = 0; j < com.length; j++) {
				if (com[j] == r) {
					check = true;
					break;
				}
			}
			if (check == false) {
				com[i] = r;
				i += 1;
			}
		}
		System.out.println("com : "+Arrays.toString(com));
		while (true) {
			System.out.println("---");
			for (int i = 0; i < me.length;) {
				int r1 = ran.nextInt(10);
				boolean check = false;
				for (int j = 0; j < me.length; j++) {
					if (me[j] == r1) {
						check = true;
						break;
					}
				}
				if (check == false) {
					me[i] = r1;
					i += 1;
				}
			}
			int s = 0;
			int b = 0;
			for(int i = 0; i < me.length; i++) {
				for(int j = 0; j < me.length; j++) {
					if(com[i] == me[j]) {
						if(i == j) {
							s += 1;
						}else {
							b += 1;
						}
					}
				}
			}
			System.out.println("com : "+Arrays.toString(com));
			System.out.println("me : "+Arrays.toString(me));
			System.out.println(s + " "+ b);
			if(s == 3) {
				break;
			}
		}
		
		// 조건에 맞는 무한 반복을 해주기, com배열 중복없이 저장, me배열(중복없이저장)은 com배열과 비교해서 strike가 3이 될때까지 변경된다.
		// 

	}
}
