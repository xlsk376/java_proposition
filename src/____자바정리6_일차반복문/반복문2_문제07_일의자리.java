package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		9�� ����� 100���� ū���� ���� �ڸ��� 6�� ù��° 9�� ��� ����Ͻÿ�.
	[����]
		126
*/
public class �ݺ���2_����07_�����ڸ� {	
	public static void main(String[] args) {	
//		int i = 1;
//		int a = 0;
//		while(true) {
//			if(i % 9 == 0) {
//				if(i >= 100) {
//					a = i % 10;
//					if(a == 6) {
//						System.out.println(i);
//						break;
//					}
//				}
//			}
//			i += 1;
//		}
		int i = 100;
		while(true) {
			int a = i % 10;
			if(i % 9 == 0 && a == 6) {
				System.out.println(i);
				break;
			}
			i += 1;
		}
		
	}
}
