package ____자바정리7_일차배열;

import java.util.Scanner;

/*
	numberList = { 1001, 1002, 1003, 1004, 1005 };
	scoreList = { 87, 11, 45, 98, 23 };
	[문제] 학번을 입력받아 성적 출력
	[정답] 학번 입력 : 1003 성적 : 45점
*/
public class 배열2_문제09_배열두개검색 {
	public static void main(String[] args) {
		int[] numberList = { 1001, 1002, 1003, 1004, 1005 };
		int[] scoreList = { 87, 11, 45, 98, 23 };
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int index = 0;
		for(int i = 0; i < 5; i++) {
			if(n == numberList[i]) {
				index = i;
			}
		}
		System.out.println(scoreList[index]);
	}
}
