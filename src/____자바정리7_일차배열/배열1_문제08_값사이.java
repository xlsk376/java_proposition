package ____자바정리7_일차배열;

import java.util.Scanner;

/*
	값을 두개 입력받고 배열에서 그사이의 값만 출력  	
	예) 입력 : 10, 43  	
	설명 ) 10과 43 두개를 입력받으면 그사이의 값은 20과 30이다. 
	결과) 20,30,40
*/
public class 배열1_문제08_값사이 {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		
		int value1 = 0;
		int value2 = 0;
		
		Scanner scan = new Scanner(System.in);
		value1 = scan.nextInt();
		value2 = scan.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(value1 < arr[i] && arr[i] < value2) {
				System.out.print(arr[i] + " ");
			}
			
		}
		
		
	}

}
