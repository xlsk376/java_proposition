package ____�ڹ�����7_�����迭;

import java.util.Arrays;
import java.util.Random;

public class �迭0_����07_�߰� {

	public static void main(String[] args) {
		/*
		 *  �ΰ��� ���� a, b�� ���ڸ� ����(1~9������ ����)���� �����Ѵ�.
		 *  �κ����� a �� ���� ��ũ�� arr1 �迭�� �����Ѵ�.
		 *  b�� ���� ��ũ�� arr2 �迭�� �����Ѵ�. 
		 *  �տ������� ���������� �����Ѵ�. 
		 *  ���࿡ ���� ������ �Ѵ� �����Ѵ�. 
		 *  
		 *  �Ѵټ����� �ݺ��ϰ� �迭��� 
		 *  
		 *  [����]
		 *  	a : 7 , b : 3 ==> arr1 = {7,0,0,0,0}; arr2 = {0,0,0,0,0};
		 *  	a : 4 , b : 8 ==> arr1 = {7,0,0,0,0}; arr2 = {8,0,0,0,0};
		 *  	a : 2 , b : 6 ==> arr1 = {7,0,0,0,0}; arr2 = {8,6,0,0,0};
		 *  	a : 3 , b : 3 ==> arr1 = {7,3,0,0,0}; arr2 = {8,6,3,0,0};
		 */
		int arr1[] = new int[5];
		int arr2[] = new int[5];
		Random ran = new Random();
		int index1 = 0;
		int index2 = 0;
		for(int i = 0; i < 5; i++) {
			int a = ran.nextInt(9)+1;
			int b = ran.nextInt(9)+1;
			System.out.println(a + " " + b);
			if(a > b) {
				arr1[index1] = a;
				index1 += 1;
			}else if(a == b){
				arr1[index1] = a;
				arr2[index2] = a;
				index1 += 1;
				index2 += 1;
			}else {
				arr2[index2] = b;
				index2 += 1;
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}
