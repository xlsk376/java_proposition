package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		9�� ����� 100���� ū���߿��� ���� �ڸ��� 6�� ����° 9�� ��� ����Ͻÿ�.
	[����]
		360
*/
public class �ݺ���2_����09_����°�����ڸ� {
	public static void main(String[] args) {
		
		int i = 100;
		int count = 0;
		while(true) {
			int a = i % 100/10;
			if(i % 9 == 0 && a == 6) {
				count += 1;
				if(count == 3) {
					System.out.println(i);
					break;
				}
			}
			i += 1;
		}
	}
}
