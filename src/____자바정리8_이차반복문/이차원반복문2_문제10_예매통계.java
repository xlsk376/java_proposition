package ____�ڹ�����8_�����ݺ���;

import java.util.Arrays;
/*
  1) seatList �� ��ȭ�� 7�ڸ��� ��Ÿ����. 
  2) seatList �� ������ ��ȭ�� ������ ȸ����ȣ�� ��Ÿ����. 
  3) numList �� ȸ����ȣ�̴�.
  4) countList �� ��ȸ������ ���Ÿ� �󸶳� �ߴ��� ������ ǥ���Ѵ�.
  5) seatList �� �˻��ؼ� �� ȸ������ ������ ���� countList�������Ѵ�.
  
  	��) int countList[] = {1,1,2,0};
 */
public class �������ݺ���2_����10_������� {

	
	public static void main(String[] args) {
			
		int seatList[] = {1003,1003,0,0,1002,0,1001};
		
		int numList[] = {1001,1002,1003,1004};
		int countList[] = {0,0,0,0};
		
		int count = 0;
		for(int i = 0; i < seatList.length; i++) {
			// ���� 0�϶��� numList�� �˻����ʿ����.
			if(seatList[i] == 0) {
				continue;
			}
			for(int j = 0; j < numList.length; j++) {
				count += 1;
				if(seatList[i] == numList[j]) {
					countList[j] += 1;
					break;// �ݺ�Ƚ���� ���ϼ��ִ�. 
				}
				
			}
		}
		System.out.println(count); 
		System.out.println(Arrays.toString(countList));
	}
}
