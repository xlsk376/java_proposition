package ____자바정리8_이차반복문;

import java.util.Arrays;
import java.util.Random;

public class 이차원반복문0_문제06_추가 {

	public static void main(String[] args) {
		/*
	 	아래 배열을 뒤에서부터 한글자씩 늘려가면서 모든길이를 출력해보자.
	 	
	 	[예시]
	 		7
	 		6 7
	 		5 6 7
	 		4 5 6 7
	 		3 4 5 6 7
	 		2 3 4 5 6 7
	 		1 2 3 4 5 6 7
		 */
	
		int arr[] = {1,2,3,4,5,6,7};
		for(int i = 0; i < arr.length; i++) {
			int index = arr.length-1;
			for(int j = 0; j <= i; j++) {
				System.out.print(arr[index-i] + " ");
				index += 1;
			}
			System.out.println();
		}
		
	}

}
