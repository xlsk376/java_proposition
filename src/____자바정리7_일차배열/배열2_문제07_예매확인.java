package ____�ڹ�����7_�����迭;

import java.util.Scanner;

/*
	[����] 
	[����Ȯ��]	  
		[1] seatList �� ��ȭ�� 7�ڸ��� ��Ÿ����. 	 
		[2] seatList �� ������ ��ȭ�� ������ ȸ����ȣ�� ��Ÿ����. 	
		[3] find���� �˻��ϰ����ϴ� ȸ����ȣ�� �Է� �Ѵ�.	
		[4] find �� ���� ��ȭ������ ã�� �ڸ��� ���������		
		[5] ã�� ���� ������ "����" �� ����Ѵ�.
	[����] 
		�Է� : 1003
		��� : 0, 1
	[����]
		�Է� : 1005
		��� : "����"
 */
public class �迭2_����07_����Ȯ�� {
	public static void main(String[] args) {		
		int seatList[] = {1003, 1003, 0, 0, 1002, 0, 1001};		
		int find = 0;	
		
		Scanner scan = new Scanner(System.in);
		find = scan.nextInt();
		boolean check = false;
		for(int i = 0; i < seatList.length; i++) {
			if(find == seatList[i]) {
				System.out.print(i + " ");
				check = true;
			}
		}
		if(check == false) {
			System.out.println("����");
		}
		
	}
}
