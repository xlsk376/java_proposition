package ____�ڹ�����8_�����ݺ���;

import java.util.Arrays;

/*
[���� ���]
		���� ������ ��ȣ�� ���� ��� 
*/

public class �������ݺ���2_����02_������� {

	public static void main(String[] args) {

		int[] numList = {1001, 1002, 1003, 1004};
		int[] scoreList = { 87, 42, 11, 98};
		int index = 0;
		int max = 0;
		for(int i = 0; i < scoreList.length; i++) {
			for(int j = 0; j < i; j++) {
				if(scoreList[i] > scoreList[j]) {
					System.out.println(i + " " + j);
					int temp = scoreList[j];
					scoreList[j] = scoreList[i];
					scoreList[i] = temp;
					int temp1 = numList[j];
					numList[j] = numList[i];
					numList[i] = temp1;
				}
			}
		}
		System.out.println(Arrays.toString(scoreList));
		System.out.println(Arrays.toString(numList));

		//�ε����� ���� ��Ȯ�� �����Ͽ� �ùٸ� ����� �ؾ��Ѵ�.
	}

}
