package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		[1] ���� 50 ~ 150 ������ �������� 7�ǹ���� ���������� �˻��Ѵ�.
 		[2] �ݺ����� ������ 3��° 7�� ����� ����Ѵ�.
 	[����]
 	 	3��° 7�� ��� : 70
 */
public class �ݺ���2_����03_�������� {
	public static void main(String[] args) {
		int count = 0;
		int index = 0;
		for(int i = 50; i <= 150; i++) {
			if(i % 7 == 0) {
				count += 1;
				if(count == 3) {
					index = i;
				}
			}
		}
		System.out.println(index);

	}
}
