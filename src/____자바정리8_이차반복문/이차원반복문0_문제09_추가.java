package ____�ڹ�����8_�����ݺ���;

import java.util.Arrays;
import java.util.Random;

public class �������ݺ���0_����09_�߰� {

	public static void main(String[] args) {
		/*
	  	[1] �������� 1~9������ �������� Ȧ���� arr �迭�� �����Ѵ�.
	  	[2] ������ �ڿ��� �����Ѵ�.
	  	[3] ���ο�� ����ɶ��� ������ �о�� �ǵڿ� �����Ѵ�.
	  	
	  	[����]
	  		r ==> 3 , arr ==> {0,0,0,0,3,3};
	  		r ==> 5 , arr ==> {0,0,3,3,5,5};
	  		r ==> 1 , arr ==> {3,3,5,5,1,1};
	  	
		*/	 
		int arr[] = new int[6];
		Random ran = new Random();
		int count = 0;
		for(int i = 0; i < arr.length; i+=2) {
			int r = ran.nextInt(9)+1;
			if(r % 2 == 1) {
				System.out.println("r : " + r);
				int index = 5-count;
				for(int j = 0; j < count; j++) {
					arr[index-1] = arr[index+1];
					index += 1;
				}
				arr[4] = r;
				arr[5] = r;
				count += 2;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

}
