package ____�ڹ�����8_�����ݺ���;
/*
 1) seatList �� ��ȭ�� 7�ڸ��� ��Ÿ����. 
 2) seatList �� ������ ��ȭ�� ������ ȸ����ȣ�� ��Ÿ����. 
 3) find�� ������ �˻��ϰ����ϴ� ȸ����ȣ���̴�.
 4) find �� ���� ��ȭ������ ã�� �ڸ��� ���������. ��, ���¹�ȣ�� "x" ���
 	- ��) [1] find : 1004 �� �����Ƿ� "x" ��� 
   - ��) [2] find : 1003 �� 0 , 1
   - ��) [3] find : 1001 �� 6 
   - ��) [4] find : 1005 �� �����Ƿ� "x" ���  
 */
public class �������ݺ���2_����09_���Ű˻� {

	public static void main(String[] args) {
			
		int seatList[] = {1003,1003,0,0,1002,0,1001};	
		int find[] = {1004,1003,1001,1005};
		
		for(int i = 0; i < find.length; i++) {
			System.out.print(find[i] + " : ");
			boolean check = false;
			for(int j = 0; j < seatList.length; j++) {				
				if(find[i] == seatList[j]) {
					System.out.print(j + " ");
					check = true; // ������ true�� �ٲ��־�� �Ѵ�. ���� �ƴҶ� �����ؼ� true�� �����ؼ� true�϶� ����Ѵٸ� ��ü �迭�� ���ؼ� ���� ��찡 �����Ƿ� x�� 1���� ������ ��µ�
				}
				//System.out.print(seatList[j] + " ");
			}
			if(check == false) {
				System.out.print("x");
			}
			System.out.println();
		}
		
		
	}
}
