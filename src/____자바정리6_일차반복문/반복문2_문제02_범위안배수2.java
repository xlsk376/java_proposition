package ____자바정리6_일차반복문;
/*
	[문제]
		[1] 1~150 까지의 18의 배수를 전부 출력한다.
		[2] 50 ~ 100의 사이에는 18배수는 숫자대신 "배수" 출력  
	[정답]
		18 36 배수 배수 배수 108 126 144 
 */
public class 반복문2_문제02_범위안배수2 {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 150) {
			if(i % 18 == 0) {
				if(i >= 50 && i <= 100 ) {
					System.out.print("배수 ");
				}else {
					System.out.print(i + " ");					
				}
			}
			i = i + 1;
		}
	}
}
