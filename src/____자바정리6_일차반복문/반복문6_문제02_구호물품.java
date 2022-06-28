package ____자바정리6_일차반복문;
/*
	[문제] 
		구호물품으로 소독약 120개와 붕대 72개를 
		환자 한명당 똑같은 양의 소독약과 붕대를 나눠줄려고한다. 
		최대한많은 환자에게 나눠줄때 몇명인지 구하시오.	
	[정답]
		24
*/
public class 반복문6_문제02_구호물품 {
	public static void main(String[] args) {
		int a = 0;
		for(int i = 1; i <= 120; i++) {
			if(120 % i == 0 && 72 % i == 0) {
				//System.out.println(i);
				a = i;
			}
		}
		System.out.println(a);

	}
}
