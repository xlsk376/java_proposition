package ____�ڹ�����6_�����ݺ���;

import java.util.Random;
/*
	[�Ｎ����]
		�������� 1�Ǵ� 7 �� 10������Ѵ�. 
		7�� �������� 3���̻��̸� "��÷" �ƴϸ� "��" ����Ͻÿ�.
	[����]
		7 7 1 1 1 7 1 : ��
		1 7 7 7 1 1 7 : ��÷
*/
public class �ݺ���7_����02_�Ｎ����2 {
	public static void main(String[] args) {
		Random ran = new Random();
		int count = 0;
		boolean win = false;
		for(int i = 0; i < 7; i++) {
			int r = ran.nextInt(2);
			if(r == 0) {
				System.out.print(7 + " ");
				count += 1;
				if(count == 3) {
					win = true;
				}
			}else {
				System.out.print(1 + " ");
				count = 0;
			}
		}
		if(win) {
			System.out.println(" : ��÷");
		}else {
			System.out.println(" : ��");
		}
		
	} 
}
