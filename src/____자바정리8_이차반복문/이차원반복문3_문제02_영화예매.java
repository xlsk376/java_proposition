package ____�ڹ�����8_�����ݺ���;

import java.util.Scanner;
/*
 [��ȭ�� �¼�����]
  1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
  2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
  3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
  4. �� �¼��� ���� ������ 12000���̴�.
  5. ���α׷� ���� ��, �ش� ��ȭ���� �� �ݾ��� ����Ѵ�.
 ��)
  seat = 0 0 0 0 0 0 0
 
 �¼����� : 1
 seat = 0 1 0 0 0 0 0
  
 �¼����� : 3
 seat = 0 1 0 1 0 0 0
 
 �¼����� : 3
 seat = 0 1 0 1 0 0 0
 �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.

 �ѱݾ� : 24000��
 */
public class �������ݺ���3_����02_��ȭ���� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int[] seat = new int[7];
		
		boolean run = true;
		while(run) {
			System.out.println("=�ް� ��ȭ��=");				
			System.out.println("1.�¼�����");
			System.out.println("2.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				
				for(int i = 0; i < 7; i++) {
					System.out.print(seat[i] + " ");
				}
				System.out.println();	
				System.out.println("������ �¼��� �Է��ϼ���.");
				int index = scan.nextInt();
				boolean check = false;
				for(int i = 0; i < seat.length; i++) {
					if(seat[i] == 1) {
						check = true;
						if(i == index) {
							System.out.println("�̹� ���ŵ� �¼��Դϴ�.");
						}
					}else if(seat[i] == 0){
						if(i == index) {
							check = false;
							break;
						}
					}
				}
				if(check == false) {
					seat[index] = 1;
				}
			}
			else if(sel == 2) {
				int count = 0;
				for(int i = 0; i < seat.length; i++) {
					if(seat[i] == 1) {
						count += 1;
					}
				}
				System.out.println("������ �¼� : " + count);
				System.out.println("�ѱݾ� : "+count*12000);
				System.out.println("����������.");
				run = false;
			}
		}
		
	}

}
