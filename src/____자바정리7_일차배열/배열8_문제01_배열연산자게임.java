package ____자바정리7_일차배열;

import java.util.Arrays;
import java.util.Scanner;
/*
	[테스트]
	연산자 게임을 하려고 한다. 
	연산자 게임이란 숫자들만 화면에 나오고 연산자를 맞추는게임이다.
	예를 들어 3+3=6 이라면 화면에 아래와같이 출력이되고, 사용자는 연산자를 맞추는게임이다.
	-----------------------------
	3 ? 3 = 6 
	[1] + [2] - [3] *
	-----------------------------
	
	아래 배열은 6문제이고 a는 앞의 숫자 b는 뒤의 숫자 op는 연산자를 뜻한다. 
	게임을 만들고, 맞춘개수를 출력하시오.	
*/
public class 배열8_문제01_배열연산자게임 {
	public static void main(String[] args) {
		int a[] = {3,5,7,6,4,9};
		int b[] = {8,6,8,5,5,3};		
		String op[] = {"+","-","+","*","*","+"};// + : 1 , - : 2 , * : 3
		int temp[] = new int[op.length];
		int 답[] = new int[a.length];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < op.length; i++) {
			if(op[i] == "+") {
				temp[i] = 1;
			}else if(op[i] == "-") {
				temp[i] = 2;
			}else if(op[i] == "*") {
				temp[i] = 3;
			}
		}
		//System.out.println(Arrays.toString(temp));
		for(int i = 0; i < temp.length; i++) {
			if(temp[i] == 1) {
				답[i] = a[i]+b[i];
			}else if(temp[i] == 2) {
				답[i] = a[i]-b[i];
			}else if(temp[i] == 3) {
				답[i] = a[i]*b[i];
			}
		}
		//System.out.println(Arrays.toString(답));
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			System.out.printf("%d ? %d = %d", a[i], b[i], 답[i]);
			System.out.println();
			System.out.println("알맞은 연산을 고르시오.");
			System.out.println("[1] + [2] - [3] *");
			int n = scan.nextInt();
			if(n == temp[i]) {
				count += 1;
			}
		}
		System.out.println("맞춘개수 : " +count);
		System.out.println("틀린개수 : " + (6-count));
		
	}
}
