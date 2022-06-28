package ____자바정리6_일차반복문;

import java.util.Random;

/*
	[문제] 
		10 ~ 100사이의 값을 랜덤으로 저장하고 랜덤값의 약수를 큰수부터 4개 차례대로 출력하시오.
		만약에 약수의 개수가 4개가 안된다면 숫자대신 "x" 를 출력하시오.
	[예시]
		14 : 14, 7, 2, 1
		13 : 13, 1 : 13의 경우는 약수의개수가 4개가안되므로 숫자를 출력하지말고 x 를 출력하시오.
	[힌트]
		한번에 해결할수 없다. 
		for를 사용하시오.
 */
public class 반복문5_문제05_for약수큰수 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r = ran.nextInt(91)+1;
		int count = 0;
		System.out.println("r : " + r);
		for(int i = r; i >= 1; i--) {
			if(r % i == 0) {
				count += 1;
			}
		}
		if(count >= 4) {
			for(int i = r; i >= 1; i--) {
				if(r % i == 0) {
					System.out.print(i + " ");
				}
			}
		}else {
			System.out.println("x");
		}
		

	}
}
