package ____�ڹ�����8_�����ݺ���;

import java.util.Arrays;
import java.util.Random;

public class �������ݺ���0_����05_�߰� {

	public static void main(String[] args) {
		/*
		 * �Ʒ� arr �迭�� ���ڸ�ŭ ��������(1~9)�� �̴´� �׷������ڵ��� ���� total �迭�� �����Ѵ�.
		 * 
		 * [����] arr[0] = 1 �̹Ƿ� �������ڸ� �Ѱ� �̴´�. r = 5 ==> total = {5,0,0,0,0}; arr[1] = 3
		 * �̹Ƿ� �������ڸ� �����̴´�. r = 1, 4, 3 ==> total = {5,8,0,0,0}; ...
		 * 
		 */

		int arr[] = { 1, 3, 5, 3, 2 };
		int total[] = new int[5];
		Random ran = new Random();
		for(int i = 0; i < arr.length; i++) {
			int r = ran.nextInt(arr.length);
			System.out.println("r : " + r);
			for(int j = 0; j < arr[r]; j++) {
				total[i] += arr[j];
			}
		}
		System.out.println(Arrays.toString(total));
		
	}

}
