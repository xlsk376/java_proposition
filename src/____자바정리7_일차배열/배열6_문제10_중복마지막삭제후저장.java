package ____자바정리7_일차배열;

import java.util.Arrays;
import java.util.Scanner;

/*
	[문제] 값을 입력받고 삭제 
	[조건] 만약에 같은값이 여러개 있으면 가장 마지막의값 한개만 삭제 후 b 에 순차적으로 저장 
	[예] 5 ==> b [] = {5,2,6,8,6}; 
	[예] 6 ==> b [] = {5,2,6,8,5};
*/
public class 배열6_문제10_중복마지막삭제후저장 {
	public static void main(String[] args) {	
		int data[] = {5,2,6,8,5,6};
		int b [] = null;
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 값 입력 : ");
		int n = scan.nextInt();
		int count = 0;
		for(int i = 0; i < data.length; i++) {
			if(n == data[i]) {
				count += 1;
				break;
			}
		}
		b = new int[data.length-count];
		int index = 0;
		for(int i = 0; i < data.length; i++) {
			if(n == data[i]) {
				index = i;
			}
		}
		int bindex = 0;
		for(int i = 0; i < data.length; i++) {
			if(index != i) {
				b[bindex] = data[i];
				bindex += 1;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
