package ____�ڹ�����5_���ǹ�;

import java.util.Random;
import java.util.Scanner;

public class ���ǹ�0_����01_�߰� {
	public static void main(String[] args) {
		/*
		[����¡ ����ũ]
		[�̻��� ������ ���ڱ�Ģ]
			���� 1~5 ���̸� a �������ϸ� , num �� 1 ������ ���
			���� 6~10 ���̸� a �������ϸ� , num �� 2 ������ ���
			���� 11~15 ���̸� a�� �����ϸ�, num �� 3 ������ ���
			���� 16~20 ���̸� a �� �����ϸ�, num �� 4 ������ ���
			....
			....
			���� 96~100 ���̸� a �� �����ϸ� , num �� 20�� ������ ��� 
		
	 */
		Random ran = new Random();
		//int r = ran.nextInt(100)+1;
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int n = 0;
		System.out.println(r);
		if(r % 5 == 0) {
			n = r / 5;
		}else {
			n = (r+5)/5;
		}
		System.out.println(n);
		
		
		
		
	}
}
