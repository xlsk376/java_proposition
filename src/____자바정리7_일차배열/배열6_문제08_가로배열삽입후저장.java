package ____�ڹ�����7_�����迭;

import java.util.Arrays;
import java.util.Scanner;

/*
	[����]
		�ε��� , ��ȣ , ������ �Է¹ް� b�迭�� ������ �Ͻÿ�.	
		[��] 2 , 1004 , 60	
		int b[] = { 1001, 40, 1004, 60, 1002, 65, 1003, 70};	
*/
public class �迭6_����08_���ι迭���������� {
	public static void main(String[] args) {			
		int c[] = { 1001, 40, 1002, 65, 1003, 70};		
		int number = 0;
		int score = 0;
		int index = 0;	
		int b[] = null;
		b = new int[c.length+2];
		int count = 6;
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < c.length; i++) {
			b[i] = c[i];
		}
		System.out.println("�ε��� : ");
		index = scan.nextInt();	
		System.out.println("��ȣ : ");
		number = scan.nextInt();
		System.out.println("���� : ");
		score = scan.nextInt();
		int lastindex = count;
		for(int i = index; i < count; i++) {
			b[lastindex+1] = b[lastindex-1];
			lastindex -= 1;
		}
		b[index] = number;
		b[index+1] = score;
		count += 2;
		
		System.out.println(Arrays.toString(b));
		
		
		
		
		
	}
}
