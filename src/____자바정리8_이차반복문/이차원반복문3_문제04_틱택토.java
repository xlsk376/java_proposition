package ____�ڹ�����8_�����ݺ���;

import java.util.Random;
import java.util.Scanner;

/* 
  [ƽ����]
  
 	����1) ���� ũ�ҿ� "ƽ����" �˻��� ������ �ѹ��ϰ� 
  	          �Ʒ��Ͱ��� ������.
   ����2) P1 , P2 �� �÷��̾ �����ư��鼭 �÷���.
   ����3) ���� ������ �ϼ��ϸ� �¸�
   [��õ����] P2 �� com���� ��ü�غ���.(com�� �������� �÷���)
 
  [ó��ȭ��]
  0,0,0
  0,0,0
  0,0,0
  [p1]�ε��� �Է� : 6
  =============
  [1��]
  0,0,0
  0,0,0
  1,0,0
  [p2]�ε��� �Է� : 1
  =============
  [2��]
  0,2,0
  0,0,0
  1,0,0
  [p1]�ε��� �Է� : 3
  =============
  [3��]
  0,2,0
  1,0,0 
  1,0,0
  [p2]�ε��� �Է� : 2
  =============
  [4��]
  0,2,2
  1,0,0
  1,0,0
  [p1]�ε��� �Է� : 0
  =============
  [5��]
  1,2,2
  1,0,0
  1,0,0
  [p1] �¸�
  
 */
public class �������ݺ���3_����04_ƽ���� {
	public static void main(String[] args) {
		int[] tic = new int[9];
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int turn = 1;
		int count1 = 0;
		int count2 = 0;
		int a = 0; // ����
		int b = 0; // ����
		int c = 0; // �밢��
		while (true) {
			for (int i = 0; i < tic.length; i++) {
				System.out.print(tic[i] + " ");
				if (i % 3 == 2) {
					System.out.println();
				}
			}
			if (a == 1 || b == 1 || c == 1) {
				if(turn == 1) {
					System.out.println("p2 �¸�");
				}else if(turn == 2) {
					System.out.println("p1 �¸�");
				}
				break;
			}
//			if(count1 == 4 && count2 == 4) { //���º� : 4��, 4�� ������ �ȳ����� ���º�, ���÷��̾ 5�� ��
//				System.out.println("���º�");
//				break;
//			}
			if (turn == 1) { // p1
				System.out.println("ME turn");
				int me = scan.nextInt();
				boolean check = false;
				for (int i = 0; i < tic.length; i++) {
					if (tic[i] == 1 || tic[i] == 2) {
						if (i == me) {
							System.out.println("�ٽ� �����ϼ���.");
							check = true;
							break;
						}
					} else if (tic[i] == 0) {
						if (i == me) {
							check = false;
						}
					}
				}
				if (check == false) {
					tic[me] = 1;
					turn = 2;
					count1 += 1;
				}
			} else if (turn == 2) { // p2
				System.out.println("COM turn");
				// int com = ran.nextInt(tic.length);
				int com = scan.nextInt();
				boolean check = false;
				for (int i = 0; i < tic.length; i++) {
					if (tic[i] == 1 || tic[i] == 2) {
						if (i == com) {
							System.out.println("�ٽ� �����ϼ���.");
							check = true;
							break;
						}
					} else if (tic[i] == 0) {
						if (i == com) {
							check = false;
						}
					}
				}
				if (check == false) {
					tic[com] = 2;
					turn = 1;
					count2 += 1;
				}
			}
			// �¸� : 0,1,2 / 3,4,5 / 6,7,8 / 0,3,6 / 1,4,7 / 2,5,8 / 0,4,8 / 2,4,6
			// ���º� : 4��, 4�� ������ �ȳ����� ���º�, ���÷��̾ 5�� ��
			// 0 �ϋ� 1,2 / 3,6 / 4,8
			// 6 7 8
			// 3 4 5
			// 0 1 2
			int c1 = 0;
			int c2 = 0;
			for (int i = 0; i < tic.length; i++) { // 0,1,2 / 3,4,5 / 6,7,8 // ����
				if (tic[i] == 1) {
					c1 += 1;
				} else if (tic[i] == 2) {
					c2 += 1;
				} else {
					c1 = 0;
					c2 = 0;
				}
				if (c1 == 3 || c2 == 3) {
					a = 1;
				}
				if (i % 3 == 2) {
					c1 = 0;
					c2 = 0;
				}
			}
			int index1 = 0;
			int index2 = 0;
			for (int i = 0; i < 3; i++) { // 0 3 6 / 1 4 7 / 2 5 8 // ����
				if (tic[i] == 1) {
					index1 = i;
					int c3 = 0;
					if (index1 <= 2) {
						for (int j = index1; j < tic.length; j += 3) {
							if (tic[j] == 1) {
								c3 += 1;
								//System.out.println(c3);
							}
//							else {
//								count2 = 0;
//							}
							if (c3 == 3) {
								b = 1;
							}
						}
					}
				} else if (tic[i] == 2) {
					index2 = i;
					int c4 = 0;
					if (index2 <= 2) {
						for(int j = index2; j < tic.length; j+=3) {
							if(tic[j] == 2) {
								c4 += 1;
							}
							if(c4 == 3) {
								b = 1;
							}
						}

					}
				}
			}
			int c5 = 0;
			int c6 = 0;
			for(int i = 0; i < tic.length; i++) { // 0,4,8 / 2,4,6 // �밢��
				if(tic[i] == 1 && i % 2 == 0) {
					c5 += 1;
				}else if(tic[i] == 2 && i % 2 == 0) {
					c6 += 1;
				}
				if(c5 == 3 || c6 == 3) {
					c = 1;
				}
			}

		}

	}
}
