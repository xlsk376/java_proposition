package ____�ڹ�����7_�����迭;

import java.util.Arrays;
import java.util.Random;

/*
	[����] 
		a �迭�ȿ� 1 �Ǵ� 7�� �������� ������ ���. 
		��, 7�� ������ 3�������Ѵ�.
		���� ������ġ�����Ѵ�.
	[��]
		���� { 1, 7, 7, 1, 1, 7, 1};
		���� { 7, 1, 1, 7, 1, 1, 1};
*/
public class �迭3_����06_������������ {	
	public static void main(String[] args) {
		int a [] = new int[7];
		Random ran = new Random();
		int c1 = 0;
		int c7 = 0;
		for(int i = 0; i < a.length;) {
			int r = ran.nextInt(2);
			if(r == 0 && c7 < 3) {
				a[i] = 7;
				i += 1;
				c7 += 1;
			}else if(r == 1 && c1 < 4){
				a[i] = 1;
				i += 1;
				c1 += 1;
			}
			if(c1 == 4 && c7 == 3) {
				break;
			}
			
		}
		System.out.println(Arrays.toString(a));
	}
}
