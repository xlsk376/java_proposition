package ____자바정리6_일차반복문;

import java.util.Random;

public class 반복문0_문제11_추가 {
	public static void main(String[] args) {
		 /*
        랜덤숫자 (1~9) 사이의 숫자  8개를 출력한다. 
        단 아래의 조건을 참고한다. 
        
        예를 들어 숫자가 4 5 6 1 2 3 4 5 이라고 한다면
        아래와 같이 출력한다. 
        
        [출력]
           4 5 6
           5 6 1
           6 1 2
           1 2 3
           2 3 4
           3 4 5 
		*/
		
		Random ran = new Random();
		int a = ran.nextInt(9)+1;
		int b = ran.nextInt(9)+1;
		int c = 0;
		for(int i = 0; i < 6; i++) {
			c = ran.nextInt(9)+1;
				System.out.println(a + " " + b + " " + c);
				a = b;
				b = c;
		}
		
		
		
	
		/*
		반복문을 사용해서 아래와 같이 출력해보세요.
		[예시]
				0 30
				1 29
				2 27
				3 24
				4 20
				5 15
				6 9
				7 2
				8 -6
				9 -15
		 */
//		int a = 30;
//		for(int i = 0; i < 10; i++) {
//			a -= i;
//			System.out.println(i + " " + a);
//		}
		
	}

}