package ____�ڹ�����7_�����迭;
/*
	[�����]	
	ö���� ����� 3�� 3�Ͽ� ������. 		
	ö���� ����� 100�� ����Ͽ� ������Ƽ�� �ҷ����Ѵ�.
	������ 100�ϵڴ�  ��������ΰ�?
	�� ������ ��������ʴ´�.
*/
public class �迭5_����08_����� {
	public static void main(String[] args) {
		int monthList[] =
				{31, 28, 31, 30, 
				 31, 30, 31, 31, 
				 30, 31, 30, 31};		
		int day = 3;
		int month = 3;		
		//1)3�� 3���� �ϼ��ιٲ۴�.
		int total = 0;
		for(int i = 0; i < month-1; i++) {
			total += monthList[i];
		}
		System.out.println(total);
		total += day;
		System.out.println(total);
		total += 100;
		System.out.println(total);	
		int day2 = 0;
		for(int i = 0; i < monthList.length; i++) {
			day2 = total;
			total = total - monthList[i];
			if(total <= 0) {
				System.out.println((i + 1) + "��");
				System.out.println(day2 + "��");
				break;
			}
		}		
	}
}
