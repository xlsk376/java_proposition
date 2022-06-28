package ____자바정리6_일차반복문;

import java.util.Scanner;
/* 
	[문제]
	[자리별홀수]
  		1 ~ 10000 사이의 숫자를 입력받고 자리별 홀수의 개수를 출력하시오.
  	[예시] 
     	561  : 홀수 2개
  	 	1    : 홀수 1개
  	 	668  : 홀수 0개
  	 	9999 : 홀수 4개 
*/
public class 반복문7_문제01_자리별홀수2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자(1~10000) 입력 : ");
		int num = scan.nextInt();
		int count = 0;
		while(true) {
			if(num == 0) {
				break;
			}
			int a = num % 10;
			if(a % 2 == 1) {
				count += 1;
			}
			num = num / 10;
		}
		System.out.println("홀수 " + count + "개");
		scan.close();
	}
}
