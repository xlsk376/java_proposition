package ____�ڹ�����8_�����ݺ���;

import java.util.Scanner;

public class �������ݺ���2_����01_�����Ҽ� {
	/*
	 *  [���� �Ҽ� ã��]
	 * 1. ���ڸ� �� �� �Է¹޴´�.
	 * 2. �Է¹��� ���ں��� ū ù ��° �Ҽ��� ����Ѵ�.
	 * 
	 * ��) Enter Number ? 1000
	 *    1000���� ū ù���� �Ҽ��� 1009
	 * ��) Enter Number ? 500
	 *    500���� ū ù��° �Ҽ��� 503
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number ? ");
		int number = scan.nextInt();
		
		while(true) {
			int count = 0;
			for(int i = 1; i <= number; i++) {
				if(number % i == 0) {
					count += 1;
				}
			}
			if(count == 2) {
				System.out.println("�Ҽ� : " + number);
				break;
			}else {
				number += 1;
			}
		}
		
		// �Է��� �Ҽ����� �ٷ� ū ù��° �Ҽ��� ã�°�, 1000�� �ԷµǾ� �Ҽ��� �ƴ϶�� number�� +1 ���ְ� count = 0 ���� �ٲ��ش�.
		// �Ҽ��� ���� 2�� ���ö����� �ݺ��ؼ� �����ش�.
		

	}
}
