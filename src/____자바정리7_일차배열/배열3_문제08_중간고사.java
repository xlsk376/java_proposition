package ____�ڹ�����7_�����迭;

import java.util.Arrays;
import java.util.Scanner;

/*
	�Ʒ��� �̹� �߰���� �������̴�. 
	��������� ���� , ���� , �����̰� ������ �Ʒ��Ͱ���.
	���� ������ ���� ���Ͻÿ�.	
	[1] ������ �Է¹ް� ������ �ش��ϴ� �л��� ��ȣ , �̸��� ��� 
	[2] ������ ������ �Ҽ������ڸ�
	[3] ��ȣ�� �Է¹ް� �̸�, ����, ������ ���
	[4] ������������ 1���� ��ȣ, �̸�, ����, �������
	[5] ���������� 1���� ��ȣ, �̸� , ����, ������� 
	[6] ���л��� ��� �������� ���� �ٲ����ȴ�. ��ȣ�ΰ��� �Է¹ް� �� �л����� �����鸦 ��ȯ
*/	
public class �迭3_����08_�߰���� {
	public static void main(String[] args) {	
		int[] numberList = {1001, 1002, 1003, 1004, 1005};
		int[] korScoreList  = {  87,   11,   45,   98,   23};
		int[] engScoreList  = {  54,   32,   85,   78,   93};
		int[] mathScoreList  = {  56,   51,   100,   28,   33};
		String[] nameList = {"��ö��" , "�̿���" , "���Ƹ�" , "������" , "ȫ�浿"};
		String[] genderList = {"��" , "��" , "��" , "��" , "��"};
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 0; i < 5; i++) {
			if(genderList[n] == genderList[i]) {
				System.out.println(numberList[i]);
				System.out.println(nameList[i]);
			}
		}
		int total[] = new int[5];
		for(int i = 0; i < 5; i++) {
			total[i] = korScoreList[i] + engScoreList[i] + mathScoreList[i];
		}
		System.out.println(Arrays.toString(total));
		
		
		
		
	}
}
