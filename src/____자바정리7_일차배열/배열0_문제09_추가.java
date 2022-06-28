package ____자바정리7_일차배열;

import java.util.Arrays;
import java.util.Random;

public class 배열0_문제09_추가 {

	public static void main(String[] args) {
		/*
	 	랜덤으로 sample 배열의 값을 하나 저장한다. 
	 	그값을 arr 배열의 모든값과 비교한다.
	 	배열에 그값이 없으면 arr배열의 모든값을 뒤로밀고 맨앞에 저장후출력 
	 	있으면 "이미존재합니다" 출력 
	 	[예시]
	 		r = 3 ==> sample[r] = 40 //  arr = {40,10,20,0,0};
	 		r = 0 ==> sample[r] = 10 //  "이미존재합니다"
		*/
		int arr[] = {10,20,0,0,0};
		int sample [] = {10,20,30,40,50};
		
		Random ran = new Random();
		int r = ran.nextInt(sample.length);
		System.out.println("r :" + sample[r]);
		int count = 2;
		int index = 0;
		boolean check = false;
		for(int i = 0; i < sample.length; i++) {
			if(arr[i] == sample[r]) {
				check = true;
				index = i;
				break;
			}
		}
		if(check == false) {
			int index2 = count;
			for(int i = 0; i < count; i++) { // 값이 들어올곳의 인덱스번호를 초기값으로 지정
				arr[index2] = arr[index2-1];
				index2 -= 1;
			}
			arr[0] = sample[r];
			System.out.println(Arrays.toString(arr));
		}else {
			System.out.println("이미존재" + arr[index]);
			System.out.println(Arrays.toString(arr));
		}
		
		
		
	}
}
