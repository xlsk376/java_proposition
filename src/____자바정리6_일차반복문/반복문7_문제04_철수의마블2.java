package ____�ڹ�����6_�����ݺ���;

import java.util.Random;
/* 
	[ö���Ǹ���]
		ö���� ��������� �ϰ��ִ�. 	
		0~20������ ������ �ְ� ö���� 0�� ��ġ�� �ִ�. 
		20�� �Ѿ�� ���������̴�. 
		�ֻ����� 1~6������ ���ڰ� ���´�.	
		3�� ����� �ڸ��� �����̴�.(3,6,9,12,15,18) 
		���������� �ѹ��� �ֻ����� ������ 4�̻��� ���ڰ� ������ ����Ż���̵Ǹ� ��ĭ ������ �����Ѵ�.
		������ �����ϸ� �ڷ� ��ĭ �������Եȴ�. 	
		ö���� ������ ���������� ö���� �̵���θ� ���� ����Ͻÿ�.
*/
public class �ݺ���7_����04_ö���Ǹ���2 {
	public static void main(String[] args) {
		Random ran = new Random();
		int ö�� = 0;
		while(true) {
			if(ö�� >= 20) {
				System.out.println("����");
				break;
			}
			int r = ran.nextInt(6) + 1;
			System.out.println("�ֻ������� " + r + "�� ���Խ��ϴ�.");
			ö�� += r;
			System.out.println("ö�� : " + ö��);
			if(ö�� % 3 == 0) {
				r = ran.nextInt(6) + 1;
				System.out.println("[����] �ֻ������� " + r + "�� ���Խ��ϴ�.");
				if(r >= 4) {
					ö�� += 1;
					System.out.println("[����Ż�⼺��]");
				}else {
					ö�� -= 1;
					System.out.println("[����Ż�����]");
				}
				System.out.println("ö�� : " + ö��);
			}
		}
	}
}
