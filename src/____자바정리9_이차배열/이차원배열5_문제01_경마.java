package ____�ڹ�����9_�����迭;

import java.util.Arrays;
import java.util.Random;
/*
[�渶 ����]
[1] 5 * 20 �� �迭�� �ִ�.
[2] �� ���� ���� �޸� Ʈ���� �ǹ��Ѵ�.
[3] �� �ϴ� �������� 1~4ĭ�� �Ÿ��� �̵��Ҽ��ִ�.
[4] ���� ���� �����ϸ� ������ ������. �������� ������ ����Ѵ�. 
[5] ��, ���� ���ÿ� �����ϸ� ����� ����. 
*/
public class �������迭5_����01_�渶 {
	
	public static void main(String[] args) {
		
		int size = 5;
		int len = 20;
		int map[][] = new int[size][len];
		int total[] = new int[size];
		Random ran = new Random();		
		for(int i = 0; i < len; i++) {			
			for(int j = 0; j < size; j++) {
				int r = ran.nextInt(4) + 1;
				if(total[j] < 20) {
					map[j][i] = r;
					total[j] += r;
				}	
			}	
		}
		for(int i = 0; i < size; i++) {
			System.out.println(Arrays.toString(map[i]));
		}
		
		//��� 
		total = new int[size];
		int show[][] = new int[size][len];
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < size; j++) {

				if(total[j] < 20) {
					show[j][total[j]] = 0;
				}
				total[j] += map[j][i];
				
				if(total[j] < 20) {
					show[j][total[j]] = 1;
				}else {
					show[j][len-1] = 1;
				}
				
			}
			System.out.println("---------------------------------------------------------------------------");
			for(int x = 0; x < size; x++) {
				for(int y = 0; y < len; y++) {
					if(show[x][y] == 1) {
						System.out.print("[" + (x + 1) + "]");
					}else {
						System.out.print("[ ]");
					}
				}
				System.out.println();
			}
			boolean check = false;
			for(int j = 0; j < size; j++) {
				if(total[j] < len-1) {
					check = true;
					break;
				}
			}
			if(check == false) {
				break;
			}						
		}				
	}
}
