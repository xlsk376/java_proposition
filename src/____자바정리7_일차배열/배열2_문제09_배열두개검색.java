package ____�ڹ�����7_�����迭;

import java.util.Scanner;

/*
	numberList = { 1001, 1002, 1003, 1004, 1005 };
	scoreList = { 87, 11, 45, 98, 23 };
	[����] �й��� �Է¹޾� ���� ���
	[����] �й� �Է� : 1003 ���� : 45��
*/
public class �迭2_����09_�迭�ΰ��˻� {
	public static void main(String[] args) {
		int[] numberList = { 1001, 1002, 1003, 1004, 1005 };
		int[] scoreList = { 87, 11, 45, 98, 23 };
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int index = 0;
		for(int i = 0; i < 5; i++) {
			if(n == numberList[i]) {
				index = i;
			}
		}
		System.out.println(scoreList[index]);
	}
}
