package ____�ڹ�����7_�����迭;

import java.util.Arrays;
/*
	[����] 
	�Ʒ� �迭 c�� ��ȣ�� ���� �ѽ��� �迭�̴�. 
	��ȣ�� �ϳ��� �Է¹ް� c�迭�� �ִ� ��ȣ�̸�, 
	�׹�ȣ��  ���� �����ϰ� d�迭�� �����Ѵ�.
	[��] 1002 ==> d[] = {1001, 40, 1003, 70};
 */
public class �迭6_����05_���ι迭���������� {
	public static void main(String[] args) {	
		int c[] = { 1001, 40, 1002, 65, 1003, 70 };
		int d[] = null;
		int index = -1;
		int number = 1002;
		for(int i = 0; i < c.length; i++) {
			if(c[i] == number) {
				index = i;
			}
		}
		if(index == -1) {
			System.out.println("ã�¹�ȣ�� �����ϴ�.");
		}else {
			
			int dindex = 0;
			for(int j = 0; j < c.length; j+=2) {
				if(index != j) {
					d[dindex] = c[j];
					d[dindex +1] = c[j+1];
					dindex += 2;
				}
			}		
		}
		System.out.println(Arrays.toString(d));
	}
}
