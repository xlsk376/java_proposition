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
public class �ݺ���1_����04_����2 {
	public static void main(String[] args) {
		int i = 5;
		int count = 0;
		while(i <= 15) {
			if(i > 7 && i % 4 == 0) {
				System.out.print("��� ");
				count += 1;
			}else {
				System.out.print(i + " ");
			}
			i = i + 1;
		}
		System.out.println();
		System.out.println("7���� ū�� �� 4�ǹ���� ���� : " + count + "��");
	}
}
