package ____자바정리8_이차반복문;

import java.util.Arrays;

public class 이차원반복문4_문제05_인풋삭제삽입 {
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		
		String  keyword[] = {"삭제","삽입","삭제","삭제"};
		int indexList[] = {2,1,0,3};
		int valueList[] = {60,70,80,90};
		
		for(int i = 0; i < indexList.length; i++) {
			int index = arr.length-1;
			for(int j = indexList[i]; j < arr.length-1; j++) {
				arr[index] = arr[index-1];
				index -= 1;
			}
			arr[indexList[i]] = valueList[i];
			System.out.println(Arrays.toString(arr));
		}
		
	
	}
}
