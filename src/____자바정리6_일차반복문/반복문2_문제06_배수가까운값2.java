package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
  		6�� ����� ���������� �˻��Ѵ�. 
  		6����� 100�� ���尡��� ���� ��� �Ͻÿ�.
 	[����]
 		102
*/
public class �ݺ���2_����06_�������2 {
	public static void main(String[] args) {		
		int left = 0;
		int right = 0;
		int num = 6;
		int i = num;
		int max = 100;
		boolean run = true;
		while(run == true) {
			if(i % num == 0 ) {
				left = i;
			}
			i += 1;
			if(i == max) {
				run = false;
			}
		}
		System.out.println("100 ������ 6�ǹ�� : " + left);
		right = left + num;
		System.out.println("100 �ٷ� ������ 6�ǹ�� : " + right);	
		System.out.println("���� 100�� ���� ������ ");
		if(max - left > right - max) {
			System.out.println(right);
		}else if(max - left < right - max) {
			System.out.println(left);
		}else {
			System.out.println("����");
		}
	}
}
