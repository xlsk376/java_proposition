package ____�ڹ�����5_���ǹ�;

import java.util.Scanner;
/*
	[����]
	[���ٿ�]
 		���ڸ� �Է¹ް� com �� ���Ͽ� ũ�� "up" , 
 		������ "bingo" , ������ "down" �� ����Ͻÿ�.		
 		[1] ���� a�� ���ڸ� �Է¹޴´�.
 		[2] com �� a �� ���Ѵ�.
 		[3] ����� ����Ѵ�.
	[����]
		a = 10;
	[���]
		"up"
 */
public class ���ǹ�1_����02_���ٿ�2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		int com = 8;
		int a;
		System.out.println("���� �Է� : ");
		a = scan.nextInt();
		if(a > com) {
			System.out.println("up");
		}
		if(a == com) {
			System.out.println("bingo");
		}
		if(a < com) {
			System.out.println("down");
		}
		scan.close();
	}
}
