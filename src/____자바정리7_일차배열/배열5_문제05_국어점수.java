package ____�ڹ�����7_�����迭;

import java.util.Arrays;

/*
	[�л��˻�]
		�Ʒ��迭�� 3���� �л��������̴�.		
		�� �л��� 3���� �����ͷ� ǥ���Ѵ�. 
		�Ǿ��� ��ȣ , �״����� �������� , �״��� ���������̴�.					
		(��) 
			1001�� , ���� 20 , ���� 30
			1002�� , ���� 43 , ���� 23
			1003�� , ���� 45 , ���� 1		
		�Ʒ� �л�3���� ���������� �������� ���� ���� �л���ȣ�� 
		b������ 
		�� �տ��� ���� ����	
*/
public class �迭5_����05_�������� {
	public static void main(String[] args) {
		int arr[] = {1001, 20, 30, 1002, 43, 23, 1003, 45, 1}; // 1,2  4,5  7,8
		int b[] = new int[3];
		int index = 1;
		int bindex = 0;
		for(int i = 1; i < arr.length; i+=3) {
			if(arr[i] > arr[i+1]) {
				b[bindex] = arr[i-1];
				bindex += 1;
			}
		}
		System.out.println(Arrays.toString(b));
		
	}
}