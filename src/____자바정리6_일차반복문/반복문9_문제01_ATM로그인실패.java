package ____�ڹ�����6_�����ݺ���;

import java.util.Scanner;
/*
	[ATM�α��ν���]
		[1] [1.�α���]  ���� ���ο�Ŵ� ��� : [1.�ܾ�Ȯ��] [2.�α׾ƿ�]
		[2] �α����� 3�����н� �������� ��Ű�ÿ�. 		
*/
public class �ݺ���9_����01_ATM�α��ν��� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String id1 = "qwer";
		String pw1 = "1234";
		int money1 = 10000;
		String id2 = "asdf";
		String pw2 = "2345";
		int money2 = 20000;
		String log = "";
		boolean run = true;
		while (run == true) {
			System.out.println("==[ATM]==");
			System.out.println("[1.�α���] [2.����]");
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			if (sel == 1) {			
				System.out.println("[�α���] ���̵��Է� : ");
				String id = scan.next();
				System.out.println("[�α���] ��й�ȣ�Է� : ");
				String pw = scan.next();
				if(id.equals(id1) && pw.equals(pw1)) {				
					System.out.println(id1 +"���� �α����մϴ�");
					log = id1;
				}else if(id.equals(id2) && pw.equals(pw2)) {
					System.out.println(id2 +"���� �α����մϴ�");
					log = id2;
				}else {
					System.out.println("���̵�� ��й�ȣ�� Ȯ���ϼ���.");
				}	
				while(log.equals("") == false) {
					System.out.println(log + "�� �α�����");
					System.out.println("[1.�ܾ�Ȯ��] [2.�α׾ƿ�]");
					System.out.print("�޴� ���� : ");
					int sel2 = scan.nextInt();
					if(sel2 == 1) {
						if(log.equals(id1)) {
							System.out.println(log + "�� �ܾ� : " + money1);							
						}
						else if(log.equals(id2)) {
							System.out.println(log + "�� �ܾ� : " + money2);	
						}
					}else if(sel2 == 2) {	
						System.out.println("�α׾ƿ��մϴ�.");
						log = "";
					}
				}						
			} else if (sel == 2) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}
		scan.close();
	}
}
