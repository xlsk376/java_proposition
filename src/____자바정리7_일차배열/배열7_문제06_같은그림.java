package ____�ڹ�����7_�����迭;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
	�Ʒ��迭�� ī��10���� �迭�� ǥ���Ѱ��̴�.
	ī��� a~e ������ ���ڰ� �׷����ְ� ���� 2�徿 �ִ�.
	�Ʒ� ī�带 �����ϰ� ����Ѵ�.
	�ε��� 2���� �Է¹ް� ��ī���� ����� ���� ������ ī���� ���� "x" �� ǥ���Ѵ�. 
	
 */
public class �迭7_����06_�����׸� {
	public static void main(String[] args) {
		String[] card = { "a", "a", "b", "b", "c", "c", "d", "d", "e", "e" };
		int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 100; i++) {
			int r1 = ran.nextInt(card.length);
			int r2 = ran.nextInt(card.length);
			String temp = card[r1];
			card[r1] = card[r2];
			card[r2] = temp;
		}
		int count = card.length / 2;
		while(true) {
			System.out.println(Arrays.toString(card));
			System.out.println(Arrays.toString(a));
			if(count == 0) {
				break;
			}
			System.out.println("ī�� 2���� �����ϼ���.");
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			
			if(n1 != n2 && card[n1] == card[n2]) {
				card[n1] = "x";
				card[n2] = "x";
				count -= 1;
			}else {
				System.out.println("�ٽü������ּ���.");
			}
			
			
		}

	}
}
