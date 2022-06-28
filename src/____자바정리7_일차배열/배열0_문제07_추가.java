package ____자바정리7_일차배열;

import java.util.Arrays;
import java.util.Random;

public class 배열0_문제07_추가 {

	public static void main(String[] args) {
		/*
		 *  두개의 변수 a, b에 숫자를 랜덤(1~9사이의 숫자)으로 저장한다.
		 *  두변수중 a 가 값이 더크면 arr1 배열에 저장한다.
		 *  b의 값이 더크면 arr2 배열에 저장한다. 
		 *  앞에서부터 순차적으로 저장한다. 
		 *  만약에 값이 같으면 둘다 저장한다. 
		 *  
		 *  총다섯번을 반복하고 배열출력 
		 *  
		 *  [예시]
		 *  	a : 7 , b : 3 ==> arr1 = {7,0,0,0,0}; arr2 = {0,0,0,0,0};
		 *  	a : 4 , b : 8 ==> arr1 = {7,0,0,0,0}; arr2 = {8,0,0,0,0};
		 *  	a : 2 , b : 6 ==> arr1 = {7,0,0,0,0}; arr2 = {8,6,0,0,0};
		 *  	a : 3 , b : 3 ==> arr1 = {7,3,0,0,0}; arr2 = {8,6,3,0,0};
		 */
		int arr1[] = new int[5];
		int arr2[] = new int[5];
		Random ran = new Random();
		int index1 = 0;
		int index2 = 0;
		for(int i = 0; i < 5; i++) {
			int a = ran.nextInt(9)+1;
			int b = ran.nextInt(9)+1;
			System.out.println(a + " " + b);
			if(a > b) {
				arr1[index1] = a;
				index1 += 1;
			}else if(a == b){
				arr1[index1] = a;
				arr2[index2] = a;
				index1 += 1;
				index2 += 1;
			}else {
				arr2[index2] = b;
				index2 += 1;
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}
