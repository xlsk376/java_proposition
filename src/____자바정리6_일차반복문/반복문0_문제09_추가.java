package ____�ڹ�����6_�����ݺ���;

import java.util.Random;

public class �ݺ���0_����09_�߰� {
	public static void main(String[] args) {
		/*
		 * �������� count������  4~8������ ���ڸ� �����Ѵ�. 
		 * count ������ ���ڴ� ����������� ���ڰ����̴�. 
		 * count ������ ���ڸ�ŭ ���ϱ� ������ �����ȴ�. 
		 * ��, ���ϱ� ������ ���鶧���ڴ� 1~9������ ���������̸�, ���� ¦�������Ѵ�. 
		 * [���] ���� ����� �Ȱ��� �����ȴ�. ��, ���ڴ� �����̹Ƿ� ����ɼ��ִ�. 
		 	
		 	[����]
					�������� 4~8������ ���ڸ� �Է��ϼ���.
					5
					[���] 4 + 6 + 4 + 2 + 8 = 
		 */
		
		Random ran = new Random();
		int count = ran.nextInt(5)+4;
		System.out.println(count);
		while(true) {
			int r = ran.nextInt(9)+1;
			if(r % 2 == 0) {
				System.out.print(r);
				count -= 1;
				if(count >= 1) {
					System.out.print(" + ");
				}
			}
			if(count == 0) {
				System.out.println(" = ");
				break;
			}
		}
	
	}
}
