package ____자바정리1_산술연산자;
/*
	[문제]
		철수는 친구의 생일 선물로 가격이 4000원인 필통 1개와 
		가격이 700원인 공책 몇 권을 사려고 한다. 
		철수는 13000원을 가지고 있을 때,
		공책은 최대한 몇 권을 살 수 있을지 구하시오.
		공책을 최대로 구입한 후 남은 금액도 함께 출력하시오.
	[정답] 
		12, 600
 */
public class 산술연산자3_문제01_공책 {
	public static void main(String[] args) {
		// 4000 + 700*x < 13000
		// x*700 = 9000
		// x = 9000/700;
		int a = 13000-4000;
		//System.out.println(a);
		int b = 9000/700;
		//System.out.println(b);
		//System.out.println(13000-(4000+700*12));
		
		//몫과 나머지를 이용해 구하기
		
		System.out.println((13000-4000)/700);
		System.out.println((13000-4000)%700);

     }
}
