package ____자바정리7_일차배열;

import java.util.Arrays;

/*
	[문제]
		arr배열의 값들을 순차적으로 절반은 temp1에 저장하고
		나머지 절반은 temp1에 저장한 뒤의 숫자부터 순차적으로 temp2에 저장하시오.
		단, arr의 배열의 길이가 홀수이면,
		temp1의 배열의 크기를 temp2 보다 개수가 한 개 만큼 더 크게 만들어서
		식을 진행하시오.
	[정답]
		temp1 = {12, 232, 3123, 14, 25}
		temp2 = {46, 27, 18, 569}
 */
public class 배열6_문제02_짧은배열만들기 {
	public static void main(String[] args) {	
		int[] arr = {12, 232, 3123, 14, 25, 46, 27, 18, 569};	
		int[] temp1 = null;
		int[] temp2 = null;
		int n = arr.length/2;
		temp1 = new int[n+1];
		temp2 = new int[n];
		int index = 0;
		for(int i = 0; i < temp1.length; i++) {
			temp1[i] = arr[index];
			index += 1;
		}
		for(int i = 0; i < temp2.length; i++) {
			temp2[i] = arr[index];
			index += 1;
		}
		System.out.println(Arrays.toString(temp1));
		System.out.println(Arrays.toString(temp2));
		
		
	}
}