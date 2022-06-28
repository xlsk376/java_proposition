package ____자바정리7_일차배열;

import java.util.Arrays;

/*
	[문제]
		철수는 수학시험을 보았다. 
		철수는 실수로 답을 한칸씩 밀려 적었다. 
		철수가 원래대로 마킹했더라면 몇점인가?
		각문제별로 점수는 다르다. 
		예) 
		정답= {1,4,3,3,2};
		점수표 = {20,30,15,15,20};
		
		철수가 제출한 답안지   {0,1,3,2,2) 
		원래제출하고싶었던 답안지 {1,3,2,2,0};
			
	[정답]
		첫번째 한문제만 정답이이고 , 해당점수는 20점이므로 
		20점
 */
public class 배열5_문제03_밀리기전답안지 {
	public static void main(String[] args) {
		int[] 정답 = {1,4,3,3,2};
		int[] 점수표 = {20,30,15,15,20};
		int[] 밀린답안지 = {0,1,3,2,2};	
		int 원본답안지[] = new int[5];
		
		for(int i = 0; i < 4; i++) {
			원본답안지[i] = 밀린답안지[i+1];
		}
		System.out.println(Arrays.toString(원본답안지));
		
		for(int i = 0; i < 정답.length; i++) {
			if(원본답안지[i] == 정답[i]) {
				System.out.println(점수표[i]);
			}
		}
		
		
	} 
}