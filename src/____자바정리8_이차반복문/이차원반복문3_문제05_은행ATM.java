package ____�ڹ�����8_�����ݺ���;

import java.util.Arrays;
import java.util.Scanner;
/*
 �� [ATM] 
  
  	-��ü ��ɱ���
	[1] �⺻�޴� ��� : [1.ȸ������][2.�α���][3.����]
	[2] �α��� ������ ���ο�Ŵ� ��� : [1.�۱�][2.�ܾ���ȸ][3.�α׾ƿ�]
	[3] �����ڷα��� : �α��ν� admin , admin ���� �α����ϸ� ���ο�Ŵ� ��� :
		[1.ȸ����ü���][2.�α׾ƿ�]
 */

// ���ڿ� ������ �ٽ� �ۼ��ϱ�

public class �������ݺ���3_����05_����ATM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int MAX = 5;	
		String[] idList = new String[MAX];
		String[] pwList = new String[MAX];
		int[] moneyList = new int[MAX];
		//int idList[] = new int[MAX];
		
		int count = 0;
		String log = "";
		
		while(true) {
			System.out.println("[1.ȸ������][2.�α���][3.����]");
			int sel = scan.nextInt();
			if(sel == 1) { // ȸ������
				if(count == 5) {
					System.out.println("������");
				}else {
					System.out.println("������ ���̵� �Է�");
					String id = scan.next();
					boolean check = false;
					for(int i = 0; i < idList.length; i++) {
						if(id.equals(idList[i])) {
							check = true;
							break;
						}
					}
					if(check == true) {
						System.out.println("���̵� �ߺ�");
					}else {
						idList[count] = id;
						count += 1;
					}
					
				}
			}else if(sel == 2) { // �α���
				
			}else if(sel == 3) { // ����
				break;
			}else if(sel == 4) { // ��ȸ
				  System.out.println(Arrays.toString(idList));
				 //System.out.println(Arrays.toString(pwList));
			}
		}
		
		
	}
}
