package ____자바정리6_일차반복문;
/*
	[문제]
		아래와같은 휴대요금제가 있다 
	  	B를 선택할경우 A보다 더 경제적이될려면,
	  	통화시간을 얼마이상 사용해야되는지 초로구하시오.
	[요금제]
	  	A요금제 : 기본요금 17500원 + 초당 5원 
	  	B요금제 : 기본요금 31000원 + 초당 2원
	[정답]
		4501초
 */	
public class 반복문4_문제03_요금제2 {
	public static void main(String[] args) {		
		int b기본 = 31000;
		int a기본 = 17500;
		int a = 5;
		int b = 2;		
		int 초 = 0;
		int a추가요금 = 0;
		int b추가요금 = 0;
		boolean run = true;
		while(run) {
			//System.out.println((a기본 + a추가요금) + " " + (b기본 + b추가요금));
			if(a기본 + a추가요금 > b기본 + b추가요금) {
				System.out.println(초 + "초");
				run = false;
			}else {
				a추가요금 += a;
				b추가요금 += b;
				초 += 1;
			}			
		}
	}
}
