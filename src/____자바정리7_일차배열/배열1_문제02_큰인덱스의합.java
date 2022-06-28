package ____자바정리7_일차배열;

import java.util.Scanner;

/*
	index 에 숫자를 한개를 입력받고 arr 배열에서 index 보다 큰인덱스의 값들의 합 출력 
	
	예) 입력 : 1
	설명 ) 위에서 인덱스 1을 입력받으면 arr[1] 값은 20이므로 20보다큰값은 30,40,50이다. 	
	결과) 120
*/
public class 배열1_문제02_큰인덱스의합 {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		
		int index = 0;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]== arr[n]) {
				index = i;
			}
		}
		int total = 0;
		for(int i = index+1; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println();
		System.out.println(total);
		
		
		
	}

}
