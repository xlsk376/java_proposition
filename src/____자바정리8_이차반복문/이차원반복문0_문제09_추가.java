package ____자바정리8_이차반복문;

import java.util.Arrays;
import java.util.Random;

public class 이차원반복문0_문제09_추가 {

	public static void main(String[] args) {
		/*
	  	[1] 랜덤숫자 1~9사이의 랜덤값중 홀수만 arr 배열에 저장한다.
	  	[2] 저장은 뒤에서 부터한다.
	  	[3] 새로운값이 저장될때는 앞으로 밀어내고 맨뒤에 저장한다.
	  	
	  	[예시]
	  		r ==> 3 , arr ==> {0,0,0,0,3,3};
	  		r ==> 5 , arr ==> {0,0,3,3,5,5};
	  		r ==> 1 , arr ==> {3,3,5,5,1,1};
	  	
		*/	 
		int arr[] = new int[6];
		Random ran = new Random();
		int count = 0;
		for(int i = 0; i < arr.length; i+=2) {
			int r = ran.nextInt(9)+1;
			if(r % 2 == 1) {
				System.out.println("r : " + r);
				int index = 5-count;
				for(int j = 0; j < count; j++) {
					arr[index-1] = arr[index+1];
					index += 1;
				}
				arr[4] = r;
				arr[5] = r;
				count += 2;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

}
