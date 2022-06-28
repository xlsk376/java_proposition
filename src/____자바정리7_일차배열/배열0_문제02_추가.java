package ____자바정리7_일차배열;

import java.util.Arrays;
import java.util.Random;

public class 배열0_문제02_추가 {
	/*
	[문제]
		아래 배열의 랜덤값 1 ~ 9 사이의 랜덤값을 4개 저장한후 출력한다. 
		배열의 랜덤값이 모두 짝수면 true 출력하고,
		하나라도 짝수가 아니면 false를 출력한다.
		단, 0은 짝수이다.
		[예시] 
			[4, 6, 2, 0] true
			[5, 2, 0, 4] false
 */
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = new int[4];
		
		boolean check = true;
		for(int i = 0; i < 4; i++) {
			arr[i] = ran.nextInt(9)+1;
			if(arr[i] % 2 == 1) {
				check = false;
			}
		}
		System.out.println(Arrays.toString(arr));
		if(check == true) {
			System.out.println(check + "짝수배열");
		}else {
			System.out.println(check);
		}
	}
}
