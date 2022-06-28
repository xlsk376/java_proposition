package ____자바정리8_이차반복문;

import java.util.Arrays;
import java.util.Random;

public class 이차원반복문0_문제01_추가 {

	/*
	 * [1] 랜덤(1~9사이의숫자) 중 짝수의 값만 다섯개의 합을 배열의 첫번째 자리에 저장한다. [2] 인덱스증가 위내용을 5번반복한다.
	 * 
	 * [예시] [0번인덱스] 2, 6, 4 ,2, 8 => total = 22 arr = {22, 0,0,0,0}; [1번인덱스] 6, 4, 4
	 * ,2, 2 => total = 18 arr = {22, 18, 0, 0, 0}; ...
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = new int[5];

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int total = 0;
			while (true) {
				int r = ran.nextInt(9) + 1;
				System.out.print(r + " ");
				if (r % 2 == 0) {
					total += r;
					count += 1;
				}
				if (count == 5) {
					break;
				}
			}
			System.out.println();
			arr[i] = total;
		}
		System.out.println(Arrays.toString(arr));
	}

}
