package ____자바정리6_일차반복문;
/*
	[문제]
		철수는 13살 철수의 아버지는 45살이다. 
		몇년후에 철수의 아버지는 철수나이의 3배가되는지 구하시오.
	[답]
		기간 : 3
*/
public class 반복문4_문제02_나이 {
	public static void main(String[] args) {		
		int 철수 = 13;
		int 아버지 = 45;
		int 기간 = 0;
		while(true) {
			if(철수*3 == 아버지) {
				System.out.println("철수 : " + 철수 );
				System.out.println("아버지 : " + 아버지 );
				System.out.println("기간 : " + 기간);
				break;
			}
			철수 += 1;
			아버지 += 1;
			기간 += 1;
		}
	}
}
