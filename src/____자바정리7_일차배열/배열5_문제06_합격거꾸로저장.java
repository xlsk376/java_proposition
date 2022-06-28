package ____자바정리7_일차배열;

import java.util.Arrays;

/*
	[학생검색]
		아래배열은 3명의 학생데이터이다.	
		각 학생은 3개씩 데이터로 표현한다. 
		맨앞은 번호 , 그다음은 국어점수 , 그담은 수학점수이다.
	[문제]
		두 과목의 평균이 60이상이면 합격이다 합격한 학생의 번호를
		b에 저장 
		단 뒤에서 부터 거꾸로 저장 	
	[결과]
		b = {0,1003,1001};
*/
public class 배열5_문제06_합격거꾸로저장 {
	public static void main(String[] args) {
		int arr[] = {1001, 77, 80, 1002, 43, 63, 1003, 75, 61};	
		int b[] = new int[3];
		int index = 2;
		for(int i = 1; i < arr.length; i+=3) {
			int avg = (arr[i] + arr[i+1])/2;
			if(avg >= 60) {
				b[index] = arr[i-1];
				index -= 1;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}