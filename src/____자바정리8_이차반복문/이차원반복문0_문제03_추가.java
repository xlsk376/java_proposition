package ____�ڹ�����8_�����ݺ���;

import java.util.Arrays;
import java.util.Random;

public class �������ݺ���0_����03_�߰� {

	public static void main(String[] args) {
		/*
	 	�Ʒ� �迭�� �ѱ��ھ� �÷����鼭 �����̸� ����غ���.
	 	
	 	[����]
	 		1
	 		1 2
	 		1 2 3
	 		1 2 3 1
	 		1 2 3 1 2
	 		1 2 3 1 2 3
	 		1 2 3 1 2 3 1
	 		1 2 3 1 2 3 1 2
	 		1 2 3 1 2 3 1 2 3
	 		1 2 3 1 2 3 1 2 3 4
		*/
	
		int arr[] = {1,2,3,1,2,3,1,2,3,4};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
	
	
	
	}

}
