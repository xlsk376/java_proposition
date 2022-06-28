package ____자바정리8_이차반복문;

import java.util.Arrays;
import java.util.Random;

public class 이차원반복문0_문제05_추가 {

	public static void main(String[] args) {
		/*
		 * 아래 arr 배열의 숫자만큼 랜덤숫자(1~9)를 뽑는다 그랜덤숫자들의 합을 total 배열에 저장한다.
		 * 
		 * [예시] arr[0] = 1 이므로 랜덤숫자를 한개 뽑는다. r = 5 ==> total = {5,0,0,0,0}; arr[1] = 3
		 * 이므로 랜덤숫자를 세개뽑는다. r = 1, 4, 3 ==> total = {5,8,0,0,0}; ...
		 * 
		 */

		int arr[] = { 1, 3, 5, 3, 2 };
		int total[] = new int[5];
		Random ran = new Random();
		for(int i = 0; i < arr.length; i++) {
			int r = ran.nextInt(arr.length);
			System.out.println("r : " + r);
			for(int j = 0; j < arr[r]; j++) {
				total[i] += arr[j];
			}
		}
		System.out.println(Arrays.toString(total));
		
	}

}
