package ____�ڹ�����8_�����ݺ���;

import java.util.Arrays;
import java.util.Random;

public class �������ݺ���0_����08_�߰� {

	public static void main(String[] args) {
		/*
		[1] �Ʒ��迭�� 1~9������ ���� ���� 3���� ������ ��� 
		[2] ����3���� ���� ��ġ��ȵȴ�. 
		[3] ����3���� ���� �ݵ�� 20�̿����Ѵ�. 
		*/		 
		int arr[] = new int[3];
		Random ran = new Random();
		while(true) {
			int total = 0;
			for(int i = 0; i <arr.length;) {
				int r = ran.nextInt(9)+1;
				boolean check = false;
				for(int j = 0; j < arr.length; j++) {
					if(r == arr[j]) {
						check = true;
						break;
					}
				}
				if(check == false) {
					arr[i] = r;
					i += 1;
				}
			}
			for(int i = 0; i < arr.length; i++) {
				total += arr[i];
			}
			if(total == 20) {
				System.out.println(Arrays.toString(arr));
				break;
			}
		}
		
	}

}
