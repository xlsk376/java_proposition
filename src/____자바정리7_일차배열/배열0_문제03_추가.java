package ____�ڹ�����7_�����迭;

import java.util.Arrays;

public class �迭0_����03_�߰� {
	/*
	[����] d�� ���� �����ư��鼭 e, f �� ���� ���� 
	[��]
		int d[] = {10,20,30,40,50,60};
		e = {10,30,50}
		f = {20,40,60}; 
*/
	public static void main(String[] args) {
		int d[] = {10,20,30,40,50,60};
		int e[] = {0,0,0};
		int f[] = {0,0,0};
		int index = 0;
		for(int i = 0; i < e.length; i++) {
			e[i] = d[index];
			index += 1;
			f[i] = d[index];
			index += 1;
		}
		System.out.println(Arrays.toString(e));
		System.out.println(Arrays.toString(f));
	}
}
