package ____�ڹ�����8_�����ݺ���;

import java.util.Arrays;
import java.util.Random;

/*
	[���� �߱� ����]		
	[1] com �迭�� 0~9������ ���� 3���� ���� �� com�迭�ȿ� �ߺ����� ������Ѵ�.
	[2] me �迭�� 0~9������ ���� 3���� ���������Ѵ� �� me�迭�ȿ� �ߺ����� ������Ѵ�.
	[3] com �� me �� ���ؼ� ���ڰ� ���� �ڸ��� ������ strike + 1;
	[4] com �� me �� ���ؼ� ���ڰ� ���� �ڸ��� Ʋ���� ball + 1;
	[5] ����ڿ��� strike �� ball  ������ ����Ѵ�. 
	���ϸ��� ���� �ݺ��ϸ鼭 strike += 3 �� �ɶ����� �ݺ��Ѵ�.
	
*/
public class �������ݺ���2_����07_���ھ߱� {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] com = new int[3];
		int[] me = new int[3];

		for (int i = 0; i < com.length;) {
			int r = ran.nextInt(10);
			boolean check = false;
			for (int j = 0; j < com.length; j++) {
				if (com[j] == r) {
					check = true;
					break;
				}
			}
			if (check == false) {
				com[i] = r;
				i += 1;
			}
		}
		System.out.println("com : "+Arrays.toString(com));
		while (true) {
			System.out.println("---");
			for (int i = 0; i < me.length;) {
				int r1 = ran.nextInt(10);
				boolean check = false;
				for (int j = 0; j < me.length; j++) {
					if (me[j] == r1) {
						check = true;
						break;
					}
				}
				if (check == false) {
					me[i] = r1;
					i += 1;
				}
			}
			int s = 0;
			int b = 0;
			for(int i = 0; i < me.length; i++) {
				for(int j = 0; j < me.length; j++) {
					if(com[i] == me[j]) {
						if(i == j) {
							s += 1;
						}else {
							b += 1;
						}
					}
				}
			}
			System.out.println("com : "+Arrays.toString(com));
			System.out.println("me : "+Arrays.toString(me));
			System.out.println(s + " "+ b);
			if(s == 3) {
				break;
			}
		}
		
		// ���ǿ� �´� ���� �ݺ��� ���ֱ�, com�迭 �ߺ����� ����, me�迭(�ߺ���������)�� com�迭�� ���ؼ� strike�� 3�� �ɶ����� ����ȴ�.
		// 

	}
}
