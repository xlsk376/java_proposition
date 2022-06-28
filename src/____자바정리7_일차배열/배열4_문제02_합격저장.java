package ____자바정리7_일차배열;

import java.util.Arrays;

/*
	[문제2] 아래는 시험결과 이다. 시험에 합격한사람의 번호만 win 에 저장한다. (60점이상합격)
	[조건1] 앞에서부터 저장하시오.
	[예] win1[]= {1002, 1003, 0};
*/
public class 배열4_문제02_합격저장 {
	public static void main(String[] args) {		
		int number[] = { 1001, 1002, 1003 };
		int score[] = { 50, 83, 78 };
		int win1[] = { 0,0,0 };
		int index = 0;
		
		for(int i = 0; i < 3; i++) {
			if(60 <= score[i]) {
				win1[index] = number[i];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(win1));
		
	}
}
