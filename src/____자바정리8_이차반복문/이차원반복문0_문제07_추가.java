package ____자바정리8_이차반복문;

import java.util.Arrays;
import java.util.Random;

public class 이차원반복문0_문제07_추가 {

	public static void main(String[] args) {
		/*
	 	int[]arr = new int[6];
	  
	  	랜덤숫자 1~9를 다섯개 arr 에 저장할려고 한다. 
	  	[조건1] 홀수만저장한다. 
	  	[조건2] 맨앞에 저장한다.
	  	[조건3] 새로운 값이 들어오면 기존의 값들은 뒤로 밀고 맨앞에 저장한다. 
	  	[조건4] 값은 두개씩 저장한다. 
	  
	  	[예시]
	  		r = 1  ,  arr = {1,1,0,0,0,0};
	  		r = 3  ,  arr = {3,3,1,1,0,0};
	  		r = 7  ,  arr = {7,7,3,3,1,1};
		*/
		Random ran = new Random();
		int[]arr = new int[6];
		
		int count  = 0;
		for(int i = 0; i < arr.length; i+=2) {
			int r = ran.nextInt(9)+1;
			if(r % 2 == 1) {
				System.out.println("r : " + r);
				int index = count;
				for(int j = 0; j < count; j++) {
					arr[index+1] = arr[index-1];
					index -= 1;
				}
				arr[0] = r;
				arr[1] = r;
				count += 2;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
