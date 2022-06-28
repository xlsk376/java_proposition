package ____자바정리8_이차반복문;

import java.util.Arrays;

/*
	[문제]
		arr1 과 arr2 각각의 값들이 모두 같은지 검사하시오.
		전부 같으면 true, 틀린 값이 하나라도 있으면 false를 출력하시오.
		단, 위치는 달라도 상관없다. 
		중복된값이 있을수있고 하나씩 만 매칭이된다.
	[정답]
		true
 */

public class 이차원반복문2_문제05_전부같은값 {
	public static void main(String[] args) {

		int[] arr1 = {1, 2, 3, 1, 2, 3};
		int[] arr2 = {3, 2, 1, 2, 3, 1};
				
		for(int i = 0; i < arr1.length; i++) {
			for(int j = i + 1; j < arr1.length; j++) {
				if(arr1[i] > arr1[j]) {
					int temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = i + 1; j < arr1.length; j++) {
				if(arr2[i] > arr2[j]) {
					int temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		boolean check = false;
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] == arr2[i]) {
				check = true;
			}else {
				check = false;
				break;
			}
		}
		System.out.println(check);
		
		
	} 
}