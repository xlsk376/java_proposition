package ____�ڹ�����9_�����迭;

import java.util.Arrays;
/*
nameList �迭�� ��ǰ�̸�����Ʈ , 
dataList 2�����迭�� ���� ���� , ��ǰ���� ����Ʈ����̴� .		
��) ���� ���� ������� 3�� , ���ڱ� 1�� , ���� 1�� �ִ�.			
�Ʒ� �迭�� ���� �ֹ��� ���¼����̴�.
�Ѹ����� ����غ�����.	


��) ù��° 1 ==> ���ڱ��� ������ 1�̹Ƿ� �Ǹ��Ҽ��ִ�.
��) �ι�° 2 ==> ������ ������ 1�̹Ƿ� �Ǹ��Ҽ��ִ�.
��) ����° 2 ==> ������ ������ �̹� �ι�°���� �����ؼ� 0�̵ǹǷ� �ǸźҰ�.
  ....
  .... 		
�ֹ��� ��  ����� 2�� , ���ڱ� 3�� , ���� 3�� �������� ,
���� �Ǹ��� ǰ����  ����� 2�� , ���ڱ� 1�� , ���� 1�� �̴�.
*/
public class �������迭4_����04_��ǲ���� {

	public static void main(String[] args) {
		
		String titleList[] = {"�����" , "���ڱ�" , "����"};
		int dataList[][] = {
				{1000, 3},
				{2300, 1},
				{3100, 1}
		};
		int [] input = {1,2,2,0,0,2,1,1};	
		int price = 0;
		for(int i = 0; i < input.length; i++) {
			int index = input[i];
			if(dataList[index][1] > 0) {
				
				System.out.print(titleList[index] + " �Ǹ� : ");
				System.out.println(dataList[index][0]);
				dataList[index][1] -= 1;
				
				price += dataList[index][0];
			}else {
				System.out.print(titleList[index] + " ");
				System.out.println("������");
			}
		}
		for(int i = 0; i < dataList.length; i++) {
			System.out.println(Arrays.toString(dataList[i]));
		}
		
		
		System.out.println(price);
	}
}
