package ____자바정리6_일차반복문;
/*
	[문제]
		철수네반은 여학생 16명과 남학생 20명으로 구성되어있다. 
		팀을 나눠서 조별과제를 하려고한다. 
		각팀당 여학생과 남학생수를 똑같이 구성하고,
		최대한 많은팀을 만들때 몇팀을 만들수있는지 구하시오. 
	[정답]
		팀 : 4
		여학생 : 4
		남학생 : 5
 */
public class 반복문6_문제03_팀원2 {
	public static void main(String[] args) {
		int 전체여학생 = 16;
		int 전체남학생 = 20;
		int 팀 = 0;
		for(int i = 1; i <= 전체여학생; i++) {
			if(전체여학생 % i == 0 && 전체남학생 % i == 0) {
				팀 = i;
			}
		}
		System.out.println("팀 : " + 팀);
		System.out.println("여학생 : " + 전체여학생 / 팀);
		System.out.println("남학생 : " + 전체남학생 / 팀);
	}
}
