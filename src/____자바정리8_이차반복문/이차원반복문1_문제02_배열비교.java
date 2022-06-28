package ____자바정리8_이차반복문;

import java.util.Arrays;

public class 이차원반복문1_문제02_배열비교 {
	/*
	  [문제] a 배열과  배열을 서로 비교해서 
		    a 와 b 의 각각 겹치는값을  c 에저장
		    단, 앞에서부터 저장
		 
		[예] 
		 	c = {10,20,0,0}
		
	 */
	public static void main(String[] args) {
		int a[] = {10,20,30,40};	
		int b[] = {10,5,20,9};
		int c[] = new int[4];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(a[i] == b[j]) {
					c[i] = b[j];
				}
			}
		}
		System.out.println(Arrays.toString(c));
		
		// 배열 a 기준으로 배열 b의 값과 겹치게 되면 배열 b의 값을 배열 c에 넣어준다.
	}

}
