package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		45�� 60�� 75�� �ִ������� ���Ͻÿ�.
	[����]
		15
*/
public class �ݺ���6_����01_�ִ�����2 {
	public static void main(String[] args) {
		int �ִ����� = 0;
		for(int i = 1; i <= 45; i++) {
			if(45 % i == 0 && 60 % i == 0 && 75 % i == 0) {
				�ִ����� = i;
			}
		}
		System.out.println(�ִ�����);
	}
}
