package ____�ڹ�����7_�����迭;

import java.util.Random;

/*
	index �� ���ڸ� �Ѱ��� �Է¹ް� arr �迭���� index ���� ū�ε����� ���鸸 ��� 
	
	��) �Է� : 3 
	���� ) ������ �ε��� 3�� �Է¹����� arr[3] ���� 40�̹Ƿ� 40���� ū���� 50�̴�.	 	
	���) 50
*/
public class �迭1_����01_ū�ε��� {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		
		int index = 0;
		
		Random ran = new Random();
		int r = ran.nextInt(arr.length);
		System.out.println(r);
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == arr[r]) {
				index = i;
			}
		}
		
		
	}

}
