package ____�ڹ�����7_�����迭;

import java.util.Arrays;
import java.util.Random;

public class �迭0_����09_�߰� {

	public static void main(String[] args) {
		/*
	 	�������� sample �迭�� ���� �ϳ� �����Ѵ�. 
	 	�װ��� arr �迭�� ��簪�� ���Ѵ�.
	 	�迭�� �װ��� ������ arr�迭�� ��簪�� �ڷιа� �Ǿտ� ��������� 
	 	������ "�̹������մϴ�" ��� 
	 	[����]
	 		r = 3 ==> sample[r] = 40 //  arr = {40,10,20,0,0};
	 		r = 0 ==> sample[r] = 10 //  "�̹������մϴ�"
		*/
		int arr[] = {10,20,0,0,0};
		int sample [] = {10,20,30,40,50};
		
		Random ran = new Random();
		int r = ran.nextInt(sample.length);
		System.out.println("r :" + sample[r]);
		int count = 2;
		int index = 0;
		boolean check = false;
		for(int i = 0; i < sample.length; i++) {
			if(arr[i] == sample[r]) {
				check = true;
				index = i;
				break;
			}
		}
		if(check == false) {
			int index2 = count;
			for(int i = 0; i < count; i++) { // ���� ���ð��� �ε�����ȣ�� �ʱⰪ���� ����
				arr[index2] = arr[index2-1];
				index2 -= 1;
			}
			arr[0] = sample[r];
			System.out.println(Arrays.toString(arr));
		}else {
			System.out.println("�̹�����" + arr[index]);
			System.out.println(Arrays.toString(arr));
		}
		
		
		
	}
}
