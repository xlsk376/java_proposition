package ____자바정리6_일차반복문;
/*
	[문제] 
		[1] 숫자 50 ~ 550 사이의 범위에서 7의배수를 순차적으로 검색한다.
		[2] 그중 3번째 7의 배수를 출력한다. 
		
		for를 사용하시오.
*/
public class 반복문5_문제01_for간격배수 {
	public static void main(String[] args) {
		int count = 0;
		
		for(int i = 50; i <= 550; i++) {
			if(i % 7 == 0) {
				count += 1;
				if(count == 3) {
					System.out.println(i);
					break;
				}
			}
		}
		

	}
}
