package ____�ڹ�����5_���ǹ�;
import java.util.Scanner;
/*
	[����]
		�ýñ⺻����� 10000���̴�.		
		�⺻������δ�  10km ���� �̵��Ҽ��ִ�. 		
		10km�̻� �̵��� �߰������ �߻��Ѵ�.		
		�߰������ 3km�̵� �Ҷ����� 2300���� ����� �߰��ȴ�.			
		�̵��Ÿ��� �Է¹ް� ����� ����Ͻÿ�.	
		�̵��Ÿ��� 0�����ϰ�� "����" ����Ͻÿ�.
*/
public class ���ǹ�2_����03_�ýÿ��2 {
	public static void main(String[] args) {			
		Scanner scan = new Scanner(System.in);		
		int �⺻��� = 10000;
		System.out.println("�̵��Ÿ��� �Է� : ");
		int �̵��Ÿ� =scan.nextInt();
		if(�̵��Ÿ� <= 0 ) {
			System.out.println("����");
		}
		if(�̵��Ÿ� >= 1 && �̵��Ÿ� <= 10 ) {
			System.out.println(�⺻���);
		}
		if(�̵��Ÿ� > 10) {
			int �߰��̵��Ÿ� = �̵��Ÿ� - 10;
			int �߰���� = �߰��̵��Ÿ� / 3;
			if(�߰��̵��Ÿ� % 3 > 0) {
				�߰���� = �߰���� + 1;
			}
			�߰���� = �߰���� * 2300;			
			System.out.println(�⺻��� + �߰����);		
		}
		scan.close();
	}
}
