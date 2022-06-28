package ____자바정리8_이차반복문;

import java.util.Arrays;

public class 이차원반복문2_문제11_배열두개정렬 {
	/*
	 * [정렬]
	     두 배열을 하나로 합치고 오름차순으로정렬하시오.	
		 예) 1,2,3,5,7,8,9,10,12,15,19,20
	 */
	public static void main(String[] args) {
		int[] arr1 = {9,10,3,2,20,19};
		int[] arr2 = {15,12,1,5,7,8};	
		int[] temp = null;
		int size1 = arr1.length;
		int size2 = arr2.length;
		
		temp = new int[size1 + size2];
		int count = 0;
		for(int i = 0; i < temp.length; i++) {
			if(i < arr1.length) { // i : 0 ~ 5
				temp[i] = arr1[i];
			}else {
				temp[i] = arr2[i - arr1.length]; // i : 6 ~ 11
			}
			count += 1;
		}
		System.out.println(Arrays.toString(temp));
		
		for(int i = 0; i < temp.length; i++) {
			for(int j = i + 1; j < temp.length; j++) {
				if(temp[i] > temp[j]) {
					int t = temp[i];
					temp[i] = temp[j];
					temp[j] = t;
				}
				count += 1;
			}
		}
		System.out.println(count + "회차 ");
		System.out.println(Arrays.toString(temp));
		
		//반복횟수를 줄이는 방법 체크 => j = i + 1;
		
	}
		
}
