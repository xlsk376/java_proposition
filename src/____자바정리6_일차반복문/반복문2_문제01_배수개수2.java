package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		50���� 100���� �ڿ����߿��� 9�� ����� ������ ����Ͻÿ�.
	[����]
		9�� ��� ���� : 6��
*/
public class �ݺ���2_����01_�������2 {
	public static void main(String[] args) {
		int count = 0;
		int i = 50;
		while(i <= 100) {
			if(i % 9 == 0) {
				count += 1;
			}
			i += 1;
		}
		System.out.println("9�� ��� ���� : " + count + "��");
	}
}
