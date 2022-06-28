package ____자바정리7_일차배열;

import java.util.Scanner;
/*
	array = {1001, 20, 1002, 45, 1003, 54};
   	학번과 점수가 한쌍이다. ==>  1001:20 , 1002:45 , 1003:54
   	[문제] 학번을 입력하면 점수 출력한다.
   	[예] 1001==>20 , 1003 ==> 54  
   	[문제] 점수를 입력하면 학번 출력한다. 
   	[예] 20 ==> 1001 , 45 ==> 1002
 */
public class 배열5_문제04_점수검색 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int array[] = {1001, 20, 1002, 45, 1003, 54};
		System.out.println("학번 입력 : ");
		int number = scan.nextInt();			
		System.out.println("점수 입력 : ");
		int score = scan.nextInt();	
		
		for(int i = 0; i < array.length; i+=2) {
			if(number == array[i]) {
				System.out.println(array[i+1]);
			}
		}
		for(int i = 1; i < array.length; i+=2) {
			if(score == array[i]) {
				System.out.println(array[i-1]);
			}
		}
	}
}
