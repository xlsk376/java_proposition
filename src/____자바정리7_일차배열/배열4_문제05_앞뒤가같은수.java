package ____�ڹ�����7_�����迭;

import java.util.Arrays;

/*
	�Ʒ��迭���� ������ ������ ���� ����������� �Ǻ��Ͻÿ�.	
	��������̸� true , �ٸ�����̸� false ���
	[����]
		154451 �� �������� ������ ���� ��������̴�.
		154751 �� �������� ������ ���� �ٸ�����̴�.
 */
public class �迭4_����05_�յڰ������� {	
	public static void main(String[] args) {
		int arr1[] = {1,5,4,4,5,1};	
		int arr2[] = {1,5,4,7,5,1};
		
		int index = arr1.length-1;
		boolean check = false;
		for(int i = 0; i < arr1.length/2; i++) {
			if(arr2[i] != arr2[index]) {
				check = true;
				break;
			}
			index -= 1;
		}
		if(check == true) {
			System.out.println(Arrays.toString(arr2));
			System.out.println("�ٸ� ���");
		}else {
			System.out.println(Arrays.toString(arr1));
			System.out.println("���� ���");
		}
		
		
		
	}
}
