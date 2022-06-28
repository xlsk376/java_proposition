package ____자바정리4_논리연산자;
/*
	[문제]
		아래내용을 식으로 작성하시오.
		철수는 중간고사에서 아래와 같이 시험점수를 받았다. 
		국어는 76점, 수학은 38점, 영어는 87점이다.
		세과목중 영어점수가 가장높은지 검사하는 식을 만드시오.
	[결과]
		true
*/
public class 논리연산자3_문제05_가장큰수2 {
	public static void main(String[] args) {
		int kor = 76;
		int math = 38;
		int eng = 87;
		System.out.println(eng > kor && eng > math);
	}
}
