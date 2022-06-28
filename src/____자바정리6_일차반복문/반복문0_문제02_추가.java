package ____자바정리6_일차반복문;

import java.util.Random;

public class 반복문0_문제02_추가 {
	public static void main(String[] args) {
		/*
		철수는 요즘 주식에 관심을 보이기 시작했다. 
		주식의 상승곡선이 궁금하기 시작했다. 
		최근 관심있는 게임주식을 살펴보기로 했다.
		꾸준히 상승하는 기간중 가장 긴 기간을 출력해보자. 
	 	[1] 랜덤으로 1~8까지 숫자 10개를 순차적으로 출력한다. 
	  	[2] 랜덤숫자는 주가 수치를 뜻하고  숫자가크면 상승 낮으면 하락이다. 
	  	[예시] 아래와같이 랜덤숫자가 나왔다고하면
	  		4 8 3 2 6 7 4 5 6 1
	  		
	  		(1) 처음 4 - 8 은 상승이고 8 다음은 3 이기때문에 최대 상승기간은 1이다.
	  		(2) 다시 2 - 6 - 7 은 상승이고 7다음은 4이기 때문에 최대상승기간은 2이다. 
	  		(3) 4 - 5 - 6 은 상승이고  6 다음 1이기때문에 최대상승기간은 2이다. 
	  		(4) 같은 수치가 연속이면 상승으로 치지않는다.    
	  	[정답]
	  		2일
		*/
		Random ran = new Random();
		int a = 0;
		int b = 0;
		int count = 0;
		for(int i = 0; i < 10; i++) {
			int r = ran.nextInt(8)+1;
			System.out.print(r + " ");
			if(a == 0) {
				a = r;
			}else {
				if(a < r) {
					a = r;
					count += 1;
				}else if(a > r) {
					a = r;
					count = 0;
				}
				if(b < count) {
					b = count;
				}
			}
		}
		System.out.println();
		System.out.println(b);
		
		
		
		
	}
}
