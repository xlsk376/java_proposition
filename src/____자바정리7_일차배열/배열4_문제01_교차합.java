package ____자바정리7_일차배열;

import java.util.Arrays;

/*
	[교차합]	
	arr1은 앞에서부터 뒤로 반복한다.
	arr2는 뒤에서부터 앞으로 거꾸로 반복한다. 	
	b에 arr1 과 arr2 각각의 값의 합을 저장후 출력한다. 	
	예) b[0] = arr1[0] + arr2[4] 
	예) b[1] = arr1[1] + arr2[3] 
*/
public class 배열4_문제01_교차합 {
	public static void main(String[] args) {		
		int arr1[] = {11,21,31,41,51};
		int arr2[] = {25,26,27,28,29};
		int b[] = new int[5];
		int index = arr2.length-1;
		for(int i = 0; i < arr1.length; i++) {
			b[i] = arr1[i] + arr2[index];
			index -= 1;
		}
		System.out.println(Arrays.toString(b));
		
	}
}
