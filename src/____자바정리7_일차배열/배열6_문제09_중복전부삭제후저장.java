package ____자바정리7_일차배열;

import java.util.Arrays;
import java.util.Scanner;

/*
	[문제] 삭제할 값을 입력받고 data배열에서 삭제후 b에 저장 
    int data[] = {5,2,6,8,5,6};
   	[조건] 만약에 같은값이 여러개 있으면 전부 삭제 후 b 에 순차적으로 저장 
	[예] 5 ==> b [] = {2,6,8,6};
	[예] 6 ==> b [] = {5,2,8,5};
	[예] 2 ==> b [] = {5,6,8,5,6};
 */
public class 배열6_문제09_중복전부삭제후저장 {
	public static void main(String[] args) {	
		int data[] = {5,2,6,8,5,6};
		int b [] = null;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		for(int i = 0; i < data.length; i++) {
			if(n != data[i]) {
				count += 1;
			}
		}
		b = new int[count];
		int index = 0;
		for(int i = 0; i < data.length; i++) {
			if(n != data[i]) {
				b[index] = data[i];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(b));
		
	}
}
