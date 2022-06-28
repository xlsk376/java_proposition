package ____자바정리6_일차반복문;
/*
	[문제] 
		사탕 62개와 초콜릿 88개를 각각 남김없이 똑같이 최대한 
		많은 학생에게 나눠줄려고 할때, 학생수를 구하시오.
		단, 사탕은 2개가 남고 초콜릿은 4개가남는다.
	[정답]
		학생 : 12
		사탕 : 5
		초컬릿 : 7
*/
public class 반복문6_문제04_사탕2 {
	public static void main(String[] args) {
		int 전체사탕 = 62;
		int 전체초컬릿 = 88;
		int 학생 = 0;
		for(int i = 1; i <= 전체사탕; i++) {
			if(전체사탕 % i == 2 && 전체초컬릿 % i == 4) {
				학생 = i;
			}
		}
		System.out.println("학생 : " + 학생);
		System.out.println("사탕 : " + 전체사탕 / 학생);
		System.out.println("초컬릿 : " + 전체초컬릿 / 학생);
	}
}
