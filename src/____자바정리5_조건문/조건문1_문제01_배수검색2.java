package ____�ڹ�����5_���ǹ�;

import java.util.Scanner;
/*
	[����]
	[4�� ��� �Ǻ�] 		
		[1] ���� a�� ���ڸ� �Է¹޴´�.
		[2] �Է¹��� ������ ���� 4�� ����̸� "4�� ����̴�." �� ����Ͻÿ�.
		[3] 4�ǹ���� �ƴϸ� "4�� ����� �Ƶ��." �� ����Ͻÿ�.
		[4] ����� 4�� ������ �������� 0 �̸� 4�� ����̴�.
 */
public class ���ǹ�1_����01_����˻�2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		int a;
		System.out.println("�����Է� : ");
		a = scan.nextInt();
		if(a % 4 == 0) {
			System.out.println("4�� ����̴�.");
		}
		if(a % 4 != 0) {
			System.out.println("4�� ����� �ƴϴ�.");
		}
		scan.close();
	}
}
