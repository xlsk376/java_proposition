package ____�ڹ�����8_�����ݺ���;

import java.util.Arrays;

public class �������ݺ���4_����02_��������ġ�� {
	/*
	  	input = {8,4,2,2,4,4,8};	
	  
		 [1] input �� �����͸� ���������� a�� �����Ѵ�.
		 [2] �����ҷ��� ���� �׾��� ���� ���ΰ����� ��ģ��. (��� ��ø����)
		 input = {8,4,2,2,4,4,8}	
		 8  ==> a[] =  {8}
		 4  ==> a[] =  {8,4}
		 2  ==> a[] =  {8,4,2}
		 2  ==> a[] =  {8,4,2,2} ==> {8,4,4} ==> {8,8} ==> {16}
		 4 ==>  a[] =  {16,4} 
		 4  ==> a[] =  {16,4,4} ==> {16,8}
		 8  ==> a[] =  {16,8,8} ==> {16,16} ==> {32}	
	*/	
	public static void main(String[] args) {		
		int [] input = {8,4,2,2,4,4,8};	
		int a[] = new int[input.length];	
		int count = 0;
		for(int i = 0; i < input.length; i++) {
			a[count] = input[i];
			while(true) {
				System.out.println(Arrays.toString(a));
				if(count == 0) {
					break;
				}
				if(a[count] == a[count-1]) {
					System.out.println(count);
					a[count] = 0;
					a[count-1] *= 2;
					count -= 1;
				}else {
					break;
				}		
			}
			count += 1;
		}	
	}
}
