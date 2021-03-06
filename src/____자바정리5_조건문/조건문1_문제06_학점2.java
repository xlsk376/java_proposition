package ____자바정리5_조건문;

import java.util.Scanner;
/*
	[문제]
  	[학점]
  		시험점수를 입력받는다. 
  		아래 점수표를 참고해 시험점수에 해당하는 학점을 출력하시오.
  	[점수표]
  		100~91 사이는 "A",
  		90~81 사이는 "B",
  		80~0 사이는 "재시험"
  	[추가조건1] 		
  		[1] 만점이거나, A학점과 B학점의 일의 자리가 7점이상이면 학점뒤에 "+" 추가하시오.
  		[2] A학점과 B학점의 일의 자리가 3점이하이면 학점뒤에 "-"를 추가하시오. 
  		[3] 100보다 크거나 0 보다 작은숫자를 입력하면 "오류" 를 출력하시오.
  	[예시] 
  		[입력] 100 [결과] "A+"
      	[입력] 87  [결과] "B+"
      	[입력] 82  [결과] "B-"
      	[입력] 23  [결과] "재시험"
      	[입력] 101 [결과] "오류"
 */
public class 조건문1_문제06_학점2 {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);	
		System.out.println("점수 입력 : ");
		int score = scan.nextInt();
		if(score > 100 || score < 0) {
			System.out.println("오류");
		}
		if(score <= 100 && score >= 97) {
			System.out.println("A+");
		}
		if(score <= 96 && score >= 94) {
			System.out.println("A");
		}
		if(score <= 93 && score >= 91) {
			System.out.println("A-");
		}
		if(score <= 90 && score >= 87) {
			System.out.println("B+");
		}
		if(score <= 86 && score >= 84) {
			System.out.println("B");
		}
		if(score <= 83 && score >= 81) {
			System.out.println("B-");
		}
		if(score <= 80 && score >= 0) {
			System.out.println("재시험");
		}
		scan.close();
	}
}
