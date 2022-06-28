package ____자바정리4_논리연산자;
/*	
    [문제]
		아래내용을 식으로 작성하고, 답을구하시오.
	[설명]
		철수는 총거리가 8km인 산책로를 걷는데 
		처음에는 시속 6km로 달리다가 도중에 힘이들어
		남은거리는 시속 3km로 걸어서 2시간 만에 산책을 마쳤다. 
		시속 6km로 달린거리와 시속 3km로 걸은거리를 각각 구하시오.
	[힌트]
		분속으로 바꾸면 계산이 쉽다.
*/
public class 논리연산자3_문제08_산책로2 {	
	public static void main(String[] args) {		
		double 분속1 = 6.0 / 60;
		double 분속2 = 3.0 / 60;
		double a = 40;
		double b = 80;
		System.out.println(분속1);
		System.out.println(분속2);
		System.out.println(a * 분속1 + b * 분속2 == 8 && a + b == 120);
	}
}
