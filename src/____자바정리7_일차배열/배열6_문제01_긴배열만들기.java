package ____자바정리7_일차배열;

import java.util.Arrays;

/*
	[문제]
		temp1 의 배열의 값들과 
		temp2 의 배열의 값들을  합친 개수만큼 arr 배열을 생성한후, 
		temp1 배열의 값들을 순차적으로 arr 에저장하고 , 
		temp2의 배열의 값들을  순차적으로 arr 에 저장한후 출력.	
	[정답]	
 */
public class 배열6_문제01_긴배열만들기 {
	public static void main(String[] args) {
		int[] temp1 = {1,2,3,4,5};
		int[] temp2 = {4,5,6,7,8,9};
		int[] arr = null;
		arr = new int[temp1.length+temp2.length];
		int index = 0;
		for(int i = 0; i < temp1.length; i++) {
			arr[index] = temp1[i];
			index += 1;
		}
		for(int i = 0; i < temp2.length; i++) {
			arr[index] = temp2[i];
			index += 1;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}