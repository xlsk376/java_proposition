package ____�ڹ�����6_�����ݺ���;

import java.util.Random;

public class �ݺ���0_����11_�߰� {
	public static void main(String[] args) {
		 /*
        �������� (1~9) ������ ����  8���� ����Ѵ�. 
        �� �Ʒ��� ������ �����Ѵ�. 
        
        ���� ��� ���ڰ� 4 5 6 1 2 3 4 5 �̶�� �Ѵٸ�
        �Ʒ��� ���� ����Ѵ�. 
        
        [���]
           4 5 6
           5 6 1
           6 1 2
           1 2 3
           2 3 4
           3 4 5 
		*/
		
		Random ran = new Random();
		int a = ran.nextInt(9)+1;
		int b = ran.nextInt(9)+1;
		int c = 0;
		for(int i = 0; i < 6; i++) {
			c = ran.nextInt(9)+1;
				System.out.println(a + " " + b + " " + c);
				a = b;
				b = c;
		}
		
		
		
	
		/*
		�ݺ����� ����ؼ� �Ʒ��� ���� ����غ�����.
		[����]
				0 30
				1 29
				2 27
				3 24
				4 20
				5 15
				6 9
				7 2
				8 -6
				9 -15
		 */
//		int a = 30;
//		for(int i = 0; i < 10; i++) {
//			a -= i;
//			System.out.println(i + " " + a);
//		}
		
	}

}