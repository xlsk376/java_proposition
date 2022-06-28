package ____자바정리3_비교연산자;
/*
	[문제]
		철수의 작년 연봉은 970 원이다 올해는 11% 인상 되었다. 
		올해 우리 회사 평균 월급은 91 원이다. 
		다음 문장을 부등식으로 나타내시오.
	[설명]
		올해의 철수 연봉이 올해의 우리회사 평균 연봉 보다 크다.
	[정답]
		false
*/
public class 비교연산자3_문제07_연봉2 {
	public static void main(String[] args) {
		double 작년연봉 = 970;
		double 올해연봉 = 작년연봉 * 1.11;
		double 평균월급 = 91;
		double 평균연봉 = 평균월급 * 12;
		System.out.println(올해연봉);
		System.out.println(평균연봉);
		System.out.println(올해연봉 > 평균연봉);
	}
}
