package ____�ڹ�����7_�����迭;

import java.util.Arrays;
/*
	[���ʿ�����]
	�������� ����(1,2)�� �����ϰ�
	���ڰ� 1�̸� �������� �б�
	���ڰ� 2�̸� ���������� �б�
 	��) 1) left ==> arr = {2,3,4,5,0,0,0,0,0};
 	��) 2) right ==> arr = {0,0,0,0,0,2,3,4,5};
*/
public class �迭5_����09_���ʿ����ʹб� {
	public static void main(String[] args) {
		int arr[] = {0,2,0,3,4,0,0,5,0};			
		int select = 2;
		int index = arr.length - 1;
		System.out.println(index);
		int index2 = index;
		if(select == 2) {
			for(int i = 0; i < arr.length; i++) {
				if(arr[index] != 0) {
					int temp = arr[index];
					arr[index] = arr[index2];
					arr[index2] = temp;
					index2 -= 1;
				}
				index -= 1;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
