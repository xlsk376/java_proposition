package ____�ڹ�����6_�����ݺ���;
/*
	[����]
		ö���� 13�� ö���� �ƹ����� 45���̴�. 
		����Ŀ� ö���� �ƹ����� ö�������� 3�谡�Ǵ��� ���Ͻÿ�.
	[��]
		�Ⱓ : 3
*/
public class �ݺ���4_����02_����2 {
	public static void main(String[] args) {		
		int ö������ = 13;
		int �ƹ������� = 45;
		int �Ⱓ = 0;
		boolean run = true;
		while(run == true) {
			if(ö������ * 3 == �ƹ�������) {
				System.out.println("�Ⱓ : " + �Ⱓ);
				run = false;
			}
			ö������ += 1;
			�ƹ������� += 1;
			�Ⱓ += 1;
		}		
	}
}
