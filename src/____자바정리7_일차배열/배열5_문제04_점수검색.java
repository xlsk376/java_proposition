package ____�ڹ�����7_�����迭;

import java.util.Scanner;
/*
	array = {1001, 20, 1002, 45, 1003, 54};
   	�й��� ������ �ѽ��̴�. ==>  1001:20 , 1002:45 , 1003:54
   	[����] �й��� �Է��ϸ� ���� ����Ѵ�.
   	[��] 1001==>20 , 1003 ==> 54  
   	[����] ������ �Է��ϸ� �й� ����Ѵ�. 
   	[��] 20 ==> 1001 , 45 ==> 1002
 */
public class �迭5_����04_�����˻� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int array[] = {1001, 20, 1002, 45, 1003, 54};
		System.out.println("�й� �Է� : ");
		int number = scan.nextInt();			
		System.out.println("���� �Է� : ");
		int score = scan.nextInt();	
		
		for(int i = 0; i < array.length; i+=2) {
			if(number == array[i]) {
				System.out.println(array[i+1]);
			}
		}
		for(int i = 1; i < array.length; i+=2) {
			if(score == array[i]) {
				System.out.println(array[i-1]);
			}
		}
	}
}
