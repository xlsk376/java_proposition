package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		9�� ����� 100���� ū���߿��� ���� �ڸ��� 6�� �ټ���° 9�� ��� ����Ͻÿ�.
	[����]
		486
*/
public class �ݺ���2_����08_�ټ���°�����ڸ�2 {
	public static void main(String[] args) {
		boolean run = true;
		int i = 100;
		int count = 0;
		int ���9 = 0;
		while(run == true) {
			int a = i % 10;
			if(i % 9 == 0 && a == 6) {
				count += 1;
				if(count == 5 ) {
					���9 = i;
					run = false;
				}
			}
			i += 1;
		}
		System.out.println(���9);
	}
}
