package ____�ڹ�����5_���ǹ�;

import java.util.Random;
import java.util.Scanner;
/*
	[����]
	[���� ������ ����]
		[1] ������ ������ �����ϱ� ����, ����(1~9) 2���� �������������Ѵ�.
	  	[2] ������ ������ ����Ѵ�. (��)	3 x 7 = 
	  	[3] ������ �ش��ϴ� ������ �Է¹޴´�.
	  	[4] ������ �� "����" �Ǵ� "��"�� ����Ѵ�.
 */

public class ���ǹ�4_����01_����������2 {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int a = ran.nextInt(9) + 1;
		int b = ran.nextInt(9) + 1;
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
