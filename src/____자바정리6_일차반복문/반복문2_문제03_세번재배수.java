package ____자바정리6_일차반복문;
/*
	[문제] 
		[1] 숫자 50 ~ 150 사이의 범위에서 7의배수를 순차적으로 검색한다.
 		[2] 반복문이 종료후 3번째 7의 배수를 출력한다.
 	[정답]
 	 	3번째 7의 배수 : 70
 */
public class 반복문2_문제03_세번재배수 {
	public static void main(String[] args) {
		int count = 0;
		int index = 0;
		for(int i = 50; i <= 150; i++) {
			if(i % 7 == 0) {
				count += 1;
				if(count == 3) {
					index = i;
				}
			}
		}
		System.out.println(index);

	}
}
