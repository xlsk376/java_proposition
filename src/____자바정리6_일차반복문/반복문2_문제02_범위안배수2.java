package ____�ڹ�����6_�����ݺ���;
/*
	[����]
		[1] 1~150 ������ 18�� ����� ���� ����Ѵ�.
		[2] 50 ~ 100�� ���̿��� 18����� ���ڴ�� "���" ���  
	[����]
		18 36 ��� ��� ��� 108 126 144 
 */
public class �ݺ���2_����02_�����ȹ��2 {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 150) {
			if(i % 18 == 0) {
				if(i >= 50 && i <= 100 ) {
					System.out.print("��� ");
				}else {
					System.out.print(i + " ");					
				}
			}
			i = i + 1;
		}
	}
}
