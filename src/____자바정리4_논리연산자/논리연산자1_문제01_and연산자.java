package ____�ڹ�����4_��������;
/*
	[����]
		�Ʒ����� ���� true ���ǵ��� ������ ���� �����Ͻÿ�.
*/
public class ��������1_����01_and������ {
	public static void main(String[] args) {		
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		b = 1;
		d = 3;
		System.out.println(a == b && c == d);
		a = 2;
		System.out.println(a != b && c == d);
		System.out.println(a == b && c != d);
		System.out.println(a != b && c != d);		
	}
}
