package ____�ڹ�����6_�����ݺ���;

import java.util.Random;

public class �ݺ���0_����05_�߰� {
	public static void main(String[] args) {
		/* 
		[����]
		[�ݺ�����������]	 	
			ö���� �μ��� ��ܿ��� ������������ �Ѵ�. 	 	
			ö���� �μ��� ���� 0 ~ 2 �� �������� �����Ѵ�.
			0 : ���� , 1 : ���� , 2 : ���� ���Ѵ�.	 
			ö���� �μ��� 50��° ����� ��ġ���� ������ �Ѵ�.
			���� ������ ����.	
			�̱�� 3ĭ�ö󰡱�, ���� 2ĭ�ö󰡱�, ���� 1ĭ�ö󰡱�.	 	
			���� �ƹ��� 100�̻� �����ϰų� �ѻ����� ������ 10�̻��̸� ������ ����ȴ�. 
			������ ����ɶ����� �λ���� �̵���θ� ����Ͻÿ�.
		*/
		
		Random ran = new Random();
		int win = 3;
		int same = 2;
		int lose = 1;
		int c = 50;
		int m = 50;
		while(true) {
			int r1 = ran.nextInt(3);
			int r2 = ran.nextInt(3);
			
			System.out.println(c + " " +m);
			if(r1 == 0 && r2 == 2) {
				c += win;
				m += lose;
			}else if(r1 == 1 && r2 == 0) {
				c += win;
				m += lose;
			}else if(r1 == 2 && r2 == 1) {
				c += win;
				m += lose;
			}else if(r1 == r2) {
				c += same;
				m += same;
			}else {
				m += win;
				c += lose;
			}
			if(c >= 100 || m >= 100 || c-m >= 10 || m-c >= 10) {
				System.out.println(c + " " + m);
				System.out.println("����");
				break;
			}
			
		}
	
	}
}
