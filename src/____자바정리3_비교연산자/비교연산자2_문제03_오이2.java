package ____자바정리3_비교연산자;
/*
	[문제]
		현금 20000 만원을 가지고
		마트에 가서 오이를 9개 구매했더니,
		거스름돈이 2000원이다.
	  	아래식이 모두 true가 나오도록 변수들의 값을 변경하시오.
*/
public class 비교연산자2_문제03_오이2 {
	public static void main(String[] args) {				
		int 현금 = 0;
		int 오이가격 = 0;
		int 오이개수 = 0;
		int 거스름돈 = 0;
		
		현금 = 20000;		
		오이개수 = 9;
		거스름돈 = 2000;
		오이가격 = (현금 - 거스름돈) / 오이개수;
		System.out.println(오이개수 == 9);		
		System.out.println(현금 == 20000);
		System.out.println(거스름돈 == 2000);
		System.out.println(현금 - 오이가격 * 오이개수 == 거스름돈);
	}
}