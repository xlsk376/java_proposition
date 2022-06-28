package ____자바정리3_비교연산자;
/*
	[문제] 
	  	다음 문장을 부등식으로 나타내시오.
	  	그리고 답을 구하시오.
	[설명]
		x에서 3을 뺀값은 -x의 2배보다 작다.
		x는 0이 아니다.
*/
public class 비교연산자3_문제01_엑스값2 {
	public static void main(String[] args) {		
		int x = 0;
		x = -2;
		System.out.println(x - 3 < -x * 2);
		System.out.println(x != 0);
	}
}
