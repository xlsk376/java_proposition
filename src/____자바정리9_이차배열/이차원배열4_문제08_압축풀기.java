package ____�ڹ�����9_�����迭;

import java.util.Arrays;
/*
array[][] = {3,2},{5,6},{2,1},{4,3}
 �� �����ʹ� ������ �������̴�.
 ���������� ��Ģ�� 2���� ¦�� �̷��.
  1) ���� ���� ==> ������ 
  2) ���� ���� ==> �����̴�.
 ��) {3,2} ==> 33
 ��) {5,6} ==> 555555
 ��) {2,1} ==> 2
 ��) {4,3} ==> 444
	 ���� �����ʹ� 335555552444 �ΰ��̴�. 
 ����) �������ͻ����ŭ �迭�� ����� ������ ���� ������ ��� 
 ��) temp = {3,3,5,5,5,5,5,5,2,4,4,4}
*/	
public class �������迭4_����08_����Ǯ�� {			
	
	public static void main(String[] args) {
		int array[][] = {
				{3,2},{5,6},{2,1},{4,3}
			};
		int [] temp;
		
		int size = 0;
		for(int i = 0; i < array.length; i++) {
			size += array[i][1];
		}
		System.out.println(size);
		
		temp = new int[size];
		int index = 0;
		
		for(int i = 0; i < array.length; i++) {
			int num = array[i][0];			
			for(int j = 0; j < array[i][1]; j++) {
				temp[index] = num;
				index += 1;
			}
		}
		
		System.out.println(Arrays.toString(temp));
		
	}
}
