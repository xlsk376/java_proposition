package ____�ڹ�����7_�����迭;
import java.util.Scanner;
/*
	 array = { 87, 11, 45, 98, 23 };

	[����1] �ε����� �Է¹޾� ���� ���
	[����1] �ε��� �Է� : 1 ���� : 11��

*/
public class �迭2_����01_�����ε����˻� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		int[] array = { 87, 11, 45, 98, 23 };		
		System.out.println("�ε��� �Է� : ");
		int index = scan.nextInt();		
		System.out.println(array[index]);
		System.out.println("------------------------");
		
		scan.close();
	}

}
