package ____�ڹ�����8_�����ݺ���;

import java.util.Arrays;

public class �������ݺ���1_����02_�迭�� {
	/*
	  [����] a �迭��  �迭�� ���� ���ؼ� 
		    a �� b �� ���� ��ġ�°���  c ������
		    ��, �տ������� ����
		 
		[��] 
		 	c = {10,20,0,0}
		
	 */
	public static void main(String[] args) {
		int a[] = {10,20,30,40};	
		int b[] = {10,5,20,9};
		int c[] = new int[4];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(a[i] == b[j]) {
					c[i] = b[j];
				}
			}
		}
		System.out.println(Arrays.toString(c));
		
		// �迭 a �������� �迭 b�� ���� ��ġ�� �Ǹ� �迭 b�� ���� �迭 c�� �־��ش�.
	}

}
