package ____�ڹ�����8_�����ݺ���;

import java.util.Arrays;

public class �������ݺ���4_����07_��Ȧ�μ������� {
	/*
	 	�Ʒ� �迭���� ȥ���ִ� ���ڸ� �������� ���������鸸 ����غ���.
			 
	  	(��)
			{1,2,3,2,1}  ==>  {1,2,2,1}    // 3�� ȥ������
		    {1,3,4,4,2}  ==>  {4,4}        // 1,2,3 ȥ������
		    {1,1,1,1,1}  ==>  {1,1,1,1,1}  // ����
	 
	 */

	public static void main(String[] args) {
		
		int test[] = {1,3,4,4,2} ;				
		int temp[] = new int[5];
		int index = 0;
		for(int i = 0; i < test.length; i++) {
			boolean check = false;
			for(int j = 0; j < test.length; j++) {
				if(i != j && test[i] == test[j]) {
					check = true;
					break;
				}
			}
			if(check == true) {
//				temp[index] = test[i];
//				index += 1;
			}else {
				temp[index] = test[i];
				index += 1;
			}
		}
		System.out.println(Arrays.toString(temp));
		
	}
	
}
