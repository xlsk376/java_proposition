package ____�ڹ�����2_����;
/*
	[����] 
		ö���� ���� �л��� 40���̴�.
	 	ö��, ����, �μ��� ���弱�ſ� ������.
	 	�μ��� 40%�� ȹ���߰�, 
	 	����� 9ǥ�� �����.
	 	�������� ö���� ��ǥ�� �ߴ�.
	 	ö���� ��ǥ ���� ���Ͻÿ�.
	 [����]
	 	15
 */
public class ����2_����01_���弱��2 {
	public static void main(String[] args) {
		double ��ü = 40;
		double ����ǥ = 9;
		double �μ�ǥ = ��ü * 0.4;
		int ö��ǥ = (int)(��ü - ����ǥ - �μ�ǥ);		
		System.out.println(ö��ǥ);
	}
}
