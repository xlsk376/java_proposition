package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		128�� 5��° ������� 2��° ����� ������ ���Ͻÿ�.
	[����]
		5��° ������� 2��° ����� ���� : 14
 */
public class �ݺ���3_����06_�������2 {
	public static void main(String[] args) {
		int num = 128;	
		int i = 1;
		int ���5 = 0;
		int ���2 = 0;
		int count = 0;
		while(i <= num) {
			if(num % i == 0) {
				count += 1;
				System.out.println(i);
				if(count == 2) {
					���2 = i;
				}
				if(count == 5) {
					���5 = i;
				}
			}
			i += 1;
		}
		System.out.println("5��° ������� 2��° ����� ���� : " + (���5 - ���2));
	}
}
