package ____�ڹ�����7_�����迭;

import java.util.Arrays;

/*
	[����] d�� ���� ���������� e�������� , �������� f�� �����Ѵ�. 
	[��]
	int d[] = {10,20,30,40,50,60};
	e = {10,20,30}
 	f = {40,50,60};
 */
public class �迭4_����07_ª���迭 {
	public static void main(String[] args) {
		int d[] = {10,20,30,40,50,60};
		int e[] = {0,0,0};
		int f[] = {0,0,0};
		int index = 0;
		for(int i = 0; i < e.length; i++) {
			e[i] = d[index];
			index += 1;
		}
		for(int i = 0; i < f.length; i++) {
			f[i] = d[index];
			index += 1;
		}
		System.out.println(Arrays.toString(e));
		System.out.println(Arrays.toString(f));
	}
}
