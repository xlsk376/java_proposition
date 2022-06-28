package ____자바정리7_일차배열;

import java.util.Arrays;
import java.util.Random;

public class 배열0_문제08_추가 {

	public static void main(String[] args) {
		/*
	 	랜덤으로 숫자 5개를 랜덤(1~9사이의숫자)으로 저장한다. 
	 	홀수는 arr 배열의 앞에서 부터 저장하고 짝수는 arr 배열의 뒤에서 부터 저장한다. 
	 	5번반복하고 배열 출력
	 	
	 	[예]
	 		2 ==> arr = {0,0,0,0,2};
	 		1 ==> arr = {1,0,0,0,2};
	 		4 ==> arr = {1,0,0,4,2};
	 		3 ==> arr = {1,3,0,4,2};
	 		2 ==> arr = {1,3,2,4,2};
		*/
		int arr[] = new int[5];
	
		Random ran = new Random();
		int count1 = 0;
		int count2 = 0;
		for(int i = 0; i < arr.length; i++) {
			int r = ran.nextInt(9)+1;
			System.out.println("r : " + r);
			if(r % 2 == 1) {
				int index1 = count1;
				for(int j = 0; j < count1; j++) {
					arr[index1] = arr[index1-1];
					index1 -= 1;
				}
				arr[0] = r;
				count1 += 1;
			}else {
				//System.out.println("r : " + r);
				int index2 = 4-count2;
				for(int j = 0; j < count2; j++) {
					arr[index2] = arr[index2+1];
					index2 += 1;
				}
				arr[4] = r;
				count2 += 1;
			}
			System.out.println(Arrays.toString(arr));
		}
		
		
		
		
	}
}
