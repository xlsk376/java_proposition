package ____자바정리3_비교연산자;
/*
	[문제]
		철수는 체력테스트를 한다.
		종목은 윗몸일으키기이고, 1분에 35개를 하면 통과이다.
		철수는 3분 20초에 123개를 한다.
		다음 문장을 부등식으로 나타내시오.
	[설명]
		철수는 체력테스트를 통과할수있다.
	[정답]
		true
*/
public class 비교연산자3_문제09_체력테스트2 {	
	public static void main(String[] args) {		
		double 통과일초 = 35/60.0;
		double 철수일초 = 123/200.0;
		System.out.printf("철수가일초에성공한개수 : %.2f개\n", 철수일초);
		System.out.printf("통과하기위해일초에필요한개수 : %.2f개\n", 통과일초);
		System.out.println(철수일초 >= 통과일초);
		System.out.println("---------------------------------------------");	
		double 통과한개 = 60.0/35;
		double 철수한개 = 200.0/123;
		System.out.printf("철수가한개하는데걸린초 : %.2f\n", 200.0 / 123);
		System.out.printf("통과하기위해한개하는데걸린초 : %.2f\n", 60.0 / 35);
		System.out.println(철수한개 <= 통과한개);		
	}
}