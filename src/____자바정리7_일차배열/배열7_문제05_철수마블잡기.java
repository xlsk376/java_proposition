package ____�ڹ�����7_�����迭;

import java.util.Arrays;
import java.util.Random;

/*
	�Ʒ��� �迭�� ö���� ������ �迭�� ǥ���Ѱ��̴�.
	p1�� ö���̰� p2�� �μ��� ���Ѵ�. 
	������ p1�� �����̰� 
	�ֻ����� ������ �������� (1~6)�� �����Եȴ�. 
	ö���� ���� 6�� ��ġ�� �ְ�,
 	ö���� ��ġ�� �ֻ��� ���ڸ�ŭ ������ �̵��Ѵ�.
	[����]
		[1]	ö���� �μ��� ��ġ�� �����ϸ� �μ��� �������̵Ǿ �Ǿ����� �̵��Ѵ�.
		[2] ö���� ����ġ��  �ֻ����� ���� �迭�� ���̸� �Ѿ�� 
			ö���� �Ǿ����� �̵��ϰ� �ʰ��Ѽ��ڸ�ŭ ���̵��Ѵ�. 
 */
public class �迭7_����05_ö��������� {
	public static void main(String[] args) {
		int p1[] = { 0, 0, 0, 0, 0, 0, 1, 0, 0 ,0};
		int p2[] = { 0, 0, 0, 0, 0, 0, 0, 0, 2 ,0};
		int dice = 0;
		Random ran = new Random();
		int c = 0;
		int m = 0;
		for(int i = 0; i < p1.length; i++) { // ������ġ
			if(p1[i] == 1) {
				c = i;
			}
			if(p2[i] == 2) {
				m = i;
			}
		}
		boolean check = false;
		int win1 = 0;
		int win2 = 0;
		
		while(true) {
			System.out.println("p1 : " + Arrays.toString(p1));
			System.out.println("p2 : " + Arrays.toString(p2));
			dice = ran.nextInt(6)+1;
			System.out.println("�ֻ��� : " + dice);
			if(check == false) {
				System.out.println("p1 turn");
				p1[c] = 0;
				c += dice;
				if(c >= p1.length) {
					c -= p1.length;
					p1[c] = 1;
					win1 += 1;
				}else {
					p1[c] = 1;
				}
				if(c == m) {
					p2[m] = 0;
					m = 0;
					p2[m] = 2;
				}
				check = true;
			}
			else {
				System.out.println("p2 turn");
				p2[m] = 0;
				m += dice;
				if(m >= p2.length) {
					m -= p2.length;
					p2[m] = 2;
					win2 += 1;
				}else {
					p2[m] = 2;
				}
				if(c == m) {
					p1[c] = 0;
					c = 0;
					p1[c] = 1;
				}
				check = false;
			}
			if(win1 == 3 || win2 == 3) {
				System.out.println("p1 : " + Arrays.toString(p1));
				System.out.println("p2 : " + Arrays.toString(p2));
				break;
			}
		}
		
	}
}
