package ____�ڹ�����8_�����ݺ���;

import java.util.Arrays;

public class �������ݺ���2_����11_�迭�ΰ����� {
	/*
	 * [����]
	     �� �迭�� �ϳ��� ��ġ�� �����������������Ͻÿ�.	
		 ��) 1,2,3,5,7,8,9,10,12,15,19,20
	 */
	public static void main(String[] args) {
		int[] arr1 = {9,10,3,2,20,19};
		int[] arr2 = {15,12,1,5,7,8};	
		int[] temp = null;
		int size1 = arr1.length;
		int size2 = arr2.length;
		
		temp = new int[size1 + size2];
		int count = 0;
		for(int i = 0; i < temp.length; i++) {
			if(i < arr1.length) { // i : 0 ~ 5
				temp[i] = arr1[i];
			}else {
				temp[i] = arr2[i - arr1.length]; // i : 6 ~ 11
			}
			count += 1;
		}
		System.out.println(Arrays.toString(temp));
		
		for(int i = 0; i < temp.length; i++) {
			for(int j = i + 1; j < temp.length; j++) {
				if(temp[i] > temp[j]) {
					int t = temp[i];
					temp[i] = temp[j];
					temp[j] = t;
				}
				count += 1;
			}
		}
		System.out.println(count + "ȸ�� ");
		System.out.println(Arrays.toString(temp));
		
		//�ݺ�Ƚ���� ���̴� ��� üũ => j = i + 1;
		
	}
		
}
