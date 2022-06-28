package ____자바정리7_일차배열;

import java.util.Arrays;
import java.util.Scanner;

/*
[문제]
	인덱스 , 번호 , 점수를 입력받고 삽입을 하시오.
	
	[예] 2 , 1004 , 60
	
	int c[] = { 1001, 40, 1004, 60, 1002, 65, 1003, 70 ,0,0};
	
*/
public class 배열6_문제07_가로배열삽입 {	
	public static void main(String[] args) {				
		int c[] = { 1001, 40, 1002, 65, 1003, 70,0,0,0,0};		
		int number = 0;
		int score = 0;
		int index = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("인덱스 : ");
		index = scan.nextInt();
		System.out.println("번호 : ");
		number = scan.nextInt();
		System.out.println("점수 : ");
		score = scan.nextInt();
		int count = 6;
		int lastindex = count;
		for(int i = index; i < count; i++) {
			c[lastindex+1] = c[lastindex-1];
			lastindex -= 1;
		}
		c[index] = number;
		c[index+1] = score;
		count += 2;
		System.out.println(Arrays.toString(c));
		
		
		
		
	}
}
