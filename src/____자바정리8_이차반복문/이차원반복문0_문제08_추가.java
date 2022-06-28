package ____자바정리8_이차반복문;

import java.util.Arrays;
import java.util.Random;

public class 이차원반복문0_문제08_추가 {

	public static void main(String[] args) {
		/*
		[1] 아래배열에 1~9까지의 랜덤 숫자 3개를 저장후 출력 
		[2] 숫자3개는 서로 겹치면안된다. 
		[3] 숫자3개의 합은 반드시 20이여야한다. 
		*/		 
		int arr[] = new int[3];
		Random ran = new Random();
		while(true) {
			int total = 0;
			for(int i = 0; i <arr.length;) {
				int r = ran.nextInt(9)+1;
				boolean check = false;
				for(int j = 0; j < arr.length; j++) {
					if(r == arr[j]) {
						check = true;
						break;
					}
				}
				if(check == false) {
					arr[i] = r;
					i += 1;
				}
			}
			for(int i = 0; i < arr.length; i++) {
				total += arr[i];
			}
			if(total == 20) {
				System.out.println(Arrays.toString(arr));
				break;
			}
		}
		
	}

}
