package ____�ڹ�����7_�����迭;

import java.util.Arrays;

/*
	[����2] �Ʒ��� ������ �̴�. ���迡 �հ��ѻ���� ��ȣ�� win �� �����Ѵ�. (60���̻��հ�)
	[����1] �տ������� �����Ͻÿ�.
	[��] win1[]= {1002, 1003, 0};
*/
public class �迭4_����02_�հ����� {
	public static void main(String[] args) {		
		int number[] = { 1001, 1002, 1003 };
		int score[] = { 50, 83, 78 };
		int win1[] = { 0,0,0 };
		int index = 0;
		
		for(int i = 0; i < 3; i++) {
			if(60 <= score[i]) {
				win1[index] = number[i];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(win1));
		
	}
}
