package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		128�� 5��° ������� 2��° ����� ������ ���Ͻÿ�.
	[����]
		5��° ������� 2��° ����� ���� : 14
 */
public class �ݺ���3_����06_������� {
	public static void main(String[] args) {
		int count = 0;
		int a = 0;
		int b = 0;
		for(int i = 1; i <= 128; i++) {
			if(128 % i == 0) {
				count += 1;
				if(count == 2) {
					a = i;
				}else if(count == 5) {
					b = i;
				}
			}
		}
		System.out.println(b-a);
		
		
	}
}
