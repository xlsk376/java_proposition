package ____�ڹ�����7_�����迭;

import java.util.Arrays;
import java.util.Scanner;

/*
�ε����� �Է¹ް� �ش� �ε����� ����  0���� ����

�߰����� : �ش� �� �翷�� ���鵵 8�� ���� 
��, 0, 4 �ε����ϰ��� �翷�� �Ѱ��� 8�� ���� 

(��) 1 ==> {8,0,8,9,9}
(��) 4 ==> {9,9,9,8,0}

*/
public class �迭5_����01_���� {
	public static void main(String[] args) {
		int arr[] = {9,9,9,9,9};	
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if(n == 0) {
			arr[n] = 0;
			arr[n+1] = 8;
		}else if(n == 4) {
			arr[n] = 0;
			arr[n-1] = 8;
		}else {
			arr[n] = 0;
			arr[n-1] = 8;
			arr[n+1] = 8;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}