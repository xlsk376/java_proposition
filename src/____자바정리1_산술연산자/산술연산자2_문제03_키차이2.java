package ____자바정리1_산술연산자;
/*
	[문제]
  		민수는 키가 184cm이고,
  		철수는 키가 165cm이고,
  		영희는 키가 160cm이다.
  		세 학생의 키의 평균에서 키가 가장 작은 학생의 차이를 구하시오.
  		수소점 두 자리까지 구하시오.
	[정답] 
		9.67
 */
public class 산술연산자2_문제03_키차이2 {
	public static void main(String[] args) {	
		System.out.printf("%.2f", (184 + 165 + 160) / 3.0 - 160);
     }
}
