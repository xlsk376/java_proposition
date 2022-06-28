package ____자바정리7_일차배열;

import java.util.Random;

/*
	index 에 숫자를 한개를 입력받고 arr 배열에서 index 보다 큰인덱스의 값들만 출력 
	
	예) 입력 : 3 
	설명 ) 위에서 인덱스 3을 입력받으면 arr[3] 값은 40이므로 40보다 큰값은 50이다.	 	
	결과) 50
*/
public class 배열1_문제01_큰인덱스 {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		
		int index = 0;
		
		Random ran = new Random();
		int r = ran.nextInt(arr.length);
		System.out.println(r);
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == arr[r]) {
				index = i;
			}
		}
		
		
	}

}
