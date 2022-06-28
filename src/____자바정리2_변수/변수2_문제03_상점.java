package ____자바정리2_변수;
/*
	[문제]
		상점에 과일이 250개가 있다. 
		그중에 오전에 84퍼센트가 팔렸고, 
		나머지 16퍼센트는 오후에 다 팔렸다.
		오전에 팔린 개수에서 오후에 팔린 개수의 차이는 얼마인지 구하시오.
	[정답]
		170
 */
public class 변수2_문제03_상점 {
	public static void main(String[] args) {
		double 과일 = 250;
		double 오전 = 과일*0.84;
		double 오후 = 과일*0.16;
		int 차이 = (int)(오전-오후);
		System.out.println(차이);
		
	}
}
