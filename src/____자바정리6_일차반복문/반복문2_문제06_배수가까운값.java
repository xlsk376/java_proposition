package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
  		6�� ����� ���������� �˻��Ѵ�. 
  		6����� 100�� ���尡��� ���� ��� �Ͻÿ�.
 	[����]
 		102
*/
public class �ݺ���2_����06_������� {
	public static void main(String[] args) {		
		int i = 1;
		int a = 0;
		while(true) {
			if(i % 6 == 0) {
				if(i >= 100) {
					a = i;
					break;
				}
			}
			i += 1;
		}
		System.out.println(a);
		int b = a - 6;
		
		if(a -100 > 100- b) {
			System.out.println(b+" : �� �����");
		}else {
			System.out.println(a+" : �� �����");
		}
		
		
	}
}
