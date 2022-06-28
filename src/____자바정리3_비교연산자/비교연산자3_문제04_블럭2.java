package ____자바정리3_비교연산자;
/*
	[문제]
		철수는 2시간 동안 블럭을 231개 쌓는다. 
		민수는 1시간 반동안 블럭을 177개 쌓는다.
		다음 문장을 부등식으로 나타내시오.
	[설명]
		철수가 민수보다 블럭쌓는속도가 더빠르다.
	[정답]
		false
*/
public class 비교연산자3_문제04_블럭2 {
	public static void main(String[] args) {
		double 철수분속 = 231 / 120.0;
		double 민수분속 = 177 / 90.0;		
		System.out.println(철수분속);
		System.out.println(민수분속);
		System.out.println(철수분속 > 민수분속);
    }
}