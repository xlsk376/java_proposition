package ____�ڹ�����6_�����ݺ���;
import java.util.Random;
import java.util.Scanner;
/*
	[īī�� �ý�]
		1. �մ��� �¿� ���������� �̵��ϴ� �����̴�.
		2. -10~10 ������ ���� ���� 2���� ������ �������� �����Ѵ�.
		3. �޴��� �Ʒ��� ����.
				1) �ӵ����� : 1~3������ ����
				2) ���⼳�� : ��(1)��(2)��(3)��(4)
				3) �̵��ϱ� : ������ �������� ������ �ӵ���ŭ �̵�
		4. �Ÿ� 1ĭ �� 50���� �߰��Ǿ� ������ ��ݵ� ����Ѵ�.
		5. �����ϸ� �ٽ� -10 ~ 10 ������ ���� �������� �����ȴ�.
*/
public class �ݺ���9_����02_�ýð��� {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int dir = 0;
		int x = 0;
		int y = 0;
		int dx = 0;
		int dy = 0;
		int speed = 0;
		int money = 0;
		int total = 0;
		dx = ran.nextInt(21) - 10; // -10 ~ 10 ==> 21
		dy = ran.nextInt(21) - 10; 
		while(true) {
			System.out.println("[������] : x : " + dx + " y : " + dy);
			System.out.println("[������ġ] : x : " + x + " y : " + y);
			System.out.println("[����] : " + dir + " [�ӵ�] : " + speed);
			System.out.println("[������] : " + money + " [��ü����] : " + total);
			System.out.println("[1.�ӵ�] [2.����] [3.�̵�] [0.����]");
			int sel = scan.nextInt();
			if(sel == 0) {
				break;
			}else if(sel == 1) {
				System.out.println("�ӵ��� �Է��ϼ��� : ");
				speed = scan.nextInt();
				if(speed < 1 || speed > 3) {
					speed = 1;
				}
			}else if(sel == 2) {
				System.out.println("������ �Է��ϼ��� [1.��][2.��][3.��][4.��]");
				dir = scan.nextInt();
				if(dir < 1 || dir > 4) {
					dir = 1;
				}
			}else if(sel == 3) {
				if(dir == 1) {
					y += speed;
				}else if(dir ==2) {
					x += speed;
				}else if(dir == 3) {
					y -= speed;
				}else if(dir == 4) {
					x -= speed;
				}
				money += speed;
			}else {
				System.out.println("����");
			}
			
			if(dx == x && dy == y) {
				total += money;
				money = 0;
				dx = ran.nextInt(21) - 10; // -10 ~ 10 ==> 21
				dy = ran.nextInt(21) - 10; 
			}
		}
		scan.close();
	}
}
