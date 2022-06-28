package ____자바정리8_이차반복문;
import java.util.Arrays;
/*
   [문제] arr1 배열 안의 값들중에서 b배열의 값이 있으면 
	      b와 arr1의 각각 겹치는값을  0으로 변경	
	[조건] 겹치는 값이 여러개 있으면 전부 0으로 변경 	
	 예) arr1[] = {0,0,30,40,0};
	 예) b[] = {0,3,0,0,0,50};	
 */
public class 이차원반복문2_문제06_중복제거 {

	public static void main(String[] args) {
		int arr1[] = {10,20,30,40,20};
		int b[] = {10,3,20,10,20,50};
		
		for(int i = 0; i < arr1.length; i++) {
			int value = arr1[i];
			for(int j = 0; j < b.length; j++) {
				if(value == b[j]) {
					b[j] = 0; // b 배열의 값을 0으로 변경한 값과 arr의 배열을 또다시 비교한다.
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
