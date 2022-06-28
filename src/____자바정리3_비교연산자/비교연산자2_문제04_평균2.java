package ____자바정리3_비교연산자;
/*
	[문제]
	   시험 점수(국어,수학,과학) 3개의 평균이 60점 이상이면 합격이다.
	   국어 는 45점이고 수학은 89점이다.
 	   아래식이 모두 true가 나오도록 변수들의 값을 변경하시오.
*/
public class 비교연산자2_문제04_평균2 {
	public static void main(String[] args) {		     
        int 국어 = 0;
        int 수학 = 0;
        int 과학 = 0;
        double 평균 = 0;    
        
        국어 = 45;
        수학 = 89;
        과학 = 180 - (국어 + 수학);
        평균 = (국어 + 수학 + 과학) / 3.0;    
        System.out.println(평균 >= 60);
        System.out.println(국어 == 45);
        System.out.println(수학 == 89);
	}
}
