package ____�ڹ�����7_�����迭;

import java.util.Arrays;

/*
	[����1] 
 		array1�迭 �� array2�迭�� ���ڸ��� ���� temp1������
 		temp1 = {10 + 5 , 20 + 8, 30 + 54, 40 + 32, 50 + 1};		
	[����2] 
 		array1�迭 �� array2�迭�� ���ڸ��� ���� temp2������
 		temp2 = {10 - 5 , 20 - 8, 30 - 54, 40 - 32, 50 - 1};
*/
public class �迭2_����05_���ϱ⻩�� {
	public static void main(String[] args) {
		int array1[] = {10,20,30,40,50};
		int array2[] = {5,8,54,32,1};
		int temp1[] = new int[5];
		int temp2[] = new int[5];
		
		for(int i = 0; i< array1.length; i++) {
			temp1[i] = array1[i] + array2[i];
		}
		System.out.println(Arrays.toString(temp1));
		
		for(int i = 0; i < array1.length; i++) {
			temp2[i] = array1[i] - array2[i];
		}
		System.out.println(Arrays.toString(temp2));
	}
}
