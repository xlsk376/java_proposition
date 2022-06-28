package ____자바정리6_일차반복문;
/*
	[문제] 
  		6의 배수를 순차적으로 검사한다. 
  		6배수중 100에 가장가까운 수를 출력 하시오.
 	[정답]
 		102
*/
public class 반복문2_문제06_배수가까운값2 {
	public static void main(String[] args) {		
		int left = 0;
		int right = 0;
		int num = 6;
		int i = num;
		int max = 100;
		boolean run = true;
		while(run == true) {
			if(i % num == 0 ) {
				left = i;
			}
			i += 1;
			if(i == max) {
				run = false;
			}
		}
		System.out.println("100 직전의 6의배수 : " + left);
		right = left + num;
		System.out.println("100 바로 다음의 6의배수 : " + right);	
		System.out.println("둘중 100에 가장 가까운수 ");
		if(max - left > right - max) {
			System.out.println(right);
		}else if(max - left < right - max) {
			System.out.println(left);
		}else {
			System.out.println("같다");
		}
	}
}
