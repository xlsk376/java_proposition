package ____자바정리7_일차배열;
/*
	[학생검색]
		아래배열들은 3명의 학생데이터이다.	
		각 학생은 세로로 3개씩 데이터로 표현하였다. 					
		(예) 
			1001번 , 국어 20 , 수학 30
			1002번 , 국어 43 , 수학 23
			1003번 , 국어 45 , 수학 1
		아래 학생3명중 국어점수가 수학점수 보다 높은 학생 번호 출력 
*/
public class 배열3_문제02_국어수학 {
	public static void main(String[] args) {
		int numList[] = {1001 , 1002, 1003};
		int korList[] = {20,    43,   45};
		int mathList[] = {30,    23,   1};
		
		for(int i = 0; i < 3; i++) {
			if(korList[i] > mathList[i]) {
				System.out.println(numList[i] + " ");
			}
		}
	}
}