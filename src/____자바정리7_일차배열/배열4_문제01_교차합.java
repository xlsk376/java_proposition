package ____�ڹ�����7_�����迭;

import java.util.Arrays;

/*
	[������]	
	arr1�� �տ������� �ڷ� �ݺ��Ѵ�.
	arr2�� �ڿ������� ������ �Ųٷ� �ݺ��Ѵ�. 	
	b�� arr1 �� arr2 ������ ���� ���� ������ ����Ѵ�. 	
	��) b[0] = arr1[0] + arr2[4] 
	��) b[1] = arr1[1] + arr2[3] 
*/
public class �迭4_����01_������ {
	public static void main(String[] args) {		
		int arr1[] = {11,21,31,41,51};
		int arr2[] = {25,26,27,28,29};
		int b[] = new int[5];
		int index = arr2.length-1;
		for(int i = 0; i < arr1.length; i++) {
			b[i] = arr1[i] + arr2[index];
			index -= 1;
		}
		System.out.println(Arrays.toString(b));
		
	}
}
