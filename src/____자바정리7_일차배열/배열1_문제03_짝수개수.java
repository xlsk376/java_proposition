package ____�ڹ�����7_�����迭;
/*
	index �� ���ڸ� �Ѱ��� �Է¹ް� arr �迭���� index ���� ū�ε����� ������ ¦���� ���� ���	 	
*/

import java.util.Scanner;

public class �迭1_����03_¦������ {
	
	public static void main(String[] args) {
		
		int arr[] = {10, 20, 31, 20, 98, 65, 43, 73, 51, 22};
		
		int index = 0;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[n] == arr[i]) {
				index = i;
			}
		}
		int total = 0;
		int count = 0;
		for(int i = index+1; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				count += 1;
				total += arr[i];
			}
		}
		System.out.println(count + " " + total);
		
	}

}
