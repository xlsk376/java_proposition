package ____�ڹ�����6_�����ݺ���;
/*
	[����]
		[1] �ݺ����� ����ؼ� 5 ~ 15 ���̸� ��������Ѵ�.
		[2] �ݺ��߿� 7���� ū���� 4�ǹ���� ���ڴ�� "���" �� ����Ѵ�.
		[3] �ݺ��� ������ 7���� ū���� 4�ǹ���� ������ ����Ѵ�.
	[����]
		5 6 7 ��� 9 10 11 ��� 13 14 15 
		7���� ū�� �� 4�ǹ���� ���� : 2��
 */
public class �ݺ���1_����04_���� {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 5; i <= 15; i++) {
			if(i >= 7 && i % 4 == 0) {
				count += 1;
				System.out.print("��� ");
			}else {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("7���� ū�� �� 4�ǹ���� ���� : "+count);
	}
}
