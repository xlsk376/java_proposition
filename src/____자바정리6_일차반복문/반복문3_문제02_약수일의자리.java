package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		[1] 48�� ����� �����ڸ��� 2~6������ ���� ����Ͻÿ�.
		[2] �� ������ ����� ������ ����Ͻÿ�.
	[����]
		2 3 4 6 12 16 24 
		�Ǽ��� ���� : 7��
 */
public class �ݺ���3_����02_��������ڸ� {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 1; i <= 48; i++) {
			int a = i % 10;
			if(48 % i == 0 && a >= 2 && a <= 6) {
				System.out.print(i + " ");
				count += 1;
			}
		}
		System.out.println();
		System.out.println("�Ǽ��� ���� : " + count);
		
		
	}
}
