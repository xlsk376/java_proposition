package ____�ڹ�����7_�����迭;

import java.util.Arrays;

/*
	[�л��˻�]
		�Ʒ��迭�� 3���� �л��������̴�.	
		�� �л��� 3���� �����ͷ� ǥ���Ѵ�. 
		�Ǿ��� ��ȣ , �״����� �������� , �״��� ���������̴�.
	[����]
		�� ������ ����� 60�̻��̸� �հ��̴� �հ��� �л��� ��ȣ��
		b�� ���� 
		�� �ڿ��� ���� �Ųٷ� ���� 	
	[���]
		b = {0,1003,1001};
*/
public class �迭5_����06_�հݰŲٷ����� {
	public static void main(String[] args) {
		int arr[] = {1001, 77, 80, 1002, 43, 63, 1003, 75, 61};	
		int b[] = new int[3];
		int index = 2;
		for(int i = 1; i < arr.length; i+=3) {
			int avg = (arr[i] + arr[i+1])/2;
			if(avg >= 60) {
				b[index] = arr[i-1];
				index -= 1;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}