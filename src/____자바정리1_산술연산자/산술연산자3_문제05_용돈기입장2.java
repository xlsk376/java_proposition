package ____자바정리1_산술연산자;
/*
	[문제]  
		철수는 용돈기입장을 작성하고 있다. 
		지난달에는 600원을 저축했고,
		이번 달에 받은 용돈 1000원을 저축했다.
		오늘 과자를 3개 구입했더니 현재 남은 돈은 100원이다.
		과자 1개의 가격은 얼마인지 구하시오.  
	[정답] 
		500	
 */
public class 산술연산자3_문제05_용돈기입장2 {
	public static void main(String[] args) {
		System.out.printf("%d", (600 + 1000 - 100) / 3);
	}
}
