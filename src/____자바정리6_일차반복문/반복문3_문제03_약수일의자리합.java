package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		[1] 48�� ����� �����ڸ��� 3�ǹ���� ���� ���� ����Ͻÿ�.
		[2] �� ������ ����� �յ� ����Ͻÿ�.
	[����]
		3 6 16 
		�Ǽ��� �� : 25		
*/
public class �ݺ���3_����03_��������ڸ��� {
	public static void main(String[] args) {
		
		int total = 0;
		
		for(int i = 1; i <= 48; i++) {
			int a = i % 10;
			if(48 % i == 0 && a % 3 == 0) {
				System.out.print(i+ " ");
				total += i;
			}
		}
		System.out.println();
		System.out.println("����� �� : " + total);
		
		
	}
}
