package ____�ڹ�����5_���ǹ�;
/*
	[����]		
		a �� c �� ����ڰ� b �� ��������� ����Ͻÿ�. 
	[��]
		a �� �� ������.
		c �� �� ������.
		a �� c �� �Ȱ���. 
*/
public class ���ǹ�1_����04_������2 {
	public static void main(String[] args) {		
		int a = 96;
		int b = 100;
		int c = 102;		
		int a2 = b - a;
		int c2 = c - b;		
		if(a2 == c2) {
			System.out.println(a + " " + c);
		}
		if(a2 < c2) {
			System.out.println(a);
		}
		if(a2 > c2) {
			System.out.println(c);
		}
	}
}
