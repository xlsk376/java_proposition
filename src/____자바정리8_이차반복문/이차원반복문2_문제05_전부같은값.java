package ____�ڹ�����8_�����ݺ���;

import java.util.Arrays;

/*
	[����]
		arr1 �� arr2 ������ ������ ��� ������ �˻��Ͻÿ�.
		���� ������ true, Ʋ�� ���� �ϳ��� ������ false�� ����Ͻÿ�.
		��, ��ġ�� �޶� �������. 
		�ߺ��Ȱ��� �������ְ� �ϳ��� �� ��Ī�̵ȴ�.
	[����]
		true
 */

public class �������ݺ���2_����05_���ΰ����� {
	public static void main(String[] args) {

		int[] arr1 = {1, 2, 3, 1, 2, 3};
		int[] arr2 = {3, 2, 1, 2, 3, 1};
				
		for(int i = 0; i < arr1.length; i++) {
			for(int j = i + 1; j < arr1.length; j++) {
				if(arr1[i] > arr1[j]) {
					int temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = i + 1; j < arr1.length; j++) {
				if(arr2[i] > arr2[j]) {
					int temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		boolean check = false;
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] == arr2[i]) {
				check = true;
			}else {
				check = false;
				break;
			}
		}
		System.out.println(check);
		
		
	} 
}