package ____자바정리3_비교연산자;
/*
	[문제]
		철수는 농구공을 12번던저서 7번성공했다.
		영희는 농구공을 17번던저서 9번성공했다.
		다음 문장을 부등식으로 나타내시오.
	[설명]
		영희의 성공확률이 철수의 성공확률보다 더 높다.
	[정답]
		true
*/
public class 비교연산자3_문제05_농구공2 {
	public static void main(String[] args) {
		double 철수확률 = 12 / 7.0;
		double 영희확률 = 17 / 9.0;
		System.out.println(철수확률 < 영희확률);		
    }
}