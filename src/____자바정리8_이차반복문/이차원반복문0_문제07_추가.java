package ____�ڹ�����8_�����ݺ���;

import java.util.Arrays;
import java.util.Random;

public class �������ݺ���0_����07_�߰� {

	public static void main(String[] args) {
		/*
	 	int[]arr = new int[6];
	  
	  	�������� 1~9�� �ټ��� arr �� �����ҷ��� �Ѵ�. 
	  	[����1] Ȧ���������Ѵ�. 
	  	[����2] �Ǿտ� �����Ѵ�.
	  	[����3] ���ο� ���� ������ ������ ������ �ڷ� �а� �Ǿտ� �����Ѵ�. 
	  	[����4] ���� �ΰ��� �����Ѵ�. 
	  
	  	[����]
	  		r = 1  ,  arr = {1,1,0,0,0,0};
	  		r = 3  ,  arr = {3,3,1,1,0,0};
	  		r = 7  ,  arr = {7,7,3,3,1,1};
		*/
		Random ran = new Random();
		int[]arr = new int[6];
		
		int count  = 0;
		for(int i = 0; i < arr.length; i+=2) {
			int r = ran.nextInt(9)+1;
			if(r % 2 == 1) {
				System.out.println("r : " + r);
				int index = count;
				for(int j = 0; j < count; j++) {
					arr[index+1] = arr[index-1];
					index -= 1;
				}
				arr[0] = r;
				arr[1] = r;
				count += 2;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
