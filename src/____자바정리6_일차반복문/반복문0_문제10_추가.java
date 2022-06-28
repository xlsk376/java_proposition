package ____자바정리6_일차반복문;

public class 반복문0_문제10_추가 {
	public static void main(String[] args) {
		/*
		반복문을 사용해서 아래와 같이 출력해보세요.
		[예시]
			0 1 2
			1 2 3
			2 3 4
			3 4 5
			4 5 6
		*/
		
//		for(int i = 0; i < 5; i++) {
//			System.out.println(i + " " + (i+1) + " " + (i+2));
//		}
		
	
		/*
		반복문을 사용해서 아래와 같이 출력해보세요.
		[예시]
				0 0 1
				1 2 3
				2 4 5
				3 6 7
				4 8 9
		*/
//		int a = 1;
//		for(int i = 0; i < 5; i++) {
//			System.out.println(i + " "+ (i*2) +" " + (a));
//			a += 2;
//		}
		
		/*
		반복문을 사용해서 아래와 같이 출력해보세요.
		[예시]
				0 0
				1 1
				2 3
				3 6
				4 10
				5 15
				6 21
				7 28
				8 36
				9 45
		*/
		int a = 0;
		for(int i = 0; i < 10; i++) {
			a += i;
			System.out.println(i + " "+ a);
		}
		
		
	}
}
