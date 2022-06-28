package ____자바정리7_일차배열;
/*
	index 에 숫자를 한개를 입력받고 arr 배열에서 index 보다 큰인덱스의 값들중 짝수의 합을 출력	 	
*/

import java.util.Scanner;

public class 배열1_문제03_짝수개수 {
	
	public static void main(String[] args) {
		
		int arr[] = {10, 20, 31, 20, 98, 65, 43, 73, 51, 22};
		
		int index = 0;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[n] == arr[i]) {
				index = i;
			}
		}
		int total = 0;
		int count = 0;
		for(int i = index+1; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				count += 1;
				total += arr[i];
			}
		}
		System.out.println(count + " " + total);
		
	}

}
