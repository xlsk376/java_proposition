package ____�ڹ�����7_�����迭;

import java.util.Scanner;

/*
	value �� ���ڸ� �Ѱ��� �Է¹ް� arr �迭���� value ���� ū���ڸ� ��� 
	
	��) 30 �� �Է¹����� 30���� ū���� 40�� 50 �̴�. 	 	
	���) 40, 50
*/
public class �迭1_����04_ū�� {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		
		int value = 0;
		Scanner scan = new Scanner(System.in);
		value = scan.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(value < arr[i]) {
				System.out.println(arr[i]);
			}
		}
		
		
	}

}
