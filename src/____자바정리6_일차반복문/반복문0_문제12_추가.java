package ____�ڹ�����6_�����ݺ���;

import java.util.Random;

public class �ݺ���0_����12_�߰� {
	public static void main(String[] args) {
		/*
		 * �Ʒ��迭�� �������� (1~9����) �� 10�� �����Ѵ�. 
		 * ���������� ¦���� �������� ���������� ������ ����.
		 * �װ����� ���������� ����䰳���� ����Ѵ�.
		 * 
		 * [����]
		 * 		1,6,4,3,2,4,8,6,1,2
		 * 		
		 * [����] 
		 * 		6,4 ������ 2ĭ�̹Ƿ� 2
		 * 		2,4,8,6 ������ 4ĭ�̹Ƿ� 4
		 * 		������ 2�� �Ѱ��̹Ƿ� 1
		 * 		����䰳���� 4
		 * [����] 
		 * 		4	
		 */
		Random ran = new Random();
		int count = 0;
		int max = 0;
		for(int i = 0; i < 10; i++) {
			int r = ran.nextInt(9)+1;
			System.out.print(r + " ");
			if(r % 2 == 0) {
				count += 1;
			}else {
				count = 0;
			}
			if(max < count) {
				max = count;
			}
		}
		System.out.println();
		System.out.println(max);
		
		
	}
}
