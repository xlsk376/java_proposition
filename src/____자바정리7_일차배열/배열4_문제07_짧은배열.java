package ____자바정리7_일차배열;

import java.util.Arrays;

/*
	[문제] d의 값을 순차적으로 e에저장후 , 남은값은 f에 저장한다. 
	[예]
	int d[] = {10,20,30,40,50,60};
	e = {10,20,30}
 	f = {40,50,60};
 */
public class 배열4_문제07_짧은배열 {
	public static void main(String[] args) {
		int d[] = {10,20,30,40,50,60};
		int e[] = {0,0,0};
		int f[] = {0,0,0};
		int index = 0;
		for(int i = 0; i < e.length; i++) {
			e[i] = d[index];
			index += 1;
		}
		for(int i = 0; i < f.length; i++) {
			f[i] = d[index];
			index += 1;
		}
		System.out.println(Arrays.toString(e));
		System.out.println(Arrays.toString(f));
	}
}
