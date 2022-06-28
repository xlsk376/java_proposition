package ____자바정리7_일차배열;
/*
	[문제]
	
		value 에 숫자를 한개를 입력받고 arr 배열에서 value 보다 큰숫자들의 개수를 출력
	
	[예] 
		30 을 입력받으면 30보다 큰값은 40과 50 이다. 	
		개수는 2개이다. 
	[정답] 
		2
*/

import java.util.Scanner;

public class 배열1_문제06_큰값개수 {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		
		int value = 0;
		Scanner scan = new Scanner(System.in);
		value = scan.nextInt();
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(value < arr[i]) {
				System.out.print(arr[i] + " ");
				count += 1;
			}
		}
		System.out.println();
		System.out.println("count : " + count);
		
		
	}

}
