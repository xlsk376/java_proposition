package ____�ڹ�����7_�����迭;

import java.util.Arrays;

/*
	[����]
		arr�迭�� ������ ���������� ������ temp1�� �����ϰ�
		������ ������ temp1�� ������ ���� ���ں��� ���������� temp2�� �����Ͻÿ�.
		��, arr�� �迭�� ���̰� Ȧ���̸�,
		temp1�� �迭�� ũ�⸦ temp2 ���� ������ �� �� ��ŭ �� ũ�� ����
		���� �����Ͻÿ�.
	[����]
		temp1 = {12, 232, 3123, 14, 25}
		temp2 = {46, 27, 18, 569}
 */
public class �迭6_����02_ª���迭����� {
	public static void main(String[] args) {	
		int[] arr = {12, 232, 3123, 14, 25, 46, 27, 18, 569};	
		int[] temp1 = null;
		int[] temp2 = null;
		int n = arr.length/2;
		temp1 = new int[n+1];
		temp2 = new int[n];
		int index = 0;
		for(int i = 0; i < temp1.length; i++) {
			temp1[i] = arr[index];
			index += 1;
		}
		for(int i = 0; i < temp2.length; i++) {
			temp2[i] = arr[index];
			index += 1;
		}
		System.out.println(Arrays.toString(temp1));
		System.out.println(Arrays.toString(temp2));
		
		
	}
}