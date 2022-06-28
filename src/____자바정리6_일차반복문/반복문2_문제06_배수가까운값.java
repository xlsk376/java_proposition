package ____자바정리6_일차반복문;
/*
	[문제] 
  		6의 배수를 순차적으로 검사한다. 
  		6배수중 100에 가장가까운 수를 출력 하시오.
 	[정답]
 		102
*/
public class 반복문2_문제06_배수가까운값 {
	public static void main(String[] args) {		
		int i = 1;
		int a = 0;
		while(true) {
			if(i % 6 == 0) {
				if(i >= 100) {
					a = i;
					break;
				}
			}
			i += 1;
		}
		System.out.println(a);
		int b = a - 6;
		
		if(a -100 > 100- b) {
			System.out.println(b+" : 더 가까움");
		}else {
			System.out.println(a+" : 더 가까움");
		}
		
		
	}
}
