package ____자바정리7_일차배열;

import java.util.Arrays;
import java.util.Random;

/*
	아래 배열에 랜덤값 -100 ~ 100을 4개 저장후 그값중 홀수의 합만 출력 
	
	예) arr = { -11, 4, 73, -2 };
	
	결과) (-11 + 73) ==> 62
*/
public class 배열2_문제04_랜덤홀수합 {

	public static void main(String[] args) {
		
		int arr[] = new int[4];
		
		Random ran = new Random();
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(201)-100;
			if(arr[i] % 2 == 1 || arr[i] % 2 == -1) {
				total += arr[i];
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(total);
	}

}
