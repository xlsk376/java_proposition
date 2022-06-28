package ____자바정리7_일차배열;

import java.util.Scanner;

/*
	인덱스 2개 입력받고 배열에서 그사이의 값만 출력  	
	
	예) 입력 1, 4 
	설명 ) 위 인덱스1, 4의 해당 값은 20과 50 이므로 그사이값은 30, 40 이다.	 	
	결과) 30 , 40
*/

public class 배열1_문제07_인덱스사이 {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		
		int index1 = 0;
		int index2 = 0;
		
		Scanner scan = new Scanner(System.in);
		index1 = scan.nextInt();
		index2 = scan.nextInt();
		for(int i = 0; i < arr.length; i++) {
			if(arr[index1] < arr[i] && arr[i] < arr[index2]) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
