package ____�ڹ�����7_�����迭;

import java.util.Arrays;
import java.util.Random;

/*
	�Ʒ� �迭�� ������ -100 ~ 100�� 4�� ������ �װ��� Ȧ���� �ո� ��� 
	
	��) arr = { -11, 4, 73, -2 };
	
	���) (-11 + 73) ==> 62
*/
public class �迭2_����04_����Ȧ���� {

	public static void main(String[] args) {
		
		int arr[] = new int[4];
		
		Random ran = new Random();
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(201)-100;
			if(arr[i] % 2 == 1 || arr[i] % 2 == -1) {
				total += arr[i];
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(total);
	}

}
