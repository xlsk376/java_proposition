package ____자바정리7_일차배열;

import java.util.Arrays;
import java.util.Scanner;

/*
	아래는 이번 중간고사 데이터이다. 
	시험과목은 국어 , 영어 , 수학이고 점수는 아래와같다.
	다음 문제의 답을 구하시오.	
	[1] 성별을 입력받고 성별에 해당하는 학생들 번호 , 이름을 출력 
	[2] 전과목 평균출력 소수점두자리
	[3] 번호를 입력받고 이름, 성별, 점수들 출력
	[4] 세과목총점이 1등인 번호, 이름, 총점, 성별출력
	[5] 수학점수가 1등인 번호, 이름 , 점수, 성별출력 
	[6] 두학생의 모든 점수들이 서로 바뀌어버렸다. 번호두개를 입력받고 각 학생들의 점수들를 교환
*/	
public class 배열3_문제08_중간고사 {
	public static void main(String[] args) {	
		int[] numberList = {1001, 1002, 1003, 1004, 1005};
		int[] korScoreList  = {  87,   11,   45,   98,   23};
		int[] engScoreList  = {  54,   32,   85,   78,   93};
		int[] mathScoreList  = {  56,   51,   100,   28,   33};
		String[] nameList = {"김철수" , "이영희" , "조아림" , "최정식" , "홍길동"};
		String[] genderList = {"남" , "여" , "여" , "남" , "남"};
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 0; i < 5; i++) {
			if(genderList[n] == genderList[i]) {
				System.out.println(numberList[i]);
				System.out.println(nameList[i]);
			}
		}
		int total[] = new int[5];
		for(int i = 0; i < 5; i++) {
			total[i] = korScoreList[i] + engScoreList[i] + mathScoreList[i];
		}
		System.out.println(Arrays.toString(total));
		
		
		
		
	}
}
