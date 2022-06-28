package ____자바정리7_일차배열;
import java.util.Scanner;
/*
	 array = { 87, 11, 45, 98, 23 };

	[문제1] 인덱스를 입력받아 성적 출력
	[정답1] 인덱스 입력 : 1 성적 : 11점

*/
public class 배열2_문제01_점수인덱스검색 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		int[] array = { 87, 11, 45, 98, 23 };		
		System.out.println("인덱스 입력 : ");
		int index = scan.nextInt();		
		System.out.println(array[index]);
		System.out.println("------------------------");
		
		scan.close();
	}

}
