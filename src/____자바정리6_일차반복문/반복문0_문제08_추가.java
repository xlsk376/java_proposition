package ____�ڹ�����6_�����ݺ���;

public class �ݺ���0_����08_�߰� {
	public static void main(String[] args) {
		/*
		����� 50 ����� �ִ�. ö���� ���� ����ܿ� ���ִ�. 
		ö���� �ѹ��� �ΰ�ܾ� ��������. 
		ö���� �޹߷� ��� ����� ����Ͻÿ�.
		�Ʒ������� �����Ͻÿ�.
		[1] ö���� �ѹ��� �ΰ�ܾ� ��������.
		[2] ö���� ���ʹߺ��� ��������.
		[3] 5������Ҷ����� �ٸ� ���� ����Ͻÿ�.
		
		48 44 40 36 32 
		30 26 22 18 14
		12 8  4
		*/
		int pos = 50;
		int count = 0;
		for(int i = 0; i <= 50; i++) {
			if(count == 0 || count == 5) {
				pos -= 2;
				count += 1;
				System.out.print(pos + " ");
			}else {
				pos -= 4;
				count += 1;
				System.out.print(pos + " ");
				if(count == 5) {
					count = 0;
					System.out.println();
				}
			}
			if(pos <= 4) {
				break;
			}
		}
	}
}
