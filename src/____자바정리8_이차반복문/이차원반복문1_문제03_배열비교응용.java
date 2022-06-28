package ____자바정리8_이차반복문;

import java.util.Arrays;

public class 이차원반복문1_문제03_배열비교응용 {
	/*
	  [문제] a 배열 안의 값들중에서 b배열의 값이 있으면 
		    a 와 b 의 각각 겹치는값중 b배열의 인덱스를 c에저장
		   	
	   [예] 
	   		b를 기준으로 인덱스를 저장하므로 0과 0,2이다.
		 	c = {0,2};
		
	 */
	public static void main(String[] args) {
		int a[] = {10,20,30,40};	
		int b[] = {10,5,20,9};
		int c[] = null;
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(a[i] == b[j]) {
					count += 1;
				}
			}
		}
		c = new int[count];
  		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(a[i] == b[j]) {
					c[i] = j;
					
				}
			}
		}
  		System.out.println(Arrays.toString(c));
  		
  		// 배열 a 와 배열 b를 비교하여 배열 b 기준으로 인덱스를 배열 c에 저장한다.
  		// 중복되는 인덱스를 찾아 새로운 배열 생성은 반복문을 두구간으로 나눠서 해줘야 한다.
		
	}

}
