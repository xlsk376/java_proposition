package ____�ڹ�����7_�����迭;

import java.util.Arrays;
import java.util.Random;

/*
	�Ʒ� �迭�� ������ -100 ~ 100�� 4�� ������ �װ��� ������ temp�� ������ arr�� temp ���.
	
	��) arr = { 20, 43, -11, 36 };
	 	temp = {0,0,-11,0};
*/
public class �迭2_����06_�������� {
	public static void main(String[] args) {		
		int arr[] = new int[4];
		int temp[] = new int[4];
		Random ran = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(201)-100;
			if(arr[i] < 0) {
				temp[i] = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		
		
		
		
	}
}
