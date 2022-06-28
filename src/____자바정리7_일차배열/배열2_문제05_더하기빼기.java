package ____자바정리7_일차배열;

import java.util.Arrays;

/*
	[문제1] 
 		array1배열 과 array2배열의 각자리별 합을 temp1에저장
 		temp1 = {10 + 5 , 20 + 8, 30 + 54, 40 + 32, 50 + 1};		
	[문제2] 
 		array1배열 과 array2배열의 각자리별 차를 temp2에저장
 		temp2 = {10 - 5 , 20 - 8, 30 - 54, 40 - 32, 50 - 1};
*/
public class 배열2_문제05_더하기빼기 {
	public static void main(String[] args) {
		int array1[] = {10,20,30,40,50};
		int array2[] = {5,8,54,32,1};
		int temp1[] = new int[5];
		int temp2[] = new int[5];
		
		for(int i = 0; i< array1.length; i++) {
			temp1[i] = array1[i] + array2[i];
		}
		System.out.println(Arrays.toString(temp1));
		
		for(int i = 0; i < array1.length; i++) {
			temp2[i] = array1[i] - array2[i];
		}
		System.out.println(Arrays.toString(temp2));
	}
}
