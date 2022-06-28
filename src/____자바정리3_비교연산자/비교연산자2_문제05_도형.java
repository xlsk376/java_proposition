package ____자바정리3_비교연산자;
/*
	[문제]
		사각형 가로는 10m이다.
	 	사각형 가로는 삼각형 가로보다 2m 더길다.
	 	삼각형 가로는 삼각형 세로 보다 2m 더길다.
	 	삼각형 3개의 넓이가 사각형의 넓이와 같다.
	  	아래식이 전부 true가 나오도록 변수들의 값을 변경하시오.
*/
public class 비교연산자2_문제05_도형 {
	public static void main(String[] args) {		
		double 사각형가로 = 0;
		double 사각형세로 = 0;
		double 사각형넓이 = 0;				
		double 삼각형가로 = 0;
		double 삼각형세로 = 0;
		double 삼각형넓이 = 0;		
		
		System.out.println(사각형가로 == 10);
		System.out.println(사각형가로 == 삼각형가로 + 2);
		System.out.println(삼각형가로 == 삼각형세로 + 2);
		System.out.println(삼각형넓이 * 3 == 사각형넓이);
		System.out.println(사각형세로 * 사각형가로 == 사각형넓이);
	}
}