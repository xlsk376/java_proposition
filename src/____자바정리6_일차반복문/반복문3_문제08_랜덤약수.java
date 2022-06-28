package ____자바정리6_일차반복문;

import java.util.Random;

/*
	[문제] 
		10~100사이의 랜덤숫자를 저장하고, 
		그숫자의 약수의개수를 구한다.
		약수의개수가 짝수이면 "짝수"를 출력하고,
		약수의개수가 홀수이면 숫자를 전부 출력한다. 
	[예시]
		49 : 1, 7, 49 : 약수의개수가 홀수이므로 숫자를 전부 출력한다.
		13 : 13, 1 : 13의 경우는 약수의개수가 짝수이므로 숫자를 출력하지말고 "짝수"를 출력한다.
	[힌트]
		한번에 해결할수 없다. 
 */
public class 반복문3_문제08_랜덤약수 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r = ran.nextInt(91)+10;
		int count = 0;
		for(int i = 1; i <= r; i++) {
			if(r % i == 0) {
				count += 1;
			}
		}
		if(count % 2 == 0) {
			System.out.println("짝수");
		}else {
			for(int i = 1; i <= r; i++) {
				if(r % i == 0) {
					System.out.print(i + " ");
				}
			}
		}
		
		
	}
}
