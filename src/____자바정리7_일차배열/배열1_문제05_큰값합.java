package ____�ڹ�����7_�����迭;

import java.util.Scanner;

/*
	value �� ���ڸ� �Ѱ��� �Է¹ް� arr �迭���� value ���� ū���������� ��� 
	
	��) 30 �� �Է¹����� 30���� ū���� 40�� 50 �̴�. 	
	������ 90�̴�. 	
	���)90
*/
public class �迭1_����05_ū���� {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		
		int value = 0;
		Scanner scan = new Scanner(System.in);
		value = scan.nextInt();
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			if(value < arr[i]) {
				System.out.print(arr[i] + " ");
				total += arr[i]; 
			}
		}
		System.out.println();
		System.out.println(total);
		
		
	}

}
