package ____�ڹ�����6_�����ݺ���;

import java.util.Scanner;
/* 
	[����]
	[�ڸ���Ȧ��]
  		1 ~ 10000 ������ ���ڸ� �Է¹ް� �ڸ��� Ȧ���� ������ ����Ͻÿ�.
  	[����] 
     	561  : Ȧ�� 2��
  	 	1    : Ȧ�� 1��
  	 	668  : Ȧ�� 0��
  	 	9999 : Ȧ�� 4�� 
*/
public class �ݺ���7_����01_�ڸ���Ȧ��2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("����(1~10000) �Է� : ");
		int num = scan.nextInt();
		int count = 0;
		while(true) {
			if(num == 0) {
				break;
			}
			int a = num % 10;
			if(a % 2 == 1) {
				count += 1;
			}
			num = num / 10;
		}
		System.out.println("Ȧ�� " + count + "��");
		scan.close();
	}
}
