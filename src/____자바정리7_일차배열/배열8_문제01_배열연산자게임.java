package ____�ڹ�����7_�����迭;

import java.util.Arrays;
import java.util.Scanner;
/*
	[�׽�Ʈ]
	������ ������ �Ϸ��� �Ѵ�. 
	������ �����̶� ���ڵ鸸 ȭ�鿡 ������ �����ڸ� ���ߴ°����̴�.
	���� ��� 3+3=6 �̶�� ȭ�鿡 �Ʒ��Ͱ��� ����̵ǰ�, ����ڴ� �����ڸ� ���ߴ°����̴�.
	-----------------------------
	3 ? 3 = 6 
	[1] + [2] - [3] *
	-----------------------------
	
	�Ʒ� �迭�� 6�����̰� a�� ���� ���� b�� ���� ���� op�� �����ڸ� ���Ѵ�. 
	������ �����, ���ᰳ���� ����Ͻÿ�.	
*/
public class �迭8_����01_�迭�����ڰ��� {
	public static void main(String[] args) {
		int a[] = {3,5,7,6,4,9};
		int b[] = {8,6,8,5,5,3};		
		String op[] = {"+","-","+","*","*","+"};// + : 1 , - : 2 , * : 3
		int temp[] = new int[op.length];
		int ��[] = new int[a.length];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < op.length; i++) {
			if(op[i] == "+") {
				temp[i] = 1;
			}else if(op[i] == "-") {
				temp[i] = 2;
			}else if(op[i] == "*") {
				temp[i] = 3;
			}
		}
		//System.out.println(Arrays.toString(temp));
		for(int i = 0; i < temp.length; i++) {
			if(temp[i] == 1) {
				��[i] = a[i]+b[i];
			}else if(temp[i] == 2) {
				��[i] = a[i]-b[i];
			}else if(temp[i] == 3) {
				��[i] = a[i]*b[i];
			}
		}
		//System.out.println(Arrays.toString(��));
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			System.out.printf("%d ? %d = %d", a[i], b[i], ��[i]);
			System.out.println();
			System.out.println("�˸��� ������ ���ÿ�.");
			System.out.println("[1] + [2] - [3] *");
			int n = scan.nextInt();
			if(n == temp[i]) {
				count += 1;
			}
		}
		System.out.println("���ᰳ�� : " +count);
		System.out.println("Ʋ������ : " + (6-count));
		
	}
}
