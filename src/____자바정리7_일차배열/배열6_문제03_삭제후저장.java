package ____�ڹ�����7_�����迭;
/*
	[����]
	�Ʒ��迭 a �� �ȿ� �ִ� ���� �ϳ� �Է¹޴´�.
	b�迭�ȿ� ������ �Է��� ���� �����ϰ� �����Ѵ�.
	[��] 30 ==> b[] = {10,20,40,50};
 */
public class �迭6_����03_���������� {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = null;
		int input = 30; // ����������
		int room = 0;
		int count = 0;
		for(int i = 0; i < 5; i++) {
			if(input != a[i]) {
				count += 1;
			}
		}
		b = new int[count];
		for(int i = 0; i < 5; i++) {
			if(input != a[i]) {
				b[room] = a[i];
				room += 1;
			}
		}
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}	
	}
}
