package ____�ڹ�����8_�����ݺ���;
import java.util.Arrays;
/*
   [����] arr1 �迭 ���� �����߿��� b�迭�� ���� ������ 
	      b�� arr1�� ���� ��ġ�°���  0���� ����	
	[����] ��ġ�� ���� ������ ������ ���� 0���� ���� 	
	 ��) arr1[] = {0,0,30,40,0};
	 ��) b[] = {0,3,0,0,0,50};	
 */
public class �������ݺ���2_����06_�ߺ����� {

	public static void main(String[] args) {
		int arr1[] = {10,20,30,40,20};
		int b[] = {10,3,20,10,20,50};
		
		for(int i = 0; i < arr1.length; i++) {
			int value = arr1[i];
			for(int j = 0; j < b.length; j++) {
				if(value == b[j]) {
					b[j] = 0; // b �迭�� ���� 0���� ������ ���� arr�� �迭�� �Ǵٽ� ���Ѵ�.
					for(int k = i; k < arr1.length; k++) {
						if(value == arr1[k]) {
							arr1[k] = 0;
						}
					}
				}			
			}					
		}	
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(b));
	}
}
