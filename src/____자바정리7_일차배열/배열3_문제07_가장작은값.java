package ____�ڹ�����7_�����迭;

import java.util.Arrays;
import java.util.Random;

/*
	[����]
		array �迭�� -100~100������ �������� Ȧ���� 5�� �����Ѵ�. 
		���� ������������ �ε����� ���� ����Ѵ�. 
*/
public class �迭3_����07_���������� {
	public static void main(String[] args) {
		int array[] = new int[5];
		Random ran = new Random();
		int max = 0;
		int index = 0;
		for(int i = 0; i < 5;) {
			int r = ran.nextInt(201)-100;
			if(r % 2 == 1 || r % 2 == -1) {
				array[i] = r;
				if(max < array[i]) {
					max = array[i];
				}
				i += 1;
			}
		}
		System.out.println(Arrays.toString(array));
		int min = max;
		for(int i = 0; i < 5; i++) {
			if(min > array[i]) {
				min = array[i];
				index = i;
			}
		}
		System.out.println(min + " " + index);
		
	}
}
