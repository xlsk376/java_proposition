package ____�ڹ�����8_�����ݺ���;
import java.util.Arrays;
import java.util.Random;
/*
	�Ʒ��迭�� �������� 1~10 �����Ǽ���  3���� �����Ѵ�.
	[����]
		��, 3���� ������ ���� �ݵ�� 20�̿����ϸ�, �Ȱ��� ���ڴ� ������Ѵ�. 
		��ġ�� �������. 
		[��] 1,10,9
		[��] 9,10,1
	
 */
public class �������ݺ���2_����04_��20 {
	public static void main(String[] args) {	
		int arr[] = new int[3];
		Random ran = new Random();
		while(true) {		
			int total = 0; // �ʱ�ȭ
			for(int i = 0; i < arr.length; i++) {
				int r = ran.nextInt(10) + 1;
				total += r;
				arr[i] = r; 
			}
			boolean check = false;
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr.length; j++) {
					if( i != j && arr[i] == arr[j]) {
						check = true;
					}
				}
			}		
			if(check == false && total == 20 ) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
