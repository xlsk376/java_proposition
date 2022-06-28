package ____자바정리7_일차배열;

import java.util.Arrays;

/*
	[문제2] 다음 리스트를 이용해서 a 의 값중 홀수만 c 에 저장
	[조건] 위치는 뒤에서 부터 저장한다. 
	[예]   c = { 0, 0, 17, 51, 49 }
 */
public class 배열4_문제04_홀수거꾸로저장 {	
	public static void main(String[] args) {
		int arr[] = { 10, 49, 51, 36, 17 };	
		int c[] = { 0,0,0,0,0 };

		int index = arr.length-1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 1) {
				c[index] = arr[i];
				index -= 1;
			}
		}
		System.out.println(Arrays.toString(c));
		
		
	}
}
