package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		1~ 999 �� �������� �����߿��� 8�� ����� ū������ ���ʴ�� 4�� ����Ͻÿ�.
	[����]
		992 984 976 968 
*/
public class �ݺ���2_����05_����װ�2 {
	public static void main(String[] args) {
		int i = 999;
		int count = 0;
		boolean run = true;
		while(run == true) {
			if(i % 8 == 0) {
				System.out.print(i + " ");
				count += 1;
				if(count == 4) {
					run = false;
				}
			}
			i -= 1;	
		}
	}
}
