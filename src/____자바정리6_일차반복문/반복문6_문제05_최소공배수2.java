package ____�ڹ�����6_�����ݺ���;
/*
	[����] 
		45�� 60�� 75�� �ּҰ������ ���Ͻÿ�.
	[����]
		900
*/
public class �ݺ���6_����05_�ּҰ����2 {
	public static void main(String[] args) {
		int i = 45;
		while(true) {
			if(i % 45 == 0 && i % 60 == 0 && i % 75 == 0) {
				System.out.println(i);
				break;
			}
			i += 1;
		}
	}
}
