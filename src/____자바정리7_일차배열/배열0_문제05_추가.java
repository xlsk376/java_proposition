package ____�ڹ�����7_�����迭;

import java.util.Arrays;
import java.util.Scanner;

public class �迭0_����05_�߰� {
	/*
	[����] 
	�Ʒ� �迭 c�� ��ȣ�� ���� �ѽ��� �迭�̴�. 
	��ȣ�� �ϳ��� �Է¹ް� c�迭�� �ִ� ��ȣ�̸�, 
	�׹�ȣ��  ���� �����ϰ� d�迭�� �����Ѵ�.
	[��]  
		c[] = { 1001, 40, 1002, 65, 1003, 70 };
		�Է� : 1002 
		c[] = {1001, 40, 1003, 70}; 
 */
	public static void main(String[] args) {
		int c[] = { 1001, 40, 1002, 65, 1003, 70 };
		int d[] = null;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		int index = 0;
		
		for(int i = 0; i < c.length; i+=2) {
			if(n != c[i]) {
				count += 2;
			}
		}
		System.out.println(count);
		d = new int[count];
		for(int i = 0; i < c.length; i+=2) {
			if(n != c[i]) {
				d[index] = c[i];
				index += 1;
				d[index] = c[i+1];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(d));
		
	}
}
