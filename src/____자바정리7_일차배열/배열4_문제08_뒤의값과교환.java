package ____�ڹ�����7_�����迭;

import java.util.Arrays;

/*
	[����]
		�����迭���� �ݺ��� �����������ϴ�  3��°���� �ٷε��� ���� ��ġ�� ��ȯ�� ��� 
		[��]
		��ȯ��  {10,20,30,40,50,60,70,80}; : 30�� 40�� ��ȯ , 60�� 70�� ��ȯ
		��ȯ��  {10,20,40,30,50,70,60,80};
 */
public class �迭4_����08_���ǰ�����ȯ {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60,70,80};	
		int count = 0;
		int index = 0;
		for(int i= 0; i < arr.length; i++) {
			if(count % 3 == 2) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				count = 0;
			}else {
				count += 1;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
	}	
}