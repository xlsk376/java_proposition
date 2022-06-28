package ____자바정리6_일차반복문;
/*
	[문제] 
		45와 60과 75의 최대공약수를 구하시오.
	[정답]
		15
*/
public class 반복문6_문제01_최대공약수 {
	public static void main(String[] args) {
		int a = 0;
		for(int i = 1; i <= 75; i++) {
			if(45 % i == 0 && 60 % i == 0 && 75 % i == 0) {
				//System.out.println(i);
				a = i;
			}
		}
		System.out.println(a);
	}
}
