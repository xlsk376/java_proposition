package ____�ڹ�����8_�����ݺ���;

import java.util.Arrays;
import java.util.Random;
/*
  [max����]
  
  1. ���� ū ���� ã�� �Է��Ѵ�.
  2. �����̸� �ش� ���� 0���� �����Ѵ�.
  3. arr�迭�� ��� ���� 0���� ����Ǹ� ���α׷��� ����ȴ�.
  ��)
  11, 87, 42, 100, 24
  �Է� : 100
  
  11, 87, 42, 0, 24
  �Է� : 87
  
  11, 0, 42, 0, 24
  �Է� : 24 ==> �ִ밪�� �ƴϹǷ� �ƹ��ϾȻ���
 */
public class �������ݺ���3_����03_�ƽ����� {
	public static void main(String[] args) {
		
		int[] arr = {11, 87, 42, 100, 24};
		Random ran = new Random();
		int count = arr.length;
		while(true) {
			System.out.println("--------------------------");
			System.out.println(Arrays.toString(arr));		
			if(count == 0) { // ���������� ��µǰ� �ݺ��� ����
				break;
			}			
			int r = ran.nextInt(arr.length);
			int max = 0; // max ���� �Ź� �ʱ�ȭ ����
			for(int i = 0; i < arr.length; i++) {
				if(max < arr[i]) {
					max = arr[i];
				}
			}			
			if(arr[r] == max) {
				arr[r] = 0; // �ε����� ���� �������� �ʰ� �ƽ� ���� �Է��� �ε����� ����ִ� ���� ������ �ε����� ���� �ʱ�ȭ �Ѵ�.
				System.out.println(r + " : " + max + " : ����. ");
				count -= 1;
			}else {
				System.out.println(r + " : " + arr[r] + " : ����ū���� �ƴմϴ�. ");
			}		
		}		
	}
}
