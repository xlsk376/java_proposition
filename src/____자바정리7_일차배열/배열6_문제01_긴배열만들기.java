package ____�ڹ�����7_�����迭;

import java.util.Arrays;

/*
	[����]
		temp1 �� �迭�� ����� 
		temp2 �� �迭�� ������  ��ģ ������ŭ arr �迭�� ��������, 
		temp1 �迭�� ������ ���������� arr �������ϰ� , 
		temp2�� �迭�� ������  ���������� arr �� �������� ���.	
	[����]	
 */
public class �迭6_����01_��迭����� {
	public static void main(String[] args) {
		int[] temp1 = {1,2,3,4,5};
		int[] temp2 = {4,5,6,7,8,9};
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