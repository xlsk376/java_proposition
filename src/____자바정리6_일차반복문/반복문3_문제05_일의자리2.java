package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		128�� ����߿��� ������� ����� ���������, �����ڸ��� 4�� �ι�° ����� ����Ͻÿ�.
	[����]
		64
*/
public class �ݺ���3_����05_�����ڸ�2 {
	public static void main(String[] args) {
		int num = 128;
		int i = 1;
		int count = 0;
		int num2 = 0;
		while(i <= num) {
			int a = i % 10;
			if(num % i == 0 && a == 4) {
				count += 1;
				if(count == 2) {
					num2 = i;
				}
			}			
			i += 1;
		}
		System.out.println("�����ڸ��� 4�� �ι�° ��� : " + num2);		
	}
}
