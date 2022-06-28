package ____자바정리7_일차배열;

import java.util.Arrays;
import java.util.Scanner;

public class 배열0_문제05_추가 {
	/*
	[문제] 
	아래 배열 c는 번호와 값이 한쌍인 배열이다. 
	번호를 하나를 입력받고 c배열에 있는 번호이면, 
	그번호와  값만 제외하고 d배열에 복사한다.
	[예]  
		c[] = { 1001, 40, 1002, 65, 1003, 70 };
		입력 : 1002 
		c[] = {1001, 40, 1003, 70}; 
 */
	public static void main(String[] args) {
		int c[] = { 1001, 40, 1002, 65, 1003, 70 };
		int d[] = null;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		int index = 0;
		
		for(int i = 0; i < c.length; i+=2) {
			if(n != c[i]) {
				count += 2;
			}
		}
		System.out.println(count);
		d = new int[count];
		for(int i = 0; i < c.length; i+=2) {
			if(n != c[i]) {
				d[index] = c[i];
				index += 1;
				d[index] = c[i+1];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(d));
		
	}
}
