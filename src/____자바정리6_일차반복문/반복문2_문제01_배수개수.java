package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		50���� 100���� �ڿ����߿��� 9�� ����� ������ ����Ͻÿ�.
	[����]
		9�� ��� ���� : 6��
*/
public class �ݺ���2_����01_������� {
	public static void main(String[] args) {
		
		int count = 0;
		for(int i = 50; i <= 100; i++) {
			if(i % 9 == 0) {
				count += 1;
			}
		}
		System.out.println(count);
		
	}
}
