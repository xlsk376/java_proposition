package ____�ڹ�����7_�����迭;

import java.util.Arrays;
import java.util.Random;

/*
	bingo �迭�� 3�ٸ��� �ٹٲ��� �Ͽ� ����ϸ� �Ʒ��� ����.
	
	0,0,1,
	0,0,1,
	1,1,1,
	
	���γ� ������ ��1�� �������� 3���� �����̴�. 
	bingo �迭�� ���� 2�� �ΰ��̴�.
	
	[����]
		[1] test �迭�� 0 �Ǵ� 1�� �������� �������� 3�ٸ��� �ٹٲ��Ͽ� ����Ѵ�.
		[2] ������ ���� ��� 
 */
public class �迭7_����04_�������� {
	public static void main(String[] args) {
		int bingo[] = {
			0,0,1,
			0,0,1,
			1,1,1,
		};
		
		int test[] = new int[9];
		Random ran = new Random();
		for(int i = 0; i < test.length; i++) {
			test[i] = ran.nextInt(2);
			System.out.print(test[i] + " ");
			if(i % 3 == 2) {
				System.out.println();
			}
		}
		int count1 = 0;
		int a = 0;
		for(int i = 0; i < test.length; i++) { // ���� ���� : 0 1 2 / 3 4 5 / 6 7 8 
			if(test[i] == 1) {
				count1 += 1;
			}else {
				count1 = 0;
			}
			if(count1 == 3) {
				a += 1;
			}
			if(i % 3 == 2) {
				count1 = 0;
			}
		}
		int index = 0;
		int b = 0;
		for(int i = 0; i < 3; i++) { // 0 3 6 / 1 4 7 / 2 5 8
			if(test[i] == 1) {
				index = i;
				int count2 = 0;
				if(index <= 2) {
					for(int j = index; j < test.length; j+=3) {
						if(test[j] == 1) {
							count2 += 1;
							//System.out.println(count2);
						}
//						else {
//							count2 = 0;
//						}
						if(count2 == 3) {
							b += 1;
							
						}
					}
				}
			}
		}
		
		if(a >= 1 || b >= 1) {
			System.out.println("���� : " + (a+b));
			System.out.println(a + " " + b);
		}else {
			System.out.println("�ƴϴ�!!");
		}
		
		
	}
}
