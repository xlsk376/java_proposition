package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		100�� ����߿��� ū������ 4���� ���
	[����]
		100 50 25 20 
 */
public class �ݺ���3_����04_���ū��2 {
	public static void main(String[] args) {
		boolean run = true;
		int i = 100;
		int count = 0;
		while(run == true) {
			if(100 % i == 0) {
				System.out.print(i + " ");
				count += 1;
				if(count == 4) {
					run = false;
				}
			}
			i -= 1;
			if(i == 1) {
				run = false;
			}
		}	
	}
}
