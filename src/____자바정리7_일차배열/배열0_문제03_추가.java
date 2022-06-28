package ____자바정리7_일차배열;

import java.util.Arrays;

public class 배열0_문제03_추가 {
	/*
	[문제] d의 값을 번갈아가면서 e, f 에 각각 저장 
	[예]
		int d[] = {10,20,30,40,50,60};
		e = {10,30,50}
		f = {20,40,60}; 
*/
	public static void main(String[] args) {
		int d[] = {10,20,30,40,50,60};
		int e[] = {0,0,0};
		int f[] = {0,0,0};
		int index = 0;
		for(int i = 0; i < e.length; i++) {
			e[i] = d[index];
			index += 1;
			f[i] = d[index];
			index += 1;
		}
		System.out.println(Arrays.toString(e));
		System.out.println(Arrays.toString(f));
	}
}
