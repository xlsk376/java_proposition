package ____�ڹ�����7_�����迭;

import java.util.Arrays;
import java.util.Random;

/*
	[����]
		�Ʒ� �迭�� ������ -100 ~ 100 ������ �������� 4�� �����Ѵ�.
		�迭�� �������� ��� ¦���� true ����ϰ�,
		�ϳ��� ¦���� �ƴϸ� false�� ����Ѵ�.
		��, 0�� ¦���̴�.
 */
public class �迭3_����09_�迭¦�� {
	public static void main(String[] args) {
		
		int arr[] = new int[4];
		Random ran = new Random();
		boolean check = true;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(201)-100;
			if(arr[i] % 2 == 1 || arr[i] % 2 == -1) {
				check = false;
			}
		}
		System.out.println(Arrays.toString(arr));
		if(check == false) {
			System.out.println(check);
		}else {
			System.out.println(check + " ¦��");
		}
		
		
		
	} 
}