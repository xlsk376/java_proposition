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
public class �ݺ���1_����02_����2 {
	public static void main(String[] args) {
		int i = 5;
		int total = 0;
		while(i <= 15) {
			if(i % 5 == 0) {
				System.out.print("��� ");
				total = total + i;
			}else {
				System.out.print(i + " ");				
			}
			i = i + 1;
		}
		System.out.println();
		System.out.println("5�� ����� �� : " + total);
	}
}
