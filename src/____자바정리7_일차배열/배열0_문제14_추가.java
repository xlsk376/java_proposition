package ____�ڹ�����7_�����迭;

import java.util.Arrays;
import java.util.Random;

public class �迭0_����14_�߰� {

	public static void main(String[] args) {
		/*
		[����]
			temp1 �� �迭�� ����� 
			temp2 �� �迭�� ������  ��ģ ������ŭ arr �迭�� ��������, 
			temp1 �迭�� ������ ���������� arr �� �����ϰ�, 
			temp2�� �迭�� ������  ���������� arr �� �������� ���.	
		[����]	
		
			arr = {10,20,30,40,400,500,600,700,800,900};
		
		*/
			
		int[] temp1 = {10,20,30,40};
		int[] temp2 = {400,500,600,700,800,900};
		int[] arr = null;
		arr = new int[temp1.length+temp2.length];
		int index = 0;
		for(int i = 0; i < temp1.length; i++) {
			arr[index] = temp1[i];
			index += 1;
		}
		for(int i = 0; i < temp2.length; i++) {
			arr[index] = temp2[i];
			index += 1;
		}
		System.out.println(Arrays.toString(arr));
		
	
	}
}
