package ____�ڹ�����8_�����ݺ���;

public class �������ݺ���4_����01_���Ӽ��ڰ˻� {
	/*
	 input �� �迭���� ������   array�迭�� ����� ��ġ�ϰ�,
	  �׼����� ��ġ�ϸ�  true , �ƴϸ� false ��� 	
	  
	��) input1�� ������  6,1,8  �̰� array ��  
		index 5~7(6,1,8) �� ���� ������ ��ġ�Ѵ�.
	���)  true	
		  	
	��) input2�� ������ array �迭�� �ִ°���� ��ġ������, 
	   input2 ������ 6,3 �̰�, array �� ���� 3,6 ���� ������ �ٸ���.
	���) false
*/
	public static void main(String[] args) {		
		int array[] = {1,3,3,6,5,6,1,8,9};	
		int input1[] = {6,1,8};
		int input2[] = {6,3};
		
		boolean check = false;
		for(int i = 0; i < array.length - input1.length + 1; i++) { // 9 - 3 + 1 = 7 / 9 - 2 + 1 = 8
			int count = 0;
			for(int j = 0; j < input1.length; j++) {
				if(array[i + j] == input1[j]) {
					count += 1;
				}
				System.out.print(array[i + j] + " ");
			}
			System.out.println();
			if(count == input1.length) {
				check = true;
				System.out.println("����");
			}
		}
		
		
		
		
	}
}
