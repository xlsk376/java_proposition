package ____�ڹ�����7_�����迭;

import java.util.Arrays;
import java.util.Random;

public class �迭0_����11_�߰� {

	public static void main(String[] args) {
		/*
	 	���� index���� �������� �ε���(0~9)�� �Է¹޴´�.
	 	
	 	���� pos ���� �������� �Ÿ�(3~6) �� �Է¹޴´�.
	 	
	 	arr �迭�� index ���� pos ��ŭ ���� 1�� ä��� ��� 
	 	
	 	�� ���࿡ index ��  �迭 ũ�⸦ �ʰ��ϸ� �տ��� ���� �̾ 1�� ����
	 	
	 	[����1] 
	 		index : 3 , pos : 3  ==> {0,0,0,1,1,1,0,0,0,0};
	 		
	 	[����2] 
	 		index : 8 , pos : 4  ==> {1,1,0,0,0,0,0,0,1,1};
	 */
			
		int arr[] = {0,0,0,0,0,0,0,0,0,0};
		int index = 0;
		int pos = 0;
		
		Random ran = new Random();
		index = ran.nextInt(10);
		pos = ran.nextInt(4)+3;
		System.out.println(index + " " + pos);
		for(int i = 0; i < pos; i++) {
			if(index >= arr.length) {
				index = 0;
				arr[index] = 1;
			}else {
				arr[index] = 1;
			}
			index += 1;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
