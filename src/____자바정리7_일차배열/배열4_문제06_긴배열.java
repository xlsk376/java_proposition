package ____�ڹ�����7_�����迭;

import java.util.Arrays;

/*
	[����1] a�� �� ����  c�� ��������, �ٽ� b�ǰ��� c�� �����Ѵ�.
	[��] 
	int a[] = {10,20,30};
	int b[] = {40,50,60};
	c = {10,20,30,40,50,60}
*/
public class �迭4_����06_��迭 {
	public static void main(String[] args) {
		int a[] = {10,20,30};
		int b[] = {40,50,60};
		int c[] = {0,0,0,0,0,0};
		int index = 0;
		for(int i = 0; i < a.length; i++) {
			c[index] = a[i];
			index += 1;
		}
		for(int i = 0; i < b.length; i++) {
			c[index] = b[i];
			index += 1;
		}
		System.out.println(Arrays.toString(c));
		
	}
}
