package ____�ڹ�����8_�����ݺ���;

import java.util.Arrays;

public class �������ݺ���1_����03_�迭������ {
	/*
	  [����] a �迭 ���� �����߿��� b�迭�� ���� ������ 
		    a �� b �� ���� ��ġ�°��� b�迭�� �ε����� c������
		   	
	   [��] 
	   		b�� �������� �ε����� �����ϹǷ� 0�� 0,2�̴�.
		 	c = {0,2};
		
	 */
	public static void main(String[] args) {
		int a[] = {10,20,30,40};	
		int b[] = {10,5,20,9};
		int c[] = null;
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(a[i] == b[j]) {
					count += 1;
				}
			}
		}
		c = new int[count];
  		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(a[i] == b[j]) {
					c[i] = j;
					
				}
			}
		}
  		System.out.println(Arrays.toString(c));
  		
  		// �迭 a �� �迭 b�� ���Ͽ� �迭 b �������� �ε����� �迭 c�� �����Ѵ�.
  		// �ߺ��Ǵ� �ε����� ã�� ���ο� �迭 ������ �ݺ����� �α������� ������ ����� �Ѵ�.
		
	}

}
