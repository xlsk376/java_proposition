package ____�ڹ�����5_���ǹ�;

import java.util.Scanner;
/*
	[����]
	[������ ����]
		[1] ������ ������ �����ϱ� ����, ���� 2���� �Է¹޴´�.
		[2] �Է¹��� ���ڸ� ����� ������ ������ ����Ѵ�. (��) 3 * 2 =
		[3] ������ �Է¹޴´�.
		[4] ������ �� "����" �Ǵ� "��"�� ����Ѵ�.
 */
public class ���ǹ�1_����05_������2 {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		System.out.println("����1 �Է� : ");
		int a = scan.nextInt();
		System.out.println("����2 �Է� : ");
		int b = scan.nextInt();
		System.out.print(a + " * " + b + " = ");
		int c = scan.nextInt();
		if(a * b == c) {
			System.out.println("����");
		}
		if(a * b != c) {
			System.out.println("��");
		}
		scan.close();
	}
}
