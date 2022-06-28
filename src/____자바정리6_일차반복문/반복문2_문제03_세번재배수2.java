package ____자바정리6_일차반복문;
/*
	[문제] 
		[1] 숫자 50 ~ 150 사이의 범위에서 7의배수를 순차적으로 검색한다.
 		[2] 반복문이 종료후 3번째 7의 배수를 출력한다.
 	[정답]
 	 	3번째 7의 배수 : 70
 */
public class 반복문2_문제03_세번재배수2 {
	public static void main(String[] args) {
		int i = 50;
		int count = 0;
		int 배수3 = 0;
		while(i <= 150) {
			if(i % 7 == 0) {
				System.out.println(i);
				count += 1;
				if(count == 3) {
					배수3 = i;
				}
			}
			i += 1;
		}
		System.out.println("3번째 7의 배수 : " + 배수3);
	}
}
