package ____�ڹ�����5_���ǹ�;

import java.util.Scanner;
/*
	[����]
	[����(0) ����(1) ��(2) ����]
		[1] "����","����","��"�� 0,1,2 ���ڷ� ���ǥ���Ѵ�.
		[2] player1 �� 0~2 ������ ���ڸ� �Է¹޴´�. 
		[3] player2 �� 0~2 ������ ���ڸ� �Է¹޴´�. 
		[4] player1�� player2�� ���ؼ� "���" "�¸�" "�й�" �� ����Ѵ�.
*/
public class ���ǹ�3_����02_��������������2 {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		System.out.println("��������������");
		System.out.println("player1 �Է� : ");
		int player1 = scan.nextInt();
		System.out.println("player2 �Է� : ");
		int player2 = scan.nextInt();
		if(player1 == player2) {
			System.out.println("���");
		}
		if(player1 == 0 && player2 == 1) {
			System.out.println("p2 �¸�");
		}
		if(player1 == 1 && player2 == 2) {
			System.out.println("p2 �¸�");
		}
		if(player1 == 2 && player2 == 0) {
			System.out.println("p2 �¸�");
		}
		if(player1 == 0 && player2 == 2) {
			System.out.println("p1 �¸�");
		}
		if(player1 == 1 && player2 == 0) {
			System.out.println("p1 �¸�");		
		}
		if(player1 == 2 && player2 == 1) {
			System.out.println("p1 �¸�");
		}
		scan.close();
	}
}
