package ____�ڹ�����7_�����迭;
/*
	[����]
	
		value �� ���ڸ� �Ѱ��� �Է¹ް� arr �迭���� value ���� ū���ڵ��� ������ ���
	
	[��] 
		30 �� �Է¹����� 30���� ū���� 40�� 50 �̴�. 	
		������ 2���̴�. 
	[����] 
		2
*/

import java.util.Scanner;

public class �迭1_����06_ū������ {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		
		int value = 0;
		Scanner scan = new Scanner(System.in);
		value = scan.nextInt();
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(value < arr[i]) {
				System.out.print(arr[i] + " ");
				count += 1;
			}
		}
		System.out.println();
		System.out.println("count : " + count);
		
		
	}

}
