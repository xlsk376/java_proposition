package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		48�� ����� Ȧ���� ���� ����Ͻÿ�.
		for�� ����Ͻÿ�.
 */
public class �ݺ���5_����04_forȦ������� {
	public static void main(String[] args) {
		int total = 0;
		for(int i = 1; i <= 48; i++) {
			if(48 % i == 0 && i % 2 == 1) {
				total += i;
			}
		}
		System.out.println(total);
	
	}
}
