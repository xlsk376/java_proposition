package ____�ڹ�����7_�����迭;

import java.util.Arrays;
import java.util.Random;

public class �迭0_����08_�߰� {

	public static void main(String[] args) {
		/*
	 	�������� ���� 5���� ����(1~9�����Ǽ���)���� �����Ѵ�. 
	 	Ȧ���� arr �迭�� �տ��� ���� �����ϰ� ¦���� arr �迭�� �ڿ��� ���� �����Ѵ�. 
	 	5���ݺ��ϰ� �迭 ���
	 	
	 	[��]
	 		2 ==> arr = {0,0,0,0,2};
	 		1 ==> arr = {1,0,0,0,2};
	 		4 ==> arr = {1,0,0,4,2};
	 		3 ==> arr = {1,3,0,4,2};
	 		2 ==> arr = {1,3,2,4,2};
		*/
		int arr[] = new int[5];
	
		Random ran = new Random();
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
				//System.out.println("r : " + r);
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
