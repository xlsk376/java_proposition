package ____자바정리7_일차배열;

import java.util.Arrays;

/*
	[문제]
		다음배열에서 반복을 순차적으로하다  3번째마다 바로뒤의 값과 위치를 교환후 출력 
		[예]
		교환전  {10,20,30,40,50,60,70,80}; : 30과 40을 교환 , 60과 70을 교환
		교환후  {10,20,40,30,50,70,60,80};
 */
public class 배열4_문제08_뒤의값과교환 {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60,70,80};	
		int count = 0;
		int index = 0;
		for(int i= 0; i < arr.length; i++) {
			if(count % 3 == 2) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				count = 0;
			}else {
				count += 1;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
	}	
}