package ____자바정리6_일차반복문;

import java.util.Random;

public class 반복문0_문제09_추가 {
	public static void main(String[] args) {
		/*
		 * 랜덤으로 count변수에  4~8사이의 숫자를 저장한다. 
		 * count 변수의 숫자는 문제만들기의 숫자개수이다. 
		 * count 변수의 숫자만큼 더하기 문제를 만들면된다. 
		 * 단, 더하기 문제를 만들때숫자는 1~9사이의 랜덤숫자이며, 전부 짝수여야한다. 
		 * [출력] 뒤의 내용과 똑같이 만들면된다. 단, 숫자는 랜덤이므로 변경될수있다. 
		 	
		 	[예시]
					랜덤으로 4~8사이의 숫자를 입력하세요.
					5
					[출력] 4 + 6 + 4 + 2 + 8 = 
		 */
		
		Random ran = new Random();
		int count = ran.nextInt(5)+4;
		System.out.println(count);
		while(true) {
			int r = ran.nextInt(9)+1;
			if(r % 2 == 0) {
				System.out.print(r);
				count -= 1;
				if(count >= 1) {
					System.out.print(" + ");
				}
			}
			if(count == 0) {
				System.out.println(" = ");
				break;
			}
		}
	
	}
}
