package ____�ڹ�����7_�����迭;

import java.util.Arrays;
import java.util.Scanner;

/*
[����]
	�ε��� , ��ȣ , ������ �Է¹ް� ������ �Ͻÿ�.
	
	[��] 2 , 1004 , 60
	
	int c[] = { 1001, 40, 1004, 60, 1002, 65, 1003, 70 ,0,0};
	
*/
public class �迭6_����07_���ι迭���� {	
	public static void main(String[] args) {				
		int c[] = { 1001, 40, 1002, 65, 1003, 70,0,0,0,0};		
		int number = 0;
		int score = 0;
		int index = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("�ε��� : ");
		index = scan.nextInt();
		System.out.println("��ȣ : ");
		number = scan.nextInt();
		System.out.println("���� : ");
		score = scan.nextInt();
		int count = 6;
		int lastindex = count;
		for(int i = index; i < count; i++) {
			c[lastindex+1] = c[lastindex-1];
			lastindex -= 1;
		}
		c[index] = number;
		c[index+1] = score;
		count += 2;
		System.out.println(Arrays.toString(c));
		
		
		
		
	}
}
