package ____�ڹ�����7_�����迭;

import java.util.Arrays;

/*
	[����2] ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� c �� ����
	[����] ��ġ�� �ڿ��� ���� �����Ѵ�. 
	[��]   c = { 0, 0, 17, 51, 49 }
 */
public class �迭4_����04_Ȧ���Ųٷ����� {	
	public static void main(String[] args) {
		int arr[] = { 10, 49, 51, 36, 17 };	
		int c[] = { 0,0,0,0,0 };

		int index = arr.length-1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 1) {
				c[index] = arr[i];
				index -= 1;
			}
		}
		System.out.println(Arrays.toString(c));
		
		
	}
}
