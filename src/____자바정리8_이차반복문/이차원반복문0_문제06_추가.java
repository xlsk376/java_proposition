package ____�ڹ�����8_�����ݺ���;

import java.util.Arrays;
import java.util.Random;

public class �������ݺ���0_����06_�߰� {

	public static void main(String[] args) {
		/*
	 	�Ʒ� �迭�� �ڿ������� �ѱ��ھ� �÷����鼭 �����̸� ����غ���.
	 	
	 	[����]
	 		7
	 		6 7
	 		5 6 7
	 		4 5 6 7
	 		3 4 5 6 7
	 		2 3 4 5 6 7
	 		1 2 3 4 5 6 7
		 */
	
		int arr[] = {1,2,3,4,5,6,7};
		for(int i = 0; i < arr.length; i++) {
			int index = arr.length-1;
			for(int j = 0; j <= i; j++) {
				System.out.print(arr[index-i] + " ");
				index += 1;
			}
			System.out.println();
		}
		
	}

}
