package ____�ڹ�����7_�����迭;

import java.util.Arrays;
import java.util.Random;

public class �迭0_����02_�߰� {
	/*
	[����]
		�Ʒ� �迭�� ������ 1 ~ 9 ������ �������� 4�� �������� ����Ѵ�. 
		�迭�� �������� ��� ¦���� true ����ϰ�,
		�ϳ��� ¦���� �ƴϸ� false�� ����Ѵ�.
		��, 0�� ¦���̴�.
		[����] 
			[4, 6, 2, 0] true
			[5, 2, 0, 4] false
 */
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = new int[4];
		
		boolean check = true;
		for(int i = 0; i < 4; i++) {
			arr[i] = ran.nextInt(9)+1;
			if(arr[i] % 2 == 1) {
				check = false;
			}
		}
		System.out.println(Arrays.toString(arr));
		if(check == true) {
			System.out.println(check + "¦���迭");
		}else {
			System.out.println(check);
		}
	}
}
