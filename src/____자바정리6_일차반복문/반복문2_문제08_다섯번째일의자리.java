package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		9�� ����� 100���� ū���߿��� ���� �ڸ��� 6�� �ټ���° 9�� ��� ����Ͻÿ�.
	[����]
		486
*/
public class �ݺ���2_����08_�ټ���°�����ڸ� {
	public static void main(String[] args) {
		
		int i = 100;
		int count = 0;
		while(true) {
			int a = i % 10;
			if(i % 9 == 0 && a == 6) {
				count += 1;
				if(count == 5) {
					System.out.println(i);
					break;
				}
			}
			i += 1;
		}
	}
}
