package ____�ڹ�����6_�����ݺ���;

public class �ݺ���0_����06_�߰� {
	public static void main(String[] args) {
		/*
		 * ö���� 30��¥�� ����� �ֻ�ܿ� ���ִ�. 
		 * ���ϾƷ����� ���������� �Ѵ�. 
		 * ö���� �������� ���ʹ߷� ���� ����� ����Ͻÿ�. 
		 * �Ʒ����ǵ��� �����Ͻÿ�.
		 * [����]
		 * [1] ö���� ������ �Ѱ�ܾ� ��������. 
		 * [2] ö���� ù���� ���ʴٸ����� ����� ��������. 
		 * [3] ����� �ټ����Ҷ� ���� �ݴ���ٸ��� �ٲ㼭 ����Ͻÿ�.
		 * 
		 * [����]
		 * 	29 27 25 23 21 
		 *  20 18 16 14 12 
		 *  11 9  7  5  3
		 *  2			 
		 */
		int turn = 1;
		int count = 0;
		for(int i = 30; i >= 1; i--) {
			if(turn == 1) {
				if(i % 2 == 1) {
					System.out.print(i + " ");
					count += 1;
				}
				if(count == 5) {
					count = 0;
					turn = 2;
					System.out.println();
				}
			}else if(turn == 2) {
				if(i % 2 == 0) {
					System.out.print(i + " ");
					count += 1;
				}
				if(count == 5) {
					count = 0;
					turn = 1;
					System.out.println();
				}
			}
		}
	
	}
}
