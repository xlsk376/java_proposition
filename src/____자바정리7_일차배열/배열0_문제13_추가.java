package ____자바정리7_일차배열;

import java.util.Arrays;
import java.util.Random;

public class 배열0_문제13_추가 {

	public static void main(String[] args) {
		/*
		[문제]
			temp1 의 배열의 값들과 
			temp2 의 배열의 값들을  합친 개수만큼 arr 배열을 생성한후, 
			
			temp1 의 배열의 값과 temp2배열의 값을 교차로 arr 에 저장후 temp2가 개수가 더적으므로 전부 저장하고 나면
			나머지는 temp1 배열의 값을 저장한다. 
		[정답]	
			arr = {10,600,20,700,30,800,40,900,50,60,70}
	 */
			
		int[] temp1 = {10,20,30,40,50,60,70};
		int[] temp2 = {600,700,800,900};
		int[] arr = null;
		arr = new int[temp1.length+temp2.length];
		int index = 0;
		for(int i = 0; i < temp2.length; i++) {
			arr[index] = temp1[i];
			index += 1;
			arr[index] = temp2[i];
			index += 1;
		}
		System.out.println(Arrays.toString(arr));
		for(int i = temp2.length; i < temp1.length; i++) {
			arr[index] = temp1[i];
			index += 1;
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
	
	}
}
