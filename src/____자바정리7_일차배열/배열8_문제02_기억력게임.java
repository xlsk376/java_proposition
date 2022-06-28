package ____�ڹ�����7_�����迭;

import java.util.Arrays;
import java.util.Random;
/*
	[���� ����]	  
	1. ���� ���ڰ� �����ִ� ī�� 2�徿 5��Ʈ���ִ�. (��10��)
	2. front �� ī�带 ����� ���¸� ���Ѵ�. ������������ʴ´�. 
	3. ���� front �� �����Ѵ�. 
	4. front �� �ִ� ī�� 2���� �����Ѵ�. (���콺�������Ƿ� �ε����� ����)
	5. ������ī�� 2���� ������ ������  back �� �����ؼ� ����� ǥ���Ѵ�. 
	   back�� ��� ���� �� ä������ ������ ����ȴ�. 
	6. ȭ�鿡�� �һ� back �迭�� ����Ѵ�.     
	 [����] ���� �ε��� �����Ҽ�����. 	   
	 ��)
	 [1] �ʱ�ȭ 
	   front = {"a", "a", "b", "b", "c", "c", "d", "d", "e" , "e" };
	   back  = {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-" };
	
	 [2] ���� 
	   front = {"a", "e", "c", "b", "d", "c", "b", "d", "a", "e"};
	
	 [3] �ε��� �Է� 	   
	   1) �ε��� 2�� ==>  0 , 8  ==>front �迭�� �ε��� 0, �� 8 �� ����  a , a �� 
	              ���� ���� �����̹Ƿ� back �� ����
	   	back  =  {"a", "-", "-", "-", "-", "-", "-", "-", "a", "-"};
	   	
	   2) �ε��� 2�� ==>  1 , 2  ==>front �迭�� �ε��� 1, �� 2�� ���� e , c �� 
	              ���� �ٸ������̹Ƿ� �ƹ��Ͼ���
	   	back  =  {"a", "-", "-", "-", "-", "-", "-", "-", "a", "-"};
*/
public class �迭8_����02_���°��� {
	
	public static void main(String[] args) {
		Random ran = new Random();	
		String[] front = {"a", "a", "b", "b", "c", "c", "d", "d", "e" , "e"};
		String[] back = {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"};
		
		for(int i = 0; i < 100; i++) {
			int r1 = ran.nextInt(front.length);
			int r2 = ran.nextInt(front.length);
			String temp = front[r1];
			front[r1] = front[r2];
			front[r2] = temp;
		}
		//System.out.println(Arrays.toString(front));
		int count = front.length/2;
				
		while(true) {			
			System.out.println(Arrays.toString(front));
			System.out.println(Arrays.toString(back));
			if(count == 0) {
				System.out.println("����.");
				break;
			}
			int r1  = ran.nextInt(front.length);
			int r2  = ran.nextInt(front.length);
			
			System.out.println(r1 + " " + r2);
			
			if(back[r1] =="-" && back[r2] == "-" && front[r1] == front[r2] && r1 != r2) {
				back[r1] = front[r1];
				back[r2] = front[r2];
				count -= 1;
			}else {
				System.out.println("����.");
			}
			
		}
		
		
	}
}
