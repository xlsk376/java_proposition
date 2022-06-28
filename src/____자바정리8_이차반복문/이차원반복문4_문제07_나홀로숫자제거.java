package ____자바정리8_이차반복문;

import java.util.Arrays;

public class 이차원반복문4_문제07_나홀로숫자제거 {
	/*
	 	아래 배열에서 혼자있는 숫자를 제거한후 나머지값들만 출력해보자.
			 
	  	(예)
			{1,2,3,2,1}  ==>  {1,2,2,1}    // 3이 혼자있음
		    {1,3,4,4,2}  ==>  {4,4}        // 1,2,3 혼자있음
		    {1,1,1,1,1}  ==>  {1,1,1,1,1}  // 없음
	 
	 */

	public static void main(String[] args) {
		
		int test[] = {1,3,4,4,2} ;				
		int temp[] = new int[5];
		int index = 0;
		for(int i = 0; i < test.length; i++) {
			boolean check = false;
			for(int j = 0; j < test.length; j++) {
				if(i != j && test[i] == test[j]) {
					check = true;
					break;
				}
			}
			if(check == true) {
//				temp[index] = test[i];
//				index += 1;
			}else {
				temp[index] = test[i];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(temp));
		
	}
	
}
