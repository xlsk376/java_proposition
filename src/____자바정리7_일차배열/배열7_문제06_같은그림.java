package ____자바정리7_일차배열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
	아래배열은 카드10장을 배열로 표현한것이다.
	카드는 a~e 까지의 문자가 그려저있고 각각 2장씩 있다.
	아래 카드를 셔플하고 출력한다.
	인덱스 2개를 입력받고 그카드의 모양이 서로 같으면 카드의 값을 "x" 로 표기한다. 
	
 */
public class 배열7_문제06_같은그림 {
	public static void main(String[] args) {
		String[] card = { "a", "a", "b", "b", "c", "c", "d", "d", "e", "e" };
		int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 100; i++) {
			int r1 = ran.nextInt(card.length);
			int r2 = ran.nextInt(card.length);
			String temp = card[r1];
			card[r1] = card[r2];
			card[r2] = temp;
		}
		int count = card.length / 2;
		while(true) {
			System.out.println(Arrays.toString(card));
			System.out.println(Arrays.toString(a));
			if(count == 0) {
				break;
			}
			System.out.println("카드 2장을 선택하세요.");
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			
			if(n1 != n2 && card[n1] == card[n2]) {
				card[n1] = "x";
				card[n2] = "x";
				count -= 1;
			}else {
				System.out.println("다시선택해주세요.");
			}
			
			
		}

	}
}
