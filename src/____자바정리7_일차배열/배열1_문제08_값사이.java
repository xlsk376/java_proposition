package ____�ڹ�����7_�����迭;

import java.util.Scanner;

/*
	���� �ΰ� �Է¹ް� �迭���� �׻����� ���� ���  	
	��) �Է� : 10, 43  	
	���� ) 10�� 43 �ΰ��� �Է¹����� �׻����� ���� 20�� 30�̴�. 
	���) 20,30,40
*/
public class �迭1_����08_������ {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		
		int value1 = 0;
		int value2 = 0;
		
		Scanner scan = new Scanner(System.in);
		value1 = scan.nextInt();
		value2 = scan.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(value1 < arr[i] && arr[i] < value2) {
				System.out.print(arr[i] + " ");
			}
			
		}
		
		
	}

}
