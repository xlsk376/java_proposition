package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		[1] ���� 50 ~ 550 ������ �������� 7�ǹ���� ���������� �˻��Ѵ�.
		[2] ���� 3��° 7�� ����� ����Ѵ�. 
		
		for�� ����Ͻÿ�.
*/
public class �ݺ���5_����01_for���ݹ�� {
	public static void main(String[] args) {
		int count = 0;
		
		for(int i = 50; i <= 550; i++) {
			if(i % 7 == 0) {
				count += 1;
				if(count == 3) {
					System.out.println(i);
					break;
				}
			}
		}
		

	}
}
