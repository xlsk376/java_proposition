package ____�ڹ�����6_�����ݺ���;

import java.util.Random;
import java.util.Scanner;
/*
	[���������� ����] (�ݺ������)
		1. ���������� ������ 10ȸ �ݺ��Ѵ�.
		2. ������ ���߸� 1������ 10���̴�.
		3. ���� ���� ��, ������ ����Ѵ�.
		4. ��, 3����������Ʋ���� ��������ϸ� 0���̵ȴ�.
*/
public class �ݺ���8_����01_�����ܰ���2 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);	
		int i = 1;
		int score = 0;
		int combo = 0;
		while(true) {
			if(i == 10) {
				break;
			}
			int a = ran.nextInt(8) + 2; // 0~7 + 2
			int b = ran.nextInt(9) + 1; // 0~8 + 1
			int c  = a * b;
			System.out.printf("%d * %d = " , a , b);
			int me = scan.nextInt();
			if(c == me) {
				score += 10;
				System.out.println("����");
				combo = 0;
			}else {
				System.out.println("����");
				combo += 1;
				if(combo == 3) {
					System.out.println("���ӽ��� : " + combo);
					score = 0;
					break;
				}
			}		
			i += 1;
			
		}
		System.out.println("���� : " + score);
		scan.close();
	}
}
