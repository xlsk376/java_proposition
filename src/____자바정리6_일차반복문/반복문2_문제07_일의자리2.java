package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		9�� ����� 100���� ū���� ���� �ڸ��� 6�� ù��° 9�� ��� ����Ͻÿ�.
	[����]
		126
*/
public class �ݺ���2_����07_�����ڸ�2 {	
	public static void main(String[] args) {	
		int i = 100;
		boolean run = true;
		while(run == true) {
			int a = i % 10;
			if(i % 9 == 0 && a == 6) {
				System.out.println(i);
				run = false;
			}
			i = i + 1;
		}
	}
}
