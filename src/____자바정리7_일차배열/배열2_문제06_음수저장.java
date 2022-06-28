package ____자바정리7_일차배열;

import java.util.Arrays;
import java.util.Random;

/*
	아래 배열에 랜덤값 -100 ~ 100을 4개 저장후 그값중 음수만 temp에 저장후 arr과 temp 출력.
	
	예) arr = { 20, 43, -11, 36 };
	 	temp = {0,0,-11,0};
*/
public class 배열2_문제06_음수저장 {
	public static void main(String[] args) {		
		int arr[] = new int[4];
		int temp[] = new int[4];
		Random ran = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(201)-100;
			if(arr[i] < 0) {
				temp[i] = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		
		
		
		
	}
}
