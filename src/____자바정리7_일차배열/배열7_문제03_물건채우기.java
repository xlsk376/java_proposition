package ____�ڹ�����7_�����迭;

import java.util.Arrays;

/*
	ö���� ���������� �Ƹ�����Ʈ�� �ϰ��ִ�. 
	��簡 �ߵǼ� ����� ���� �ȷȴ�. 
	�������� �ִ� 10������ ������ ä����ִ�.
	
	���� 4ĭ�� ���ڿ� 5���� ������ִ�.
	
	�������� �տ������� ��ó������ä���ְ� ����� ����Ͻÿ�.
	
	[��]
		�������帶�� �ʿ��Ѱ����� �Ʒ��Ͱ���.
		{6, 10, 1, 7, 9}
		
		������ ���� ��� ���ڸ��⶧���� �ִ� �Ʒ��Ͱ��� ä���������ִ�.
		{10, 10, 10, 6, 1};		
*/
public class �迭7_����03_����ä��� {
	public static void main(String[] args) {
		int a[] = {4,0,9,3,1};	
		int b[] = {5,5,5,5};
		int count = 4;
		boolean check = false;
		for(int i = 0; i < a.length; i++) {
			if(a[i] != 10) {
				while(true) {
					if(a[i] == 10) {
						break;
					}else {
						a[i] += 1;
						b[0] -= 1;
						if(b[0] == 0) {
							for(int j = 0; j < count-1; j++) {
								b[j] = b[j+1];
							}
							b[count-1] = 0;
							count -= 1;
							if(count == 0) {
								check = true;
								break;
							}
						}
						
					}
				}
				if(check == true) {
					break;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		
		
	}
}
