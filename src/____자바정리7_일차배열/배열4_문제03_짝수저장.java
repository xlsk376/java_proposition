package ____�ڹ�����7_�����迭;

import java.util.Arrays;

/*
	[����1] �Ʒ������� ��� ������Ű�ÿ�.
	 	[����1] �Ʒ� �迭 a �� b �� ���ؼ� ���� ���� c�� �����Ѵ�.
	  	[����2] c�� ���߿��� ¦���� d�� �����Ѵ�.
	  	[����3] d�� �����Ҷ��� �տ������� ���������� �����Ѵ�. 		
	 	��) c[] = {23,74,47,82,51}
	 	��) d[] = {74,82,0,0,0}
*/
public class �迭4_����03_¦������ {
	public static void main(String[] args) {	
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 13, 54, 17, 42, 1 };
		int c[] = { 0,0,0,0,0};
		int d[] = { 0,0,0,0,0};
		int index = 0;
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
			if(c[i] % 2 == 0) {
				d[index] = c[i];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		
	}
}
