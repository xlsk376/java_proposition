package ____�ڹ�����7_�����迭;

import java.util.Scanner;

/*
	�ε��� 2�� �Է¹ް� �迭���� �׻����� ���� ���  	
	
	��) �Է� 1, 4 
	���� ) �� �ε���1, 4�� �ش� ���� 20�� 50 �̹Ƿ� �׻��̰��� 30, 40 �̴�.	 	
	���) 30 , 40
*/

public class �迭1_����07_�ε������� {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		
		int index1 = 0;
		int index2 = 0;
		
		Scanner scan = new Scanner(System.in);
		index1 = scan.nextInt();
		index2 = scan.nextInt();
		for(int i = 0; i < arr.length; i++) {
			if(arr[index1] < arr[i] && arr[i] < arr[index2]) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
