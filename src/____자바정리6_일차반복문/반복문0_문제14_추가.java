package ____�ڹ�����6_�����ݺ���;

public class �ݺ���0_����14_�߰� {
	public static void main(String[] args) {
		
		/*
	  	�ݺ����� 10ȸ �ݺ��ؼ� �Ʒ��� ���� ����Ͻÿ�.
	  	
	  	[���]
	  	0 0
	  	1 0
	  	2 1
	  	3 1
	  	4 2
	  	5 2
	  	6 3
	  	7 3
	  	8 4
	  	9 4
	 
		*/
//		int a = 0;
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i + " " + a);
//			if(i % 2 == 1) {
//				a += 1;
//			}
//		}
		
		/*
	  	�ݺ����� 10ȸ �ݺ��ؼ� �Ʒ��� ���� ����Ͻÿ�.
	  	
	  	[���]
	  	0 1
	  	1 2
	  	2 3
	  	3 1
	  	4 2
	  	5 3
	  	6 1
	  	7 2
	  	8 3
	  	9 1
	 
		*/
//		int a = 1;
//		int count = 0;
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i + " " + a);
//			a += 1;
//			count += 1;
//			if(count == 3) {
//				count = 0;
//				a = 1;
//			}
//		}
		
		/*
	  	�ݺ����� 10ȸ �ݺ��ؼ� �Ʒ��� ���� ����Ͻÿ�.
	  	
	  	[���]
	  	0 1
	  	1 2
	  	2 2
	  	3 3
	  	4 3
	  	5 3
	  	6 4
	  	7 4
	  	8 4
	  	9 4
		*/
		int a = 1;
		int count = 0;
		for(int i = 0; i < 10; i++) {
			System.out.println(i+ " " + a);
			count += 1;
			if(a == count) {
				count = 0;
				a += 1;
			}
		}
		
		
		
		
	}
}
