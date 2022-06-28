package ____자바정리8_이차반복문;

import java.util.Arrays;
/*
  [개수찾기]
 
  	 아래배열의 숫자들을 새로운배열을 만들어서 숫자별 개수로 모으시오.
  	 
  	 int num[] = {1,2,3,100};
  	 int count[] = {2,3,5,1};
 */
public class 이차원반복문2_문제08_개수찾기 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 100, 1, 3, 3, 2, 3, 2 };
		
		int[] num = new int[arr.length];
		int[] count = new int[arr.length];
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			boolean check = false;
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] == num[j]) {
					check = true;
					break;
				}
			}
			if(check == false) {
				num[index] = arr[i];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(num));
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < num.length; j++) {
				if(arr[i] == num[j]) {
					count[j] += 1;
				}
			}
		}
		System.out.println(Arrays.toString(count));

		
	}
}
