package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		[1] 48�� ����� �����ڸ��� 3�ǹ���� ���� ���� ����Ͻÿ�.
		[2] �� ������ ����� �յ� ����Ͻÿ�.
	[����]
		3 6 16 
		�Ǽ��� �� : 25		
*/
public class �ݺ���3_����03_��������ڸ���2 {
	public static void main(String[] args) {
		int num = 48;
		int i = 1;
		int total = 0;
		while(i <= num) {
			int a = i % 10;
			if(num % i == 0 && a % 3 == 0) {
				System.out.print(i + " ");
				total += i;
			}
			i += 1;
		}	
		System.out.println();
		System.out.println("�Ǽ��� �� : " + total);
	}
}
