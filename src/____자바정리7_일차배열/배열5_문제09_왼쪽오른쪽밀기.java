package ____자바정리7_일차배열;

import java.util.Arrays;
/*
	[왼쪽오른쪽]
	랜덤으로 숫자(1,2)를 저장하고
	숫자가 1이면 왼쪽으로 밀기
	숫자가 2이면 오른쪽으로 밀기
 	예) 1) left ==> arr = {2,3,4,5,0,0,0,0,0};
 	예) 2) right ==> arr = {0,0,0,0,0,2,3,4,5};
*/
public class 배열5_문제09_왼쪽오른쪽밀기 {
	public static void main(String[] args) {
		int arr[] = {0,2,0,3,4,0,0,5,0};			
		int select = 2;
		int index = arr.length - 1;
		System.out.println(index);
		int index2 = index;
		if(select == 2) {
			for(int i = 0; i < arr.length; i++) {
				if(arr[index] != 0) {
					int temp = arr[index];
					arr[index] = arr[index2];
					arr[index2] = temp;
					index2 -= 1;
				}
				index -= 1;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
