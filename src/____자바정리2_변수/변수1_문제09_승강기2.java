package ____자바정리2_변수;
/*
	[문제] 
	    한 번에 500kg까지 운반할 수 있는 승강기가 있다.
	    몸무게가 80kg인 배달원이 이 승강기를 타고 
	    하나의 무게가 30kg인 상자를 운반하려고 할 때,
	    한 번에 최대 몇 상자까지 운반할 수 있는지 구하시오.
	[정답]
		14
 */
public class 변수1_문제09_승강기2 {
	public static void main(String[] args) {
		int 승강기 = 500;
		int 몸무게 = 80;
		int 상자 = 30;
		int 총상자 = (승강기 - 몸무게) / 상자;
		
		System.out.println(총상자);
	}
}
