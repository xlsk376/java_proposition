package ____자바정리3_비교연산자;
/*
	[문제]
		다음 문장을 부등식으로 나타내시오.
		그리고 답을 구하시오.
	[설명]
		제주도 올레길을 갈때는 시속 2킬로미터로 걷고, 
	 	올때는 같은 길을 시속 3킬미터로 걸어서 
	 	전체 걸리는 시간을 5시간을 넘지 않으려고 한다.
	 	최대 몇킬로미터 지점까지 갔다가 되돌아오면되는지 구하시오.	 	
*/
public class 비교연산자3_문제03_올레길2 {
	public static void main(String[] args) {		
		double x = 6;
		double a = 2.0;
		double b = 3.0;
		System.out.println(x / a);
		System.out.println(x / b);
		System.out.println(x / a + x / b <= 5);
	}
}
