package ____자바정리7_일차배열;

import java.util.Arrays;
import java.util.Random;

/*
	[문제]
		아래배열에 랜덤으로 0~9사이의 숫자를 각각 저장한다. 
		한배열의 각각의 값들중 홀수만 전부모아서 하나의 숫자로표현 후 출력
	
	(예) 
		arr1 ==> 1,5,4,4,0  ==> 에서 홀수만 모으면 15 이라고생각하고,
	 	15 출력 
*/  
public class 배열3_문제04_훌수숫자만들기 {
	public static void main(String[] args) {
		int arr1[] = new int[5];
		Random ran = new Random();
		int temp[] = null;
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = ran.nextInt(10);
		}
		System.out.println(Arrays.toString(arr1));
		int index = 0;
		int count = 0;
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] % 2 == 1) {
				count += 1;
			}
		}
		temp = new int[count];
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] % 2 == 1) {
				temp[index] = arr1[i];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(temp));
		
		
		
		
	}
}
