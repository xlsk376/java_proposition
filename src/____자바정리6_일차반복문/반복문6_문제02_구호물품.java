package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		��ȣ��ǰ���� �ҵ��� 120���� �ش� 72���� 
		ȯ�� �Ѹ�� �Ȱ��� ���� �ҵ���� �ش븦 �����ٷ����Ѵ�. 
		�ִ��Ѹ��� ȯ�ڿ��� �����ٶ� ������� ���Ͻÿ�.	
	[����]
		24
*/
public class �ݺ���6_����02_��ȣ��ǰ {
	public static void main(String[] args) {
		int a = 0;
		for(int i = 1; i <= 120; i++) {
			if(120 % i == 0 && 72 % i == 0) {
				//System.out.println(i);
				a = i;
			}
		}
		System.out.println(a);

	}
}
