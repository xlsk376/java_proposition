package ____�ڹ�����8_�����ݺ���;

import java.util.Arrays;

public class �������ݺ���4_����06_��ǲ�߰����� {
	/*
		1) array �迭�� ������3�̴�.		
		2) input �迭 ���� ������  �߰��� ������ �ݺ��� �����̴�.		
		3) ¦���ε����� ���� "�߰�" �̰�, 
		4) Ȧ���ε����� ���� "����" �̴�. 
		   [����] �������ڸ��� �ڿ������� ������ �о�� 0���� ǥ�� �Ѵ�. 	
		5) �ߺ��Ȱ��� "�߰�" �Ҽ����� , ���°��� "����"�Ҽ�����.
		6) input�� ������ ���� ó���ϰ� ó��������� 		
		��)
		 10 ==> ¦���ε����̹Ƿ� �߰� ==> array[] = {10,0,0};
		 20 ==> Ȧ���ε����̹Ƿ� ���� ==> 20�� �����Ƿ� ==> "�����Ұ��� �����ϴ�"
		 30 ==> ¦���ε����̹Ƿ� �߰� ==> array[] = {10,30,0};
		 10 ==> Ȧ���ε����̹Ƿ� ���� ==> array[] = {30,0,0};
		 30 ==> ¦���ε����̹Ƿ� �߰� ==> 30 ���̹� ����Ǿ ==> "�ߺ��˴ϴ�"
		 30 ==> Ȧ���ε����̹Ƿ� ���� ==> array[] = {0,0,0};
	*/
	public static void main(String[] args) {
		
		int array[] = {0,0,0};
		int count = 0;
			
		int input[] = {10,20,30,10,30,30};		
		
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " : ");
			if(i % 2 == 0) {
				boolean check = false;
				for(int j = 0; j < count; j++) {
					if(input[i] == array[j]) {
						check = true;
						break;
					}
				}
				if(check == false) {
					array[count] = input[i];
					count += 1;
					System.out.println("�߰�");
				}else {
					System.out.println("�ߺ�");
				}			
			}else {
				boolean check = false;
				for(int j = 0; j < count; j++) {
					if(input[i] == array[j]) {
						check = true;
						break;
					}
				}
				if(check == false) {
					System.out.println("��������");
				}else {
					for(int j = 0; j < count -1; j++) {
						array[j] = array[j + 1];
					}
					array[count - 1] = 0;
					count -= 1;
				}
				
			}
			System.out.println(Arrays.toString(array));
			
		}
		
		
	}

}
