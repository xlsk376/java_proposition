package ____�ڹ�����6_�����ݺ���;

import java.util.Random;

public class �ݺ���0_����13_�߰� {
	public static void main(String[] args) {
		/*	
	 	���ڸ� 0~4���� ���������� ����Ѵ�. 
	 	�Ʒ������� �����Ѵ�.
	 	[����1] �������� 0~4�� ���ڸ� �ϳ������ϰ� �׼��ڿ��� ��������ʰ� �������� ����Ѵ�.
	 	[����2] �� ���ڸ� ���������� ����ϱ⶧���� �����ϋ��� ���ڰ� ���������ʴ´�.
	 	
	 	[����1] 
	 		�������ڰ� 2��� �����Ҷ�  
	 		[���] 01 23 
	 	
		[����2] 
			�������ڰ� 3��� �����Ҷ�  
	 		[���] 012 3 
		*/
		Random ran = new Random();
		int n = ran.nextInt(5);
		System.out.println("n : "+n);
		for(int i = 0; i < 5; i++) {
			if(n == i ) {
				System.out.print(" ");
			}else {
				System.out.print(i + " ");
			}
		}
		
		
		
	}
}
