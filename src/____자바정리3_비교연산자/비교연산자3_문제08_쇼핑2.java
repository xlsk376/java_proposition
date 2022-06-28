package ____자바정리3_비교연산자;
/*
	[문제]
		철수는 고속버스를 타고 여행을 떠나려 한다.
		출발시간까지 1시간 여유가 있다.
		고속버스역과 상점을 시속 3km로 걸어서 왕복을 하고,
		10분 동안 물건을 쇼핑하려고 한다.
		다음 문장을 부등식으로 나타내시오.
	[설명]
		철수는 역에서  1.3km 떨어진 상점을 다녀올수 있다.	
	[정답]
		false
*/
public class 비교연산자3_문제08_쇼핑2 {
	public static void main(String[] args) {	
		int 총시간 = 60;
		int 쇼핑시간 = 10;
		double 시속 = 3;
		double 분속 = 시속 / 총시간;
		double 상점거리 = 1.3;
		double 상점왕복거리 = 상점거리 * 2;
		double 여유시간 = 총시간 - 쇼핑시간;
		double 걸을수있는거리 = 여유시간 * 분속;
		System.out.printf("1분간걷는분속 : %.2f km\n", 분속);
		System.out.printf("걸울수있는시간 : %.2f 분\n", 여유시간);
		System.out.printf("걸을수있는거리 : %.2f km\n", 걸을수있는거리);
		System.out.println(걸을수있는거리 >= 상점왕복거리);
		System.out.println("--------------------------------------");	
		double 상점왕복시간 = 상점왕복거리 / 분속;
		System.out.printf("상점까지시속3km로걸어서왕복하는시간 : %.2f분\n", 상점왕복시간);
		System.out.println(상점왕복시간 <= 여유시간);		
	}
}