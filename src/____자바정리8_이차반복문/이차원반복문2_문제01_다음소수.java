package ____자바정리8_이차반복문;

import java.util.Scanner;

public class 이차원반복문2_문제01_다음소수 {
	/*
	 *  [다음 소수 찾기]
	 * 1. 숫자를 한 개 입력받는다.
	 * 2. 입력받은 숫자보다 큰 첫 번째 소수를 출력한다.
	 * 
	 * 예) Enter Number ? 1000
	 *    1000보다 큰 첫번재 소수는 1009
	 * 예) Enter Number ? 500
	 *    500보다 큰 첫번째 소수는 503
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number ? ");
		int number = scan.nextInt();
		
		while(true) {
			int count = 0;
			for(int i = 1; i <= number; i++) {
				if(number % i == 0) {
					count += 1;
				}
			}
			if(count == 2) {
				System.out.println("소수 : " + number);
				break;
			}else {
				number += 1;
			}
		}
		
		// 입력한 소수보다 바로 큰 첫번째 소수를 찾는것, 1000이 입력되어 소수가 아니라면 number를 +1 해주고 count = 0 으로 바꿔준다.
		// 소수의 개수 2가 나올때까지 반복해서 돌려준다.
		

	}
}
