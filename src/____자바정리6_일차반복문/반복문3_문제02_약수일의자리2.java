package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		[1] 48�� ����� �����ڸ��� 2~6������ ���� ����Ͻÿ�.
		[2] �� ������ ����� ������ ����Ͻÿ�.
	[����]
		2 3 4 6 12 16 24 
		�Ǽ��� ���� : 7��
 */
public class �ݺ���3_����02_��������ڸ�2 {
	public static void main(String[] args) {
		int num = 48;
		int i = 1;
		int count = 0;
		while(i <= num) {
			int a = i % 10;
			if(num % i == 0 && a >= 2 && a <= 6) {
				System.out.print(i + " ");
				count += 1;
			}
			i += 1;
		}	
		System.out.println();
		System.out.println("�Ǽ��� ���� : " + count + "��");
	}
}
