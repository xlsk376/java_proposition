package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		128�� 3��° ��� ���� 6��° ����� ��ü���� ����Ͻÿ�.
	[����]
		3��° ��� ���� 6��° ����� ��ü�� : 60
 */
public class �ݺ���3_����07_�����2 {
	public static void main(String[] args) {
		int num = 128;	
		int i = 1;
		int count = 0;
		int total = 0;
		while(i <= num) {
			if(num % i == 0) {
				count += 1;
				if(count >= 3 && count <= 6) {
					total += i;
				}
			}
			i += 1;
		}
		System.out.println("3��° ��� ���� 6��° ����� ��ü�� : " + total);
	}
}
