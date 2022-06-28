package ____자바정리6_일차반복문;
/*  
	[문제]
		철수는 자전거로 운동장한바퀴도는데 70초, 민수는 90초가 걸린다. 
	    30분동안 운동장을 돌면 출발점에서 다시만나는회수가 몇번인지 구하시오.
	[정답]
		다시 만나는 횟수 : 2
*/
public class 반복문6_문제08_운동장2 {
	public static void main(String[] args) {
		int 철수 = 70;
		int 민수 = 90;
		int 삼십분 = 30 * 60;
		int i = 철수;
		int count = 0;
		while(true) {
			if(i > 삼십분) {
				break;
			}
			if(i % 철수 == 0 && i % 민수 == 0) {
				count += 1;
			}		
			i += 1;		
		}
		System.out.println("다시 만나는 횟수 : " + count);
	}	
}
