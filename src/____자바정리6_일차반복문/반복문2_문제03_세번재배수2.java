package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		[1] ���� 50 ~ 150 ������ �������� 7�ǹ���� ���������� �˻��Ѵ�.
 		[2] �ݺ����� ������ 3��° 7�� ����� ����Ѵ�.
 	[����]
 	 	3��° 7�� ��� : 70
 */
public class �ݺ���2_����03_��������2 {
	public static void main(String[] args) {
		int i = 50;
		int count = 0;
		int ���3 = 0;
		while(i <= 150) {
			if(i % 7 == 0) {
				System.out.println(i);
				count += 1;
				if(count == 3) {
					���3 = i;
				}
			}
			i += 1;
		}
		System.out.println("3��° 7�� ��� : " + ���3);
	}
}
