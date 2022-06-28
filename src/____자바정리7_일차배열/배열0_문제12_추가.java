package ____자바정리7_일차배열;

import java.util.Arrays;
import java.util.Random;

public class 배열0_문제12_추가 {

	public static void main(String[] args) {
		/*
	 	변수 index에는 랜덤으로 인덱스(0~9)를 입력받는다.
	 	
	 	변수 pos 에는 랜덤으로 거리(3~6) 를 입력받는다.
	 	
	 	arr 배열에 index 부터 pos 만큼 숫자 1로 채우고 출력 
	 	
	  	[조건1] pos의 값이 짝수면 뒤에서 앞으로 저장
	 	[조건2] pos 의 값이 홀수면 앞에서 뒤로 저장 
	 	[조건3] 인덱스가 배열을  초과하면 앞에서부터 이어서 저장
	 	[조건4] 인덱스가 배열 미만이되면  뒤에서부터 앞으로 이어서저장 
	 	
	 	
	 	[예시1] pos 가 홀수이므로 3,4,5 를 1로 채운다.
	 		index : 3 , pos : 3  ==> {0,0,0,1,1,1,0,0,0,0};
	 		
	 	[예시2] pos 가 짝수이므로 8,7,6,5 를 1로채운다.
	 		index : 8 , pos : 4  ==> {0,0,0,0,0,1,1,1,1,0};
	 		
	 	[예시2] pos 가 짝수이므로 2,1,0,9,8,7 을 1로채운다.
	 		index : 2 , pos : 6  ==> {1,1,1,0,0,0,0,1,1,1};
		*/
			
		int arr[] = {0,0,0,0,0,0,0,0,0,0};
		int index = 0;
		int pos = 0;
		
		Random ran = new Random();
		index = ran.nextInt(10);
		pos = ran.nextInt(4)+3;
		System.out.println(index + " " + pos);
		for(int i = 0; i < pos; i++) {
			if(pos % 2 == 1) {
				if(index >= arr.length) {
					index = 0;
					arr[index] = 1;
				}else {
					arr[index] = 1;
				}
				index += 1;
				System.out.println(Arrays.toString(arr));
			}else {
				if(index < 0) {
					index = arr.length-1;
					arr[index] = 1;
				}else {
					arr[index] = 1;
				}
				index -= 1;
				System.out.println(Arrays.toString(arr));
			}
		}
	
	}
}
