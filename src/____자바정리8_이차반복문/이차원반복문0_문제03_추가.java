package ____자바정리8_이차반복문;

import java.util.Arrays;
import java.util.Random;

public class 이차원반복문0_문제03_추가 {

	public static void main(String[] args) {
		/*
	 	아래 배열을 한글자씩 늘려가면서 모든길이를 출력해보자.
	 	
	 	[예시]
	 		1
	 		1 2
	 		1 2 3
	 		1 2 3 1
	 		1 2 3 1 2
	 		1 2 3 1 2 3
	 		1 2 3 1 2 3 1
	 		1 2 3 1 2 3 1 2
	 		1 2 3 1 2 3 1 2 3
	 		1 2 3 1 2 3 1 2 3 4
		*/
	
		int arr[] = {1,2,3,1,2,3,1,2,3,4};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
	
	
	
	}

}
