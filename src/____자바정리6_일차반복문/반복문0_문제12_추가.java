package ____자바정리6_일차반복문;

import java.util.Random;

public class 반복문0_문제12_추가 {
	public static void main(String[] args) {
		/*
		 * 아래배열에 랜덤숫자 (1~9사이) 를 10개 저장한다. 
		 * 랜덤숫자중 짝수가 연속으로 나왔을때의 개수를 센다.
		 * 그개수중 연속적으로 가장긴개수를 출력한다.
		 * 
		 * [예시]
		 * 		1,6,4,3,2,4,8,6,1,2
		 * 		
		 * [개수] 
		 * 		6,4 구간이 2칸이므로 2
		 * 		2,4,8,6 구군이 4칸이므로 4
		 * 		마지막 2는 한개이므로 1
		 * 		가장긴개수는 4
		 * [정답] 
		 * 		4	
		 */
		Random ran = new Random();
		int count = 0;
		int max = 0;
		for(int i = 0; i < 10; i++) {
			int r = ran.nextInt(9)+1;
			System.out.print(r + " ");
			if(r % 2 == 0) {
				count += 1;
			}else {
				count = 0;
			}
			if(max < count) {
				max = count;
			}
		}
		System.out.println();
		System.out.println(max);
		
		
	}
}
