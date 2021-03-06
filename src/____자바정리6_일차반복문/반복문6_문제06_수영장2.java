package ____자바정리6_일차반복문;
/*
	[문제]
	   	철수와 민수는 같은 수영장에 다닌다
	   	철수는 4일마다 한번씩 가고 민수는 5일만다 한번씩 간다.	   	
	   	철수와 민수가 2월 3일날 처음만났다면 다음에 만나는 날은 언제인지 구하시오.
	[정답]
	 	다음에 만나는 날 : 2월 23일
 */
public class 반복문6_문제06_수영장2 {
	public static void main(String[] args) {
		int 철수 = 4;
		int 민수 = 5;
		int i = 철수;
		int day = 0;
		while(true) {
			if(i % 철수 == 0 && i % 민수 == 0) {
				day = i;
				break;
			}
			i += 1;
		}
		day += 3;
		System.out.println("다음에 만나는 날 : 2월 " + day + "일");
	}
}
