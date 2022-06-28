package ____자바정리7_일차배열;

import java.util.Arrays;
import java.util.Random;

/*
	[문제]
		아래 배열의 랜덤값 -100 ~ 100 사이의 랜덤값을 4개 저장한다.
		배열의 랜덤값이 모두 짝수면 true 출력하고,
		하나라도 짝수가 아니면 false를 출력한다.
		단, 0은 짝수이다.
 */
public class 배열3_문제09_배열짝수 {
	public static void main(String[] args) {
		
		int arr[] = new int[4];
		Random ran = new Random();
		boolean check = true;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(201)-100;
			if(arr[i] % 2 == 1 || arr[i] % 2 == -1) {
				check = false;
			}
		}
		System.out.println(Arrays.toString(arr));
		if(check == false) {
			System.out.println(check);
		}else {
			System.out.println(check + " 짝수");
		}
		
		
		
	} 
}