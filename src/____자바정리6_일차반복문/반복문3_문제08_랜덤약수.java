package ____�ڹ�����6_�����ݺ���;

import java.util.Random;

/*
	[����] 
		10~100������ �������ڸ� �����ϰ�, 
		�׼����� ����ǰ����� ���Ѵ�.
		����ǰ����� ¦���̸� "¦��"�� ����ϰ�,
		����ǰ����� Ȧ���̸� ���ڸ� ���� ����Ѵ�. 
	[����]
		49 : 1, 7, 49 : ����ǰ����� Ȧ���̹Ƿ� ���ڸ� ���� ����Ѵ�.
		13 : 13, 1 : 13�� ���� ����ǰ����� ¦���̹Ƿ� ���ڸ� ����������� "¦��"�� ����Ѵ�.
	[��Ʈ]
		�ѹ��� �ذ��Ҽ� ����. 
 */
public class �ݺ���3_����08_������� {
	public static void main(String[] args) {
		Random ran = new Random();
		int r = ran.nextInt(91)+10;
		int count = 0;
		for(int i = 1; i <= r; i++) {
			if(r % i == 0) {
				count += 1;
			}
		}
		if(count % 2 == 0) {
			System.out.println("¦��");
		}else {
			for(int i = 1; i <= r; i++) {
				if(r % i == 0) {
					System.out.print(i + " ");
				}
			}
		}
		
		
	}
}
