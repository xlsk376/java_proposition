package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		100�� ����߿��� ū������ 4���� ���
	[����]
		100 50 25 20 
 */
public class �ݺ���3_����04_���ū�� {
	public static void main(String[] args) {
		
		int count = 0;
		for(int i = 100; i >= 1; i--) {
			if(100 % i == 0) {
				System.out.print(i + " ");
				count += 1;
				if(count == 4) {
					break;
				}
			}
		}
		
	}
}
