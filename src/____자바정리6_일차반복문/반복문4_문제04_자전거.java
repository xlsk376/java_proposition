package ____자바정리6_일차반복문;
/*
	[문제]
		학교에서 집까지 갈때, 
		시속 15km로 자전거를 타고 가면, 
		시속 6km로 걸어가는거보다 18분 빨리 도착한다고 한다.
		학교에서 집까지의 거리를 구하시오.
		그리고 자전거를 타고가면 걸리는 시간과 걸어가면 걸리는 시간을 출력하시오.
	[정답]
		자전거로 걸리는 시간 : 12분
		걸어서 걸리는시간 : 30분
		거리 : 3.0km
 */
public class 반복문4_문제04_자전거 {
	public static void main(String[] args) {					
		//속도 = 거리/시간 , 거리 = 속도*시간
		double 자전거 = 15/60.0; // 분속
		double 걷기 = 6/60.0;
		double a = 0;
		double b = 0;
		
		while(true) {
			if(걷기*18 + 걷기*b == 자전거*a) {
				System.out.println("자전거거리 : " + a);
				System.out.println("걸은거리 : " + (b+18));
				System.out.println("거리 : "+a*자전거);
				break;
			}
			a += 1;
			b += 1;
			
		}
		
		//미지수 구분할 필요 없음 분으로 통일 , 단위 나올시 항상 단위 통일하기
		
	}
}
