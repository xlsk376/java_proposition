package ____�ڹ�����6_�����ݺ���;

import java.util.Random;
/*
	[��¡�����]
		ö���� ��¡����ӿ� �����Ͽ���.
		ù��° ������ "����ȭ���� �Ǿ����ϴ�" �̴�.
		��Ģ�� �Ʒ��Ͱ���.	
	[��Ģ]	
		[1] ��ü �Ÿ��� 0 ~ 25���� �Ÿ��� �ִ�.
		[2] ö���� ���� 0�� �ڸ��� �ִ�.
		[3] ö���� ���� 1 ~ 4�� �������ڸ��̴´�. ���ڸ�ŭ �̵��Ѵ�. 
		[4]	�̵��Ÿ��� �����ϸ�, ���� 25�̻��̵Ǹ� �¸��̸� �����Ѵ�.
		[5] ������ ���� 3 ~ 5�� �������ڸ��̴´�. 
		[6] �������� ū ���ڰ������� �����ΰ����� ���ֵǾ� �й��ϸ� �����Ѵ�.
		[7] 10�Ͼȿ� �������ϸ� �ð��ʰ��� �й��ϸ� �����Ѵ�.
		[8] ö���� �̵���θ� ���� ����Ͻÿ�.
 */
public class �ݺ���7_����03_��¡�����2 {
	public static void main(String[] args) {
		Random ran = new Random();
		int ö�� = 0;
		int count = 0;
		while(true) {		
			count += 1;	
			if(count > 10) {
				System.out.println("10�� �ʰ� �й�");
				break;
			}				
			int r = ran.nextInt(4) + 1;
			int ���� = ran.nextInt(3) + 3;
			System.out.println("���� : " + count);
			System.out.println("ö���� �������� :  " + r);
			System.out.println("������ �������� :  " + ����);				
			if(r <= ����) {
				ö�� += r;				
				System.out.println("�̵����� : ö����ġ : " + ö��);
			}else {
				System.out.println("������ �ɸ� �й�");
				break;
			}	
			if(ö�� >= 25) {
				System.out.println("ö���¸�");
				break;
			}	
		}
	}
}
