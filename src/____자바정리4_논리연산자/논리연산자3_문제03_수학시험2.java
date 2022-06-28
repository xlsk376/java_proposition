package ____자바정리4_논리연산자;
/*
	[문제]
		아래내용을 식으로 작성하고, 답을구하시오.
	[설명]
		철수네 학교의 수학시험은 4점짜리 문제와 5점짜리 문제가 섞여서 출제된다.	
		철수는 20개의 문제를 맞춰서 90점을 받았다. 	
		각각 몇문제씩 맞췄는지 구하시오. 
*/
public class 논리연산자3_문제03_수학시험2 {	
	public static void main(String[] args) {		
		int a = 10;
		int b = 10;		
		System.out.println(a * 4 + b * 5 == 90 && a + b == 20);
	}
}
