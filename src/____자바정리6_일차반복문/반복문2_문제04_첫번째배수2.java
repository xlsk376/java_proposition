package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		9�� ����� 100���� ū ù��° ��� ����Ͻÿ�. 
	[����]
		108
*/
public class �ݺ���2_����04_ù��°���2 {
	public static void main(String[] args) {
		int n = 100;
		boolean run = true;
		while(run == true) {
			if(n % 9 == 0) {
				System.out.println(n);
				run = false;
			}
			n = n + 1;
		}
	}
}
