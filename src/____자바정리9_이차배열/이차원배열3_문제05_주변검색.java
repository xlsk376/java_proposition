package ____�ڹ�����9_�����迭;

import java.util.Arrays;
/* 
		mine = {0,9,0},
			   {9,0,9},
			   {0,0,9}
				  
		�� mine�迭�� ���� 0�� �ڸ��� ���ڸ� �����ҷ����Ѵ�.
		�����Ҽ��ڴ� �ֺ� 8������ �˻��� 9�� ������ ���������.
				
		��) �Ʒ��� ���� ���  
			   {2,9,2},
			   {9,4,9},
			   {1,3,9}

*/
public class �������迭3_����05_�ֺ��˻� {	

	public static void main(String[] args) {
		int mine[][] = {
				{0,9,0},
				{9,0,9},
				{0,0,9}
		};

		for(int i = 0; i < mine.length; i++) {
			for(int j = 0; j < mine[i].length; j++) {
				if(mine[i][j] == 0) {
					int y = i - 1;
					int x = j - 1;
					int count = 0;
					for(int i2 = y; i2 <= y + 2; i2++) {
						for(int j2 = x; j2 <= x + 2; j2++) {
							if(i2 == 0 && j2 == 0) {
								continue;
							}
							if(i2 < 0 || j2 < 0 || i2 >= mine.length || j2 >= mine[i].length) {
								continue;
							}
							if(mine[i2][j2] == 9) {
								count += 1;
							}
						}
					}
					mine[i][j] = count;
				}
			}
		}
		for(int i = 0; i < mine.length; i++) {
			System.out.println(Arrays.toString(mine[i]));
		}
		
		
		
	}
}
