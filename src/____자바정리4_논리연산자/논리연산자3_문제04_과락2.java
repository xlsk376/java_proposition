
package ____자바정리4_논리연산자;
/*
	[문제]
		아래내용을 식으로 작성하시오.
		철수는 국어점수 100점, 영어점수 87점, 수학점수 49점을 받았다.
		세과목의 평균이 60점 이상이면 합격이다.
		단, 평균이 합격일지라도, 어느 한과목이 50점 미만이면 불합격이다.
	[설명]
	 	철수는합격이다.
	[결과]
		false
*/
public class 논리연산자3_문제04_과락2 {	
	public static void main(String[] args) {
		 int kor = 100;
		 int eng = 87;
		 int math = 49;		
		 double 평균 = (kor + eng + math) / 3.0;
		 System.out.println(평균 >= 60 && kor >= 50 && eng >= 50 && math >= 50);
	}
}
