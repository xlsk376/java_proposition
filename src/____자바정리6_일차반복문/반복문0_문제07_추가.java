package ____�ڹ�����6_�����ݺ���;

import java.util.Random;

public class �ݺ���0_����07_�߰� {
	public static void main(String[] args) {
		/*
		 * �������� 1~5 �� �Է¹ް�, 
		 * ���������� ���� ��ŭ ���ڸ� ���ϴ� ������ ����� ����Ͻÿ�..
		 * �� ���ϱ��� ���ڵ��� 1~9������ �������ڿ����Ѵ�. 
		 * �Ʒ� [���] �ڿ� ������ ���� �Ȱ��� ������� ����Ѵ�. 
		 * (��, ���ڴ� �����̹Ƿ� ���ڴ� �ٸ��� ���ü��ִ�,)
		 * 
		 * [����1]
		 * 		�������� 1~5�� �Է��Ͻÿ�.
		 * 		3
		 * 		[���] 5 + 3 + 2 = 
		 * 
		 * [����2]
		 * 		�������� 1~5�� �Է��Ͻÿ�.
		 * 		5
		 * 		[���] 6 + 5 + 2 + 7 + 8 = 
		 */
		
		Random ran = new Random();
		int r = ran.nextInt(5)+1;
		System.out.println("r : " + r);
		for(int i = 0; i < r; i++) {
			int r1 = ran.nextInt(9)+1;
			System.out.print(r1);
			if(i < r-1) {
				System.out.print(" + ");
			}
		}
		System.out.println(" = ");
	
	}
}
