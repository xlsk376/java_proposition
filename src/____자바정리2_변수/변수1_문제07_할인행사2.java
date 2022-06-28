package ____자바정리2_변수;
/*
	[문제]
		철수는 현금 10000원을 갖고 있다.
		가격이 1200원인 과자 6개를 구입 후 거스름돈을 구하시오.
		단, 과자를 3개를 구입할 때마다 200원씩 할인해 주는 행사를 진행 중이다. 
	[정답] 
		3200
 */
public class 변수1_문제07_할인행사2 {
	public static void main(String[] args) {
		int 현금 = 10000;
		int 과자 = 1200;
		int 구입개수 = 6;
		int 총과자금액 = 과자 * 구입개수;
		int 할인금액 = 구입개수 / 3 * 200;
		int 거스름돈 = 현금 - 총과자금액 + 할인금액;
		
		System.out.println("현금 : " + 현금);
		System.out.println("총과자금액 : " + 총과자금액);
		System.out.println("할인금액 : " + 할인금액);
		System.out.println("거스름돈 : " + 거스름돈);
	}
}
