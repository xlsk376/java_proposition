package ____�ڹ�����7_�����迭;
import java.util.Scanner;
/*
	 array = { 87, 11, 45, 98, 23 };

	[����2] ������ �Է¹޾� �ε��� ���
	[����2] ���� �Է� : 11 �ε��� : 1
*/
public class �迭2_����02_�������˻� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		int[] array = { 87, 11, 45, 98, 23 };		
		
		System.out.println("------------------------");
		System.out.println("���� �Է� : ");
		int score = scan.nextInt();	
		int index2 = -1;
		
		for(int i = 0; i < 5; i++) {
			if(score == array[i]) {
				index2 = i;
			}
		}
		if(index2 == -1) {
			System.out.println("����");
		}else if(index2 != -1) {
			System.out.println(index2);
		}
		
	}

}
