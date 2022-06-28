package ____자바정리8_이차반복문;

import java.util.Arrays;

public class 이차원반복문4_문제02_같은수합치기 {
	/*
	  	input = {8,4,2,2,4,4,8};	
	  
		 [1] input 의 데이터를 순차적으로 a에 저장한다.
		 [2] 저장할려는 수와 그앞의 수가 서로같으면 합친다. (계속 중첩적용)
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
