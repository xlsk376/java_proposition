package ____�ڹ�����5_���ǹ�;

import java.util.Scanner;
/*
	[����]
	[����(0) ����(1) ��(2) ����]
		[1] player1 �� "����" , "����" , "��" �� �Է¹޴´�.
		[2] player2 �� "����" , "����" , "��" �� �Է¹޴´�.
		[3] player1�� player2�� ���ؼ� "���" "�¸�" "�й�" �� ����Ѵ�.
*/
public class ���ǹ�3_����01_�������������ڿ�2 {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("��������������");
		System.out.println("player1 �Է� : ");
		String player1 = scan.next();
		System.out.println("player2 �Է� : ");
		String player2 = scan.next();
		if(player1.equals(player2)) {
			System.out.println("���");
		}
		if(player1.equals("����") && player2.equals("����")) {
			System.out.println("p2 �¸�");
		}
		if(player1.equals("����") && player2.equals("��")) {
			System.out.println("p2 �¸�");
		}
		if(player1.equals("��") && player2.equals("����")) {
			System.out.println("p2 �¸�");
		}
		if(player1.equals("����") && player2.equals("��")) {
			System.out.println("p1 �¸�");
		}
		if(player1.equals("����") && player2.equals("����")) {
			System.out.println("p1 �¸�");		
		}
		if(player1.equals("��") && player2.equals("����")) {
			System.out.println("p1 �¸�");
		}
		scan.close();
	}
}
