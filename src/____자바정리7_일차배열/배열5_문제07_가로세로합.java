package ____�ڹ�����7_�����迭;

import java.util.Arrays;
/*
	[���μ�����]	
		�� �迭�� 1~9�� ������ ����Ǿ� �ִ� 9�� �������� �迭�̴�.
		[����1] array �迭�� �� �Ͱ��� �簢�� ������� ��� �ϰ� 
		������ ���� ���� garo1[] �� ���ʴ�� ���� 	 
		[����2] array �迭�� �� �Ͱ��� �簢�� ������� ��� �ϰ� 
		������ ���� ���� sero1[] �� ���ʴ�� ���� 		 
 */
public class �迭5_����07_���μ����� {
	public static void main(String[] args) {
		int array[] = {
				2, 4, 6,
				8, 1, 5,
				9, 7, 3
		};			
		int garo1[] = {0,0,0}; // {2+4+6 , 8+1+5 , 9+7+3}
		int sero1[] = {0,0,0}; // {2+8+9 , 4+1+7 , 6+5+3}
		int gi = 0;
		int si = 0;
		for(int i = 0; i < array.length; i++) {		
			System.out.println(gi);
			garo1[gi] += array[i];	
			if(i % 3 == 2) {
				gi += 1;
			}			
		}
		System.out.println(Arrays.toString(garo1));			
		for(int i = 0; i < array.length; i++) {		
			sero1[si] += array[i];
			si += 1;
			if(i % 3 == 2) {
				si = 0;
			}			
		}
		System.out.println(Arrays.toString(sero1));		
	}
}
