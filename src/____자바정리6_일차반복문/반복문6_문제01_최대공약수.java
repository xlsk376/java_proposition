package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		45�� 60�� 75�� �ִ������� ���Ͻÿ�.
	[����]
		15
*/
public class �ݺ���6_����01_�ִ����� {
	public static void main(String[] args) {
		int a = 0;
		for(int i = 1; i <= 75; i++) {
			if(45 % i == 0 && 60 % i == 0 && 75 % i == 0) {
				//System.out.println(i);
				a = i;
			}
		}
		System.out.println(a);
	}
}
