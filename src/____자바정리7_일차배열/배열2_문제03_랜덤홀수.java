package ____�ڹ�����7_�����迭;
/*
	�Ʒ� �迭�� ������ -100 ~ 100�� 4�� ������ �װ��� Ȧ���� ��� 
	
	��) arr = { -11, 4, 73, -2 };
	���) -11 , 73
*/

import java.util.Arrays;
import java.util.Random;

public class �迭2_����03_����Ȧ�� {

	public static void main(String[] args) {
		
		int arr[] = new int[4];
		
		Random ran = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(201)-100;
			if(arr[i] % 2 == 1 || arr[i] % 2 == -1) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
