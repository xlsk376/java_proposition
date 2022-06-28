package ____자바정리8_이차반복문;

import java.util.Arrays;

public class 이차원반복문4_문제03_인풋삽입 {
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		
		int indexList[] = {2,1,0,3};
		int valueList[] = {60,70,80,90};
		/*
		 * arr 배열에 vlaue의 값을 삽입할예정이다 
		 * 위치는 index 의 위치에 삽입한다. 
		 * 
		 */
		
		/*
		 * [1] index = 2 , value = 60
		 *    	{10,20,60,30,40};
		 *   
		 * [2] index = 1 , value = 70
		 * 	  	{10,70,20,60,30}
		 * 
		 * [3] index = 0 , value = 80
		 * 		{80,10,70,20,60}
		 * 
		 * [4] index = 3 , value = 90
		 * 		{80,10,70,90,20}
		 * 
		 */
		for(int i = 0; i < indexList.length; i++) {
			int index = arr.length-1;
			for(int j = indexList[i]; j < arr.length-1; j++) {
				arr[index] = arr[index-1]; // 4 3 / 3 2 / 2 1 / 1 0
				index -=1;
			}
			arr[indexList[i]] = valueList[i];
			System.out.println(Arrays.toString(arr));
		}
	}
}
