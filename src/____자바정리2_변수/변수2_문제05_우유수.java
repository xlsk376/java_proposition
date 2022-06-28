package ____자바정리2_변수;
/*
	[문제]	
		다음은 오늘 우유 상점의 매출 결과이다.
		오전에는 전체 우유의 16퍼센트를 팔았다.
		오후에는 전체 우유의 15퍼센트를 팔았다.
		현재 남은 우유는 345개이다.		 		
		오늘 전체 우유 수를 구하시오.
	[정답] 
		500
 */
public class 변수2_문제05_우유수 {
	public static void main(String[] args) {
		double 오전 = 16;
		double 오후 = 15;
		double 남은우유 = 345;
		double 남은퍼센트 = 100-(오전+오후);
		// 100 : x = 남은퍼센트 : 345
		
		double 전체우유 = 남은우유*100/남은퍼센트;
		System.out.println(전체우유);
		
	}
}
