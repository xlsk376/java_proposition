package ____�ڹ�����7_�����迭;

import java.util.Arrays;
import java.util.Random;

/*
	[����] a �迭�ȿ� 1 �Ǵ� 7�� �������� ������ ���. 
		���࿡ 7�� �������� 3���� ��÷ �ƴϸ� ��
	[��] 1,7,7,1,1,7,7
	
 */
public class �迭3_����01_���Ǹ���� {	
	public static void main(String[] args) {
		int a [] = new int[7];
		Random ran = new Random();
		int count = 0;
		boolean check = false;
		for(int i = 0; i < a.length; i++) {
			int r = ran.nextInt(2);
			if(r == 0) {
				a[i] = 1;
				count = 0;
			}else {
				a[i] = 7;
				count += 1;
			}
			if(count == 3) {
				check = true;
			}
		}
		System.out.println(Arrays.toString(a));
		if(check == true) {
			System.out.println("��÷");
		}else {
			System.out.println("��");
		}
		
		
	}
}
