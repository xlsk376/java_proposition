package ____�ڹ�����6_�����ݺ���;
/*
	[����]
		[1] 1~150 ������ 18�� ����� ���� ����Ѵ�.
		[2] 50 ~ 100�� ����� ���ڴ�� "���" ���  
	[����]
		18 36 ��� ��� ��� 108 126 144
*/
public class �ݺ���2_����02_�����ȹ�� {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 150; i++) {
			if(i % 18 == 0) {
				if(50 <= i && i <= 100) {
					System.out.print("��� ");
				}else {
					System.out.print(i + " ");
				}
			}
		}
		
	}
}
