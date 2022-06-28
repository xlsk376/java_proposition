package ____자바정리7_일차배열;

import java.util.Arrays;
import java.util.Random;

/*
	[문제]
		array 배열에 -100~100사이의 랜덤값중 홀수만 5개 저장한다. 
		그중 가장작은값의 인덱스와 값을 출력한다. 
*/
public class 배열3_문제07_가장작은값 {
	public static void main(String[] args) {
		int array[] = new int[5];
		Random ran = new Random();
		int max = 0;
		int index = 0;
		for(int i = 0; i < 5;) {
			int r = ran.nextInt(201)-100;
			if(r % 2 == 1 || r % 2 == -1) {
				array[i] = r;
				if(max < array[i]) {
					max = array[i];
				}
				i += 1;
			}
		}
		System.out.println(Arrays.toString(array));
		int min = max;
		for(int i = 0; i < 5; i++) {
			if(min > array[i]) {
				min = array[i];
				index = i;
			}
		}
		System.out.println(min + " " + index);
		
	}
}
