package ____자바정리7_일차배열;

import java.util.Arrays;
import java.util.Scanner;

/*
인덱스를 입력받고 해당 인덱스의 값을  0으로 변경

추가조건 : 해당 값 양옆의 값들도 8로 변경 
단, 0, 4 인덱스일경우는 양옆중 한개만 8로 변경 

(예) 1 ==> {8,0,8,9,9}
(예) 4 ==> {9,9,9,8,0}

*/
public class 배열5_문제01_전파 {
	public static void main(String[] args) {
		int arr[] = {9,9,9,9,9};	
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if(n == 0) {
			arr[n] = 0;
			arr[n+1] = 8;
		}else if(n == 4) {
			arr[n] = 0;
			arr[n-1] = 8;
		}else {
			arr[n] = 0;
			arr[n-1] = 8;
			arr[n+1] = 8;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}