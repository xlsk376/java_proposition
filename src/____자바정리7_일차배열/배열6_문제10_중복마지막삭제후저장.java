package ____�ڹ�����7_�����迭;

import java.util.Arrays;
import java.util.Scanner;

/*
	[����] ���� �Է¹ް� ���� 
	[����] ���࿡ �������� ������ ������ ���� �������ǰ� �Ѱ��� ���� �� b �� ���������� ���� 
	[��] 5 ==> b [] = {5,2,6,8,6}; 
	[��] 6 ==> b [] = {5,2,6,8,5};
*/
public class �迭6_����10_�ߺ����������������� {
	public static void main(String[] args) {	
		int data[] = {5,2,6,8,5,6};
		int b [] = null;
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �� �Է� : ");
		int n = scan.nextInt();
		int count = 0;
		for(int i = 0; i < data.length; i++) {
			if(n == data[i]) {
				count += 1;
				break;
			}
		}
		b = new int[data.length-count];
		int index = 0;
		for(int i = 0; i < data.length; i++) {
			if(n == data[i]) {
				index = i;
			}
		}
		int bindex = 0;
		for(int i = 0; i < data.length; i++) {
			if(index != i) {
				b[bindex] = data[i];
				bindex += 1;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
