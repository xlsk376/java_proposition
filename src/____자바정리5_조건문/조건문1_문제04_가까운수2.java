package ____자바정리5_조건문;
/*
	[문제]		
		a 와 c 중 어떤숫자가 b 와 더가까운지 출력하시오. 
	[예]
		a 가 더 가깝다.
		c 가 더 가깝다.
		a 와 c 가 똑같다. 
*/
public class 조건문1_문제04_가까운수2 {
	public static void main(String[] args) {		
		int a = 96;
		int b = 100;
		int c = 102;		
		int a2 = b - a;
		int c2 = c - b;		
		if(a2 == c2) {
			System.out.println(a + " " + c);
		}
		if(a2 < c2) {
			System.out.println(a);
		}
		if(a2 > c2) {
			System.out.println(c);
		}
	}
}
