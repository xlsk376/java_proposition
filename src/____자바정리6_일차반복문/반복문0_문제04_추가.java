package ____�ڹ�����6_�����ݺ���;

public class �ݺ���0_����04_�߰� {
	public static void main(String[] args) {
		/*
		ö���� ���ε��� ��鿩 ������ �Ǿ���.
		ö���� ��� �������� �Ⱦ��ؼ� ��7���� ��6�Ϸ� �ٲٰ� �������� �����ߴ�.
		5��1���� �Ͽ������ϰ��Ҷ�, 
		5��1�Ϻ��� 5��31�ϱ��� ��¥�� ������ ���� ����غ���.
		 
		 [����]
		 	1 => ��
		 	2 => ȭ
		 	3 => ��
		 	4 => ��
		 	5 => ��
		 	6 => ��
		 	7 => ��
		 	8 => ȭ
		 	.......
		*/
		
		for(int i = 1; i <= 31; i++) {
			if(i % 6 == 1) {
				System.out.println(i + " => �� ");
			}else if(i % 6 == 2) {
				System.out.println(i + " => ȭ ");
			}else if(i % 6 == 3) {
				System.out.println(i + " => �� ");
			}else if(i % 6 == 4) {
				System.out.println(i + " => �� ");
			}else if(i % 6 == 5) {
				System.out.println(i + " => �� ");
			}else if(i % 6 == 0) {
				System.out.println(i + " => �� ");
			}
		}
	
	}
}
