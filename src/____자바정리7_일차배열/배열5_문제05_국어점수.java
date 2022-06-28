package ____자바정리7_일차배열;

import java.util.Arrays;

/*
	[학생검색]
		아래배열은 3명의 학생데이터이다.		
		각 학생은 3개씩 데이터로 표현한다. 
		맨앞은 번호 , 그다음은 국어점수 , 그담은 수학점수이다.					
		(예) 
			1001번 , 국어 20 , 수학 30
			1002번 , 국어 43 , 수학 23
			1003번 , 국어 45 , 수학 1		
		아래 학생3명중 국어점수가 수학점수 보다 높은 학생번호를 
		b에저장 
		단 앞에서 부터 저장	
*/
public class 배열5_문제05_국어점수 {
	public static void main(String[] args) {
		int arr[] = {1001, 20, 30, 1002, 43, 23, 1003, 45, 1}; // 1,2  4,5  7,8
		int b[] = new int[3];
		int index = 1;
		int bindex = 0;
		for(int i = 1; i < arr.length; i+=3) {
			if(arr[i] > arr[i+1]) {
				b[bindex] = arr[i-1];
				bindex += 1;
			}
		}
		System.out.println(Arrays.toString(b));
		
	}
}