package ____�ڹ�����5_���ǹ�;

import java.util.Scanner;
/*
	[����] 
	[��ū����]
		���� 2���� �Է¹ް� ��ū������ ���� ����Ͻÿ�.
	[����]
		a = 10;
		b = 20;
	[���]
		20
 */
public class ���ǹ�1_����03_��ū����2 {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		System.out.println("����1 �Է� : ");
		a = scan.nextInt();
		System.out.println("����2 �Է� : ");
		b = scan.nextInt();
		if(a > b) {
			System.out.println(a);
		}
		if(a < b) {
			System.out.println(b);
		}
		scan.close();
	}
}
