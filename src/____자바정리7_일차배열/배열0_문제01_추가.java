package ____�ڹ�����7_�����迭;
public class �迭0_����01_�߰� {
	/*
		 [1] �迭 arr �� 1�� 0���� �Ǿ��ִ�.
		 [2] ����1 �� �̹� ä���� �ڸ��̰� 0�� ����ִ��ڸ��̴�.
		 [3] input ������ ���� �Է¹ް� �Ʒ� ������ ���� 
		  	��) input => 3 ==> �ε��� 2���� �������� 3ĭ�� ��������Ƿ�, 
		 		{0,1,1,1,1,1,0,0};	
		 		
		 	��) input => 4 ==> ��������4ĭ ����ִ��ڸ��� �����Ƿ� "x"
		 		{0,1,0,0,0,1,0,0};
		 		
		 	��) input => 1 ==> �ε��� 0�� �ڸ��� ��������Ƿ� 
		 		{1,1,0,0,0,1,0,0};	
	*/
	public static void main(String[] args) {
		int arr[] = {0,1,0,0,0,1,0,0};			
		int input = 2;		
		int count = 0;
		int startIndex = -1;
		boolean check = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				if(count == 0) {
					startIndex = i;
				}
				count += 1;
				if(count == input) {	
					check = true;
					break;
				}
			}else {
				count = 0;
			}
		}
		System.out.println();
		if(check == false) {
			System.out.println("��ĭ�̾���.");
		}else {
			System.out.println("��ĭ�� �ִ� " + startIndex);
		}
	}
}
