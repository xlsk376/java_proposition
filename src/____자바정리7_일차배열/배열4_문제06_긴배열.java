package ____자바정리7_일차배열;

import java.util.Arrays;

/*
	[문제1] a의 을 전부  c에 저장한후, 다시 b의값을 c에 저장한다.
	[예] 
	int a[] = {10,20,30};
	int b[] = {40,50,60};
	c = {10,20,30,40,50,60}
*/
public class 배열4_문제06_긴배열 {
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
