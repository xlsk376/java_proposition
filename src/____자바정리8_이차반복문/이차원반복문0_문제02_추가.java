package ____�ڹ�����8_�����ݺ���;

import java.util.Arrays;
import java.util.Random;

public class �������ݺ���0_����02_�߰� {

	public static void main(String[] args) {
		Random ran = new Random();
		/*
		 �������� ���� 5���� �����Ѵ�. (1~9������ ����)
		 �������ڰ� Ȧ���̸� arr�迭�� �տ������� ���� (��, ���Ȧ������ �ڷ� �о��.)
		 �������ڰ� ¦���̸� arr�迭�� �ڿ������� ����(��, ��� ¦������ ������ �о��.)
		 �Ʒ� �߰� ������ �����Ѵ�. 
		 [����]
			3 ==> arr = {3,0,0,0,0}; // Ȧ���� �Ǿտ� 3����
		 	1 ==> arr = {1,3,0,0,0}; // ���� ��(3)�� �ڷ� �о�� Ȧ���� �Ǿտ� 1����
		  	2 ==> arr = {1,3,0,0,2}; // ¦���� �ǵڿ� 2����
		  	6 ==> arr = {1,3,0,2,6}; // ���� ��(2)�� ������ �о�� ¦���� �ǵڿ� 6����
		  	7 ==> arr = {7,1,3,2,6}; // ���� ��(1, 3)�� �ڷ� �о�� �Ǿտ� 7���� 
		 */
		int arr[] =new int[5];
		int count1 = 0;
		int count2 = 0;
		for(int i = 0; i < arr.length; i++) {
			int r = ran.nextInt(9)+1;
			System.out.println("r : " + r);
			if(r % 2 == 1) {
				int index1 = count1;
				for(int j = 0; j < count1; j++) {
					arr[index1] = arr[index1-1];
					index1 -= 1;
				}
				arr[0] = r;
				count1 += 1;
			}else {
				int index2 = 4-count2;
				for(int j = 0; j < count2; j++) {
					arr[index2] = arr[index2+1];
					index2 += 1;
				}
				arr[4] = r;
				count2 += 1;
			}
			System.out.println(Arrays.toString(arr));
		}
		
		
	}

}
