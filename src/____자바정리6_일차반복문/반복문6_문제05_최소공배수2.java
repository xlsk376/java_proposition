package ____자바정리6_일차반복문;
/*
	[문제] 
		45와 60과 75의 최소공배수를 구하시오.
	[정답]
		900
*/
public class 반복문6_문제05_최소공배수2 {
	public static void main(String[] args) {
		int i = 45;
		while(true) {
			if(i % 45 == 0 && i % 60 == 0 && i % 75 == 0) {
				System.out.println(i);
				break;
			}
			i += 1;
		}
	}
}
