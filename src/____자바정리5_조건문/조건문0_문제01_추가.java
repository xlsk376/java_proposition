package ____자바정리5_조건문;

import java.util.Random;
import java.util.Scanner;

public class 조건문0_문제01_추가 {
	public static void main(String[] args) {
		/*
		[페이징 훼이크]
		[이상한 나라의 숫자규칙]
			숫자 1~5 사이를 a 에저장하면 , num 에 1 저장후 출력
			숫자 6~10 사이를 a 에저장하면 , num 에 2 저장후 출력
			숫자 11~15 사이를 a에 저장하면, num 에 3 저장후 출력
			숫자 16~20 사이를 a 에 저장하면, num 에 4 저장후 출력
			....
			....
			숫자 96~100 사이를 a 에 저장하면 , num 에 20을 저장후 출력 
		
	 */
		Random ran = new Random();
		//int r = ran.nextInt(100)+1;
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int n = 0;
		System.out.println(r);
		if(r % 5 == 0) {
			n = r / 5;
		}else {
			n = (r+5)/5;
		}
		System.out.println(n);
		
		
		
		
	}
}
