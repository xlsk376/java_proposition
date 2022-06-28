package ____자바정리6_일차반복문;

import java.util.Random;

public class 반복문0_문제13_추가 {
	public static void main(String[] args) {
		/*	
	 	숫자를 0~4까지 순차적으로 출력한다. 
	 	아래조건을 참고한다.
	 	[조건1] 랜덤으로 0~4의 숫자를 하나저장하고 그숫자에는 출력하지않고 공백으로 출력한다.
	 	[조건2] 위 숫자를 순차적으로 출력하기때문에 공백일떄는 숫자가 증가하지않는다.
	 	
	 	[예시1] 
	 		랜덤숫자가 2라고 가정할때  
	 		[결과] 01 23 
	 	
		[예시2] 
			랜덤숫자가 3라고 가정할때  
	 		[결과] 012 3 
		*/
		Random ran = new Random();
		int n = ran.nextInt(5);
		System.out.println("n : "+n);
		for(int i = 0; i < 5; i++) {
			if(n == i ) {
				System.out.print(" ");
			}else {
				System.out.print(i + " ");
			}
		}
		
		
		
	}
}
