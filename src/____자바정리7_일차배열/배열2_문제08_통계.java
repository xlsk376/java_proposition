package ____�ڹ�����7_�����迭;
import java.util.Arrays;
import java.util.Random;
/*
	[����1] array �迭�� 1~100�� ������ ���� ������ 5�� �����ϰ� ���
	[����]    
		[87, 11, 92, 14, 47]
	
	[����2] �������� ������ ��� ��� (����� �Ҽ��� 2�ڸ��������)
	[����]    
		���� : 251
		��� : 50.2
	
	[����3] ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
	[����]   
		2
*/
public class �迭2_����08_��� {
	public static void main(String[] args) {
		Random ran = new Random();
		int[] array = new int[5];		
		for(int i = 0; i < 5; i++) {
			int r = ran.nextInt(100) + 1;
			array[i] = r;
		}
		System.out.println(Arrays.toString(array));
		int total = 0;
		double ��� = 0;
		for(int i = 0; i < 5; i++) {
			total = total +  array[i];
		}
		��� = total / 5.0;
		System.out.println("�� : " + total);
		System.out.printf("��� : %.2f" , ���);
		System.out.println();
		int count = 0;
		for(int i = 0; i < 5; i++) {
			if(array[i] >= 60) {
				count += 1;
			}
		}	
		System.out.println("�հݻ��� : " + count);
	}

}
