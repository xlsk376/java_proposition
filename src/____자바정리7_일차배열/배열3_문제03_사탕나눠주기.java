package ____자바정리7_일차배열;

import java.util.Arrays;

/*	  
	[사탕나눠주기]
	아래 배열은 각병에 들어있는 사탕의 양이다. 
	사탕의 종류는 전부 다르고 한사람당 한병에서 25개씩 나눠줄려고 하고있다. 
	나눠줄수있는 사람수를 사람수 배열에 저장하시오.
	나눠주고 남은사탕은 나머지 배열에 순차적으로 저장하시오.
	예) 
 	사탕	 	{80, 53, 36, 22};
 	사람수	{3, 2, 1, 0};   
 	나머지 	{5, 3, 11, 22};
*/
public class 배열3_문제03_사탕나눠주기 {	
	public static void main(String[] args) {
		int 사탕[] = {80, 53, 36, 22};	// 각종류의 사탕수 
		int 사람수[] = {0, 0, 0, 0};		
		int 나머지[] = {0, 0, 0, 0};	
		
		for(int i = 0; i< 4; i++) {
			사람수[i] = 사탕[i] / 25;
			나머지[i] = 사탕[i] % 25;
		}
		System.out.println(Arrays.toString(사탕));
		System.out.println(Arrays.toString(사람수));
		System.out.println(Arrays.toString(나머지));
		
		
	}
}
