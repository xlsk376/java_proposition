package ____�ڹ�����8_�����ݺ���;

import java.util.Arrays;
import java.util.Random;

public class �������ݺ���0_����04_�߰� {

	public static void main(String[] args) {
		/*
	 	�Ʒ� �迭�� �α��ھ� �÷����鼭 �����̸� ����غ���.
	 	
	 	[����]
	 		1 2
	 		1 2 3 1
	 		1 2 3 1 2 3
	 		1 2 3 1 2 3 1 2
	 		1 2 3 1 2 3 1 2 3 4
		 */
	
		int arr[] = {1,2,3,1,2,3,1,2,3,4};
		
		for(int i = 0; i < arr.length; i+=2) {
			for(int j = 0; j <= i+1; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
