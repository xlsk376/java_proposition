package ____�ڹ�����7_�����迭;

import java.util.Arrays;
import java.util.Random;

/*
	[����]
		�Ʒ��迭�� �������� 0~9������ ���ڸ� ���� �����Ѵ�. 
		�ѹ迭�� ������ ������ Ȧ���� ���θ�Ƽ� �ϳ��� ���ڷ�ǥ�� �� ���
	
	(��) 
		arr1 ==> 1,5,4,4,0  ==> ���� Ȧ���� ������ 15 �̶������ϰ�,
	 	15 ��� 
*/  
public class �迭3_����04_�Ǽ����ڸ���� {
	public static void main(String[] args) {
		int arr1[] = new int[5];
		Random ran = new Random();
		int temp[] = null;
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = ran.nextInt(10);
		}
		System.out.println(Arrays.toString(arr1));
		int index = 0;
		int count = 0;
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] % 2 == 1) {
				count += 1;
			}
		}
		temp = new int[count];
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] % 2 == 1) {
				temp[index] = arr1[i];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(temp));
		
		
		
		
	}
}
