package ____�ڹ�����5_���ǹ�;

import java.util.Random;
/*
	[����]
		������ 1 ~ 6 �� �ֻ��� 2���� �ִ�.
		�ֻ��� 2���� ������ ���¼����� ���� ����Ͻÿ�.
		�� �ֻ��������� ���� ���ٸ� ������ �ι踦 ����Ͻÿ�.
	[����]
		2, 3 : 5
		3, 3 : 6 * 2
*/
public class ���ǹ�4_����07_�ֻ���2 {
	public static void main(String[] args) {	
		Random ran = new Random();
		int a = ran.nextInt(6) + 1;
		int b = ran.nextInt(6) + 1;
		int c = a + b;
		System.out.println(a + " " + b);
		if(a == b) {
			System.out.println(c * 2);
		}
		if(a != b) {
			System.out.println(c);
		}
	}
}
