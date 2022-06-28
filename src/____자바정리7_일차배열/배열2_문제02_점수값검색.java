package ____자바정리7_일차배열;
import java.util.Scanner;
/*
	 array = { 87, 11, 45, 98, 23 };

	[문제2] 성적을 입력받아 인덱스 출력
	[정답2] 성적 입력 : 11 인덱스 : 1
*/
public class 배열2_문제02_점수값검색 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		int[] array = { 87, 11, 45, 98, 23 };		
		
		System.out.println("------------------------");
		System.out.println("성적 입력 : ");
		int score = scan.nextInt();	
		int index2 = -1;
		
		for(int i = 0; i < 5; i++) {
			if(score == array[i]) {
				index2 = i;
			}
		}
		if(index2 == -1) {
			System.out.println("없다");
		}else if(index2 != -1) {
			System.out.println(index2);
		}
		
	}

}
