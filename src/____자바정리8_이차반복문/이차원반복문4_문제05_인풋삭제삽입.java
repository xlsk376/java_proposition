package ____�ڹ�����8_�����ݺ���;

import java.util.Arrays;

public class �������ݺ���4_����05_��ǲ�������� {
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		
		String  keyword[] = {"����","����","����","����"};
		int indexList[] = {2,1,0,3};
		int valueList[] = {60,70,80,90};
		
		for(int i = 0; i < indexList.length; i++) {
			int index = arr.length-1;
			for(int j = indexList[i]; j < arr.length-1; j++) {
				arr[index] = arr[index-1];
				index -= 1;
			}
			arr[indexList[i]] = valueList[i];
			System.out.println(Arrays.toString(arr));
		}
		
	
	}
}
