package ____�ڹ�����8_�����ݺ���;
/*
	[����] 
		�迭�� ���� �׷����� ����Ϸ����Ѵ�.
		graph �迭�� ������ ����ŭ * ���ݺ������� ���η� ����ϰ�,
		�������ڴ� �����ٲ㼭 ����Ͻÿ�.
	[��]
		 3   ==> ***
		 10  ==> **********
		 5   ==> *****
		 6   ==> ******
		 0   ==> 
		 1   ==> *	
*/
public class �������ݺ���1_����05_�׷������� {
	public static void main(String[] args) {
		int[] graph = {3, 10, 5, 6, 0, 1};
		
		for(int i = 0; i < graph.length; i++) {
			System.out.printf("%2d",graph[i]);
			System.out.print(" ==> ");
			for(int j = 0; j < graph[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//���߹ݺ����� ���ؼ� �׷����� y���� ù��°�ݺ������� �ΰ� graph�� ����ŭ ��µǴ� x���� �ι�°�ݺ������� �ξ� ������ش�.
					
	}
}
