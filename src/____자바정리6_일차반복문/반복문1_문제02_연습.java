package ____�ڹ�����6_�����ݺ���;
/*
	[����]
		[1] 5 ~ 15 ������ ���ڸ� ��������Ѵ�.
		[2] 5�� ����϶��� ���� ��� "���" �� ����Ѵ�.
		[2] �ݺ��� ������ 5�ǹ���� ���� ������ ����Ѵ�.
	[����]
		��� 6 7 8 9 ��� 11 12 13 14 ��� 
		5�� ����� �� : 30
*/
public class �ݺ���1_����02_���� {
	public static void main(String[] args) {
		int total = 0;
		for(int i = 5; i <= 15; i++) {
			if(i % 5 == 0) {
				System.out.print("��� ");
				total += i;
			}else {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("5�� ����� �� : "+total);
	}
}
