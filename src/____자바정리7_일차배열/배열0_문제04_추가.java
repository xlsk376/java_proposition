package ____자바정리7_일차배열;

import java.util.Arrays;

public class 배열0_문제04_추가 {
	/*
	[문제] 
		a의 값을 순차적으로 c에 저장하고 ,
		그리고나서 b의 값을 c의 그뒤부터 자장
	[예] 
	 	int a[] = {10,20,30};
		int b[] = {40,50,60};
		
		int c[] = {10,20,30,40,50,60};
*/
	public static void main(String[] args) {
		int a[] = {10,20,30};
		int b[] = {40,50,60};
		int c[] = {0,0,0,0,0,0};
		int index = 0;
		for(int i = 0; i < a.length; i++) {
			c[index] = a[i];
			index += 1;
		}
		for(int i = 0; i < b.length; i++) {
			c[index] = b[i];
			index += 1;
		}
		System.out.println(Arrays.toString(c));
	}
}
