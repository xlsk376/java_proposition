package ____�ڹ�����7_�����迭;
import java.util.Arrays;
/*
	[����] ���� �Է¹ް� ���� 
	[����] ���࿡ �������� ������ ������ ����ù��°�� ��  �Ѱ��� ���� �� 
			b �� ���������� ���� 
			data[] = {5,2,6,8,5,6};
			  
	[��] 2 ==>  b [] = {5,6,8,5,6};
	[��] 6 ==>  b [] = {5,2,8,5,6};
*/
public class �迭6_����11_�ߺ�ù��°���������� {
	public static void main(String[] args) {	
		int data[] = {5,2,6,8,5,6};
		int b [] = null;
		int value = 6;		
		int index = -1;	
		for(int i = 0; i < data.length; i++) {
			if(value == data[i]) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("����");
		}else {
			int bindex = 0;
			for(int i = 0; i < data.length; i++) {
				if(i != index) {
					b[bindex] = data[i];
					bindex += 1;
				}
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
