package ____�ڹ�����7_�����迭;

import java.util.Arrays;
import java.util.Scanner;

/*
	[����] ������ ���� �Է¹ް� data�迭���� ������ b�� ���� 
    int data[] = {5,2,6,8,5,6};
   	[����] ���࿡ �������� ������ ������ ���� ���� �� b �� ���������� ���� 
	[��] 5 ==> b [] = {2,6,8,6};
	[��] 6 ==> b [] = {5,2,8,5};
	[��] 2 ==> b [] = {5,6,8,5,6};
 */
public class �迭6_����09_�ߺ����λ��������� {
	public static void main(String[] args) {	
		int data[] = {5,2,6,8,5,6};
		int b [] = null;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		for(int i = 0; i < data.length; i++) {
			if(n != data[i]) {
				count += 1;
			}
		}
		b = new int[count];
		int index = 0;
		for(int i = 0; i < data.length; i++) {
			if(n != data[i]) {
				b[index] = data[i];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(b));
		
	}
}
