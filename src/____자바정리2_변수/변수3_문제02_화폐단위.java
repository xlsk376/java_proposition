package ____�ڹ�����2_����;
/*
	[����]  
		�Ž����� 174900���� �Ž����ַ��� �Ѵ�.
	    ��, ��õ�� ������ �����Ǿ� ����� ������ �Ž����شٸ�,
	    �� �������� �� �徿 ������� �ϴ��� ���Ͻÿ�.
	[����]
		 ������  : 3, �ϸ���  : 2, ��õ�� : 0, 
		 ��õ��  : 0, �����  : 9, �Ϲ�� : 4
 */
public class ����3_����02_ȭ����� {
	public static void main(String[] args) {
		int money = 174900;
		int ���� = money/50000;
		System.out.println(����);
		int �ϸ��� = money%50000/10000;
		System.out.println(�ϸ���);
		int ����� = money%50000%10000/500;
		System.out.println(�����);
		int �Ϲ�� = money%50000%10000%500/100;
		System.out.println(�Ϲ��);
		
	}
}
