package ____�ڹ�����5_���ǹ�;

import java.util.Scanner;
/*
	[����]
  	[����]
  		���������� �Է¹޴´�. 
  		�Ʒ� ����ǥ�� ������ ���������� �ش��ϴ� ������ ����Ͻÿ�.
  	[����ǥ]
  		100~91 ���̴� "A",
  		90~81 ���̴� "B",
  		80~0 ���̴� "�����"
  	[�߰�����1] 		
  		[1] �����̰ų�, A������ B������ ���� �ڸ��� 7���̻��̸� �����ڿ� "+" �߰��Ͻÿ�.
  		[2] A������ B������ ���� �ڸ��� 3�������̸� �����ڿ� "-"�� �߰��Ͻÿ�. 
  		[3] 100���� ũ�ų� 0 ���� �������ڸ� �Է��ϸ� "����" �� ����Ͻÿ�.
  	[����] 
  		[�Է�] 100 [���] "A+"
      	[�Է�] 87  [���] "B+"
      	[�Է�] 82  [���] "B-"
      	[�Է�] 23  [���] "�����"
      	[�Է�] 101 [���] "����"
 */
public class ���ǹ�1_����06_����2 {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);	
		System.out.println("���� �Է� : ");
		int score = scan.nextInt();
		if(score > 100 || score < 0) {
			System.out.println("����");
		}
		if(score <= 100 && score >= 97) {
			System.out.println("A+");
		}
		if(score <= 96 && score >= 94) {
			System.out.println("A");
		}
		if(score <= 93 && score >= 91) {
			System.out.println("A-");
		}
		if(score <= 90 && score >= 87) {
			System.out.println("B+");
		}
		if(score <= 86 && score >= 84) {
			System.out.println("B");
		}
		if(score <= 83 && score >= 81) {
			System.out.println("B-");
		}
		if(score <= 80 && score >= 0) {
			System.out.println("�����");
		}
		scan.close();
	}
}
