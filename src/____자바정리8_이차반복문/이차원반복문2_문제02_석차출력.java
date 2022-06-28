package ____자바정리8_이차반복문;

import java.util.Arrays;

/*
[석차 출력]
		성적 순으로 번호와 점수 출력 
*/

public class 이차원반복문2_문제02_석차출력 {

	public static void main(String[] args) {

		int[] numList = {1001, 1002, 1003, 1004};
		int[] scoreList = { 87, 42, 11, 98};
		int index = 0;
		int max = 0;
		for(int i = 0; i < scoreList.length; i++) {
			for(int j = 0; j < i; j++) {
				if(scoreList[i] > scoreList[j]) {
					System.out.println(i + " " + j);
					int temp = scoreList[j];
					scoreList[j] = scoreList[i];
					scoreList[i] = temp;
					int temp1 = numList[j];
					numList[j] = numList[i];
					numList[i] = temp1;
				}
			}
		}
		System.out.println(Arrays.toString(scoreList));
		System.out.println(Arrays.toString(numList));

		//인덱스와 값을 정확히 구분하여 올바른 출력을 해야한다.
	}

}
