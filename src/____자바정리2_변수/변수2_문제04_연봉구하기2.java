package ____�ڹ�����2_����;
/*
	[����] 
		�� �������� ���� 10%�� �����ϸ� 1350�����̴�.
		������ �����ϱ� �� �� ������ ������ ���Ͻÿ�.
	[����] 
		125
 */
public class ����2_����04_�������ϱ�2 {	
	public static void main(String[] args) {
		double ���Ŀ��� = 1350;
		double ����1�ۼ�Ʈ = ���Ŀ��� / 90;		
		System.out.println("����1�ۼ�Ʈ : " + ����1�ۼ�Ʈ);
		double ���� = ����1�ۼ�Ʈ * 10;
		System.out.println("���� : " + ����);
		double �������� = ���Ŀ��� + ����;
		System.out.println("�������� : " + ��������);
		
		int ���� = (int)(�������� / 12);
		System.out.println("���� : " + ����);
	}
}
