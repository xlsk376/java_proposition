package ____자바정리7_일차배열;

import java.util.Arrays;
import java.util.Scanner;

/*
	[문제]
		삽입할 위치를 입력받고 
		b배열에 삽입한 상태를 저장한다. 		
		(예) 2 
		   int b[] = { 10,20,60,30};		   
		(예) 1  
		   int b[] = { 10,60,20,30};
*/
public class 배열6_문제06_삽입후저장 {	
	public static void main(String[] args) {				
		int array[] = { 10,20,30 };
		int b[] = null;
		int value = 60;
		int index = -1;		
		b = new int[4];
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
//		b[n] = value;
//		int count = 0;
//		for(int i = 0; i <b.length; i++) {
//			if(b[i] == 0) {
//				b[i] = array[count];
//				count += 1;
//			}
//		}
//		System.out.println(Arrays.toString(b));
		
		
		
	}
}
