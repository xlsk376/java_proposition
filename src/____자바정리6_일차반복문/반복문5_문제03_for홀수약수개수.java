package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		48�� ����� Ȧ���� ������ ����Ͻÿ�.
		for�� ����Ͻÿ�.
 */
public class �ݺ���5_����03_forȦ��������� {
	public static void main(String[] args) {
		
		int count = 0;
		for(int i = 1; i <= 48; i++) {
			if(48 % i == 0) {
				System.out.print(i + " ");
				if(i % 2 == 1) {
					count += 1;
				}
			}
		}
		System.out.println();
		System.out.println("count : "+count);
		
		
	}
}
