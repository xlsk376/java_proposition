package ____�ڹ�����7_�����迭;

import java.util.Arrays;
import java.util.Random;

public class �迭0_����10_�߰� {

	public static void main(String[] args) {
		/*
		ö���� ö���Ǹ�������� �������̴�. 
		map1�� map2 �� ���ӽ��������� ǥ���Ѵ�. 
		����1�� ö���� ��ġ�̴�. 
		�ֻ����� 1~6���� �ְ� �ֻ��� 2���� ������ ���ո�ŭ ������ �̵��Ѵ�. 
		
		�� 5�� �ݺ��ϰ� ��ȭ�� ö���� ��ġ��� 
		map1�� ���� �����ϸ� map2���̵��ؼ� �����ϰ�, 
		map2 �� ���� �����ϸ� �ٽ� map1 �� �̵��ؼ� �����Ѵ�. 
		
		[����]
			�ֻ��� 3 , 5 ==> 8
			int map1[] = {0,0,0,0,0,0,0,0,1,0};
			int map2[] = {0,0,0,0,0,0,0,0,0,0};
			
			�ֻ��� 2 , 1 ==> 3
			int map1[] = {0,0,0,0,0,0,0,0,0,0};
			int map2[] = {0,1,0,0,0,0,0,0,0,0};
			
			�ֻ��� 6 , 1 ==> 7
			int map1[] = {0,0,0,0,0,0,0,0,0,0};
			int map2[] = {0,0,0,0,0,0,0,0,1,0};
			
			�ֻ��� 3 , 3 ==> 6
			int map1[] = {0,0,0,0,1,0,0,0,0,0};
			int map2[] = {0,0,0,0,0,0,0,0,0,0};
			
		
		*/
		int map1[] = {1,0,0,0,0,0,0,0,0,0};
		int map2[] = {0,0,0,0,0,0,0,0,0,0};
		
		Random ran = new Random();
		int me = 0;
		boolean check = false;
		int sum = 0;
		for(int i = 0; i < 5; i++) { // 5�� �ݺ�
			System.out.println("map1 : " + Arrays.toString(map1));
			System.out.println("map2 : " + Arrays.toString(map2));
			int r1 = ran.nextInt(5)+1;
			int r2 = ran.nextInt(5)+1;
			System.out.println(r1 + " " + r2);
			sum = r1 + r2;
			if(check == false) {
				map1[me] = 0;
				me += sum;
				if(me >= map1.length) {
					me -= map1.length;
					map2[me] = 1;
					map1[me] = 0;
					check = true;
				}else {
					map1[me] = 1;
				}
			}else {
				map2[me] = 0;
				me += sum;
				if(me >= map2.length) {
					me -= map2.length;
					map1[me] = 1;
					map2[me] = 0;
					check = false;
				}else {
					map2[me] = 1;
				}
			}
		}
		System.out.println("map1 : " + Arrays.toString(map1));
		System.out.println("map2 : " + Arrays.toString(map2));
		
	}
}
