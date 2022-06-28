package ____자바정리6_일차반복문;
/*
	[문제]
  		철수는 두번의 시험에서 각각 80점과 72점을 받았다.
		세 번째 시험에서 최소 몇 점이상을 받아야 
       	세번의 시험성정의 평균이 82점이상이 될수 있을지 구하시오.
    [정답]
    	세번째 시험점수 : 94점
 */
public class 반복문4_문제06_합격2 {
	public static void main(String[] args) {
		int 시험1 = 80;
		int 시험2 = 72;
		int 시험3 = 0;		
		boolean run = true;
		while(run == true) {
			int 평균 = (시험1 + 시험2 + 시험3) / 3;
			if(평균 >= 82) {
				System.out.println("세번째 시험점수 : " + 시험3 + "점");
				run = false;
			}
			시험3 += 1;
		}
	} 
}
