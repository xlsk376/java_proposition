package ____�ڹ�����7_�����迭;

import java.util.Scanner;

/*
	index �� ���ڸ� �Ѱ��� �Է¹ް� arr �迭���� index ���� ū�ε����� ������ �� ��� 
	
	��) �Է� : 1
	���� ) ������ �ε��� 1�� �Է¹����� arr[1] ���� 20�̹Ƿ� 20����ū���� 30,40,50�̴�. 	
	���) 120
*/
public class �迭1_����02_ū�ε������� {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		
		int index = 0;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]== arr[n]) {
				index = i;
			}
		}
		int total = 0;
		for(int i = index+1; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println();
		System.out.println(total);
		
		
		
	}

}
