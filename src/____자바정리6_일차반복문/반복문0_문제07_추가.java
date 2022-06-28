package ____자바정리6_일차반복문;

import java.util.Random;

public class 반복문0_문제07_추가 {
	public static void main(String[] args) {
		/*
		 * 랜덤으로 1~5 를 입력받고, 
		 * 랜덤숫자의 개수 만큼 숫자를 더하는 문제를 만들어 출력하시오..
		 * 단 더하기할 숫자들은 1~9사이의 랜덤숫자여야한다. 
		 * 아래 [출력] 뒤에 나오는 모양과 똑같은 모양으로 출력한다. 
		 * (단, 숫자는 랜덤이므로 숫자는 다르게 나올수있다,)
		 * 
		 * [예시1]
		 * 		랜덤숫자 1~5를 입력하시오.
		 * 		3
		 * 		[출력] 5 + 3 + 2 = 
		 * 
		 * [예시2]
		 * 		랜덤숫자 1~5를 입력하시오.
		 * 		5
		 * 		[출력] 6 + 5 + 2 + 7 + 8 = 
		 */
		
		Random ran = new Random();
		int r = ran.nextInt(5)+1;
		System.out.println("r : " + r);
		for(int i = 0; i < r; i++) {
			int r1 = ran.nextInt(9)+1;
			System.out.print(r1);
			if(i < r-1) {
				System.out.print(" + ");
			}
		}
		System.out.println(" = ");
	
	}
}
