package ____�ڹ�����8_�����ݺ���;

import java.util.Arrays;
import java.util.Random;

public class �������ݺ���0_����01_�߰� {

	/*
	 * [1] ����(1~9�����Ǽ���) �� ¦���� ���� �ټ����� ���� �迭�� ù��° �ڸ��� �����Ѵ�. [2] �ε������� �������� 5���ݺ��Ѵ�.
	 * 
	 * [����] [0���ε���] 2, 6, 4 ,2, 8 => total = 22 arr = {22, 0,0,0,0}; [1���ε���] 6, 4, 4
	 * ,2, 2 => total = 18 arr = {22, 18, 0, 0, 0}; ...
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = new int[5];

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int total = 0;
			while (true) {
				int r = ran.nextInt(9) + 1;
				System.out.print(r + " ");
				if (r % 2 == 0) {
					total += r;
					count += 1;
				}
				if (count == 5) {
					break;
				}
			}
			System.out.println();
			arr[i] = total;
		}
		System.out.println(Arrays.toString(arr));
	}

}
