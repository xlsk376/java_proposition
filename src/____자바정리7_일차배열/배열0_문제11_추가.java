package ____자바정리7_일차배열;

import java.util.Arrays;
import java.util.Random;

public class 배열0_문제11_추가 {

	public static void main(String[] args) {
		/*
	 	변수 index에는 랜덤으로 인덱스(0~9)를 입력받는다.
	 	
	 	변수 pos 에는 랜덤으로 거리(3~6) 를 입력받는다.
	 	
	 	arr 배열에 index 부터 pos 만큼 숫자 1로 채우고 출력 
	 	
	 	단 만약에 index 가  배열 크기를 초과하면 앞에서 부터 이어서 1을 저장
	 	
	 	[예시1] 
	 		index : 3 , pos : 3  ==> {0,0,0,1,1,1,0,0,0,0};
	 		
	 	[예시2] 
	 		index : 8 , pos : 4  ==> {1,1,0,0,0,0,0,0,1,1};
	 */
			
		int arr[] = {0,0,0,0,0,0,0,0,0,0};
		int index = 0;
		int pos = 0;
		
		Random ran = new Random();
		index = ran.nextInt(10);
		pos = ran.nextInt(4)+3;
		System.out.println(index + " " + pos);
		for(int i = 0; i < pos; i++) {
			if(index >= arr.length) {
				index = 0;
				arr[index] = 1;
			}else {
				arr[index] = 1;
			}
			index += 1;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
