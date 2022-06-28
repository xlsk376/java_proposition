package ____자바정리6_일차반복문;
/*
	[문제]	
	    자전거는 1시간에 240 칼로리가 소모되고, 
	    줄넘기는 1시간에 540 칼로리가 소모된다.
	    철수는 95분 동안 505 칼로리를 소모했다. 
	    철수가 각 운동에 사용한 시간을 구하시오.
	[정답]
		자전거시간 : 70분
		줄넘기시간 : 25분
*/
public class 반복문4_문제05_칼로리2 {
	public static void main(String[] args) {
		double 자전거일분칼로리 = 240 / 60.0;
		double 줄넘기일분칼로리 = 540 / 60.0;
		int 자전거시간 = 0;
		int 줄넘기시간 = 95;
		boolean run = true;
		while(run == true) {
			if(자전거일분칼로리 * 자전거시간 + 줄넘기일분칼로리 * 줄넘기시간 == 505 ) {
				System.out.println("자전거시간 : " + 자전거시간 + "분");
				System.out.println("줄넘기시간 : " + 줄넘기시간 + "분");
				run = false;
			}
			자전거시간 += 1;
			줄넘기시간 -= 1;
		}
	} 
}
