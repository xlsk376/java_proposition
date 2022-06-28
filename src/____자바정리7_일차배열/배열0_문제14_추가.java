package ____자바정리7_일차배열;

import java.util.Arrays;
import java.util.Random;

public class 배열0_문제14_추가 {

	public static void main(String[] args) {
		/*
		[문제]
			temp1 의 배열의 값들과 
			temp2 의 배열의 값들을  합친 개수만큼 arr 배열을 생성한후, 
			temp1 배열의 값들을 순차적으로 arr 에 저장하고, 
			temp2의 배열의 값들을  순차적으로 arr 에 저장한후 출력.	
		[정답]	
		
			arr = {10,20,30,40,400,500,600,700,800,900};
		
		*/
			
		int[] temp1 = {10,20,30,40};
		int[] temp2 = {400,500,600,700,800,900};
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
