package ____자바정리7_일차배열;

import java.util.Scanner;

/*
	value 에 숫자를 한개를 입력받고 arr 배열에서 value 보다 큰숫자만 출력 
	
	예) 30 을 입력받으면 30보다 큰값은 40과 50 이다. 	 	
	결과) 40, 50
*/
public class 배열1_문제04_큰값 {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		
		int value = 0;
		Scanner scan = new Scanner(System.in);
		value = scan.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(value < arr[i]) {
				System.out.println(arr[i]);
			}
		}
		
		
	}

}
