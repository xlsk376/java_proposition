package ____자바정리7_일차배열;

import java.util.Arrays;

/*
	아래배열들을 반으로 나누고 서로 같은모양인지 판별하시오.	
	같은모양이면 true , 다른모양이면 false 출력
	[예시]
		154451 은 절반으로 나누면 서로 같은모양이다.
		154751 은 절반으로 나누면 서로 다른모양이다.
 */
public class 배열4_문제05_앞뒤가같은수 {	
	public static void main(String[] args) {
		int arr1[] = {1,5,4,4,5,1};	
		int arr2[] = {1,5,4,7,5,1};
		
		int index = arr1.length-1;
		boolean check = false;
		for(int i = 0; i < arr1.length/2; i++) {
			if(arr2[i] != arr2[index]) {
				check = true;
				break;
			}
			index -= 1;
		}
		if(check == true) {
			System.out.println(Arrays.toString(arr2));
			System.out.println("다른 모양");
		}else {
			System.out.println(Arrays.toString(arr1));
			System.out.println("같은 모양");
		}
		
		
		
	}
}
