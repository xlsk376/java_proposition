package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		128�� ����߿��� ������� ����� ���������, �����ڸ��� 4�� �ι�° ����� ����Ͻÿ�.
	[����]
		64
*/
public class �ݺ���3_����05_�����ڸ� {
	public static void main(String[] args) {
		
		int count = 0;
		for(int i = 1; i <= 128; i++) {
			int a = i % 10;
			if(128 % i == 0 && a == 4) {
				count += 1;
				if(count == 2) {
					System.out.println(i);
					break;
				}
			}
		}
	
	}
}
