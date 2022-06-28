package ____자바정리7_일차배열;
import java.util.Arrays;
import java.util.Random;
/*
	[문제1] array 배열에 1~100점 사이의 랜덤 정수를 5개 저장하고 출력
	[예시]    
		[87, 11, 92, 14, 47]
	
	[문제2] 전교생의 총점과 평균 출력 (평균은 소수점 2자리까지출력)
	[예시]    
		총점 : 251
		평균 : 50.2
	
	[문제3] 성적이 60점 이상이면 합격. 합격생 수 출력
	[예시]   
		2
*/
public class 배열2_문제08_통계 {
	public static void main(String[] args) {
		Random ran = new Random();
		int[] array = new int[5];		
		for(int i = 0; i < 5; i++) {
			int r = ran.nextInt(100) + 1;
			array[i] = r;
		}
		System.out.println(Arrays.toString(array));
		int total = 0;
		double 평균 = 0;
		for(int i = 0; i < 5; i++) {
			total = total +  array[i];
		}
		평균 = total / 5.0;
		System.out.println("합 : " + total);
		System.out.printf("평균 : %.2f" , 평균);
		System.out.println();
		int count = 0;
		for(int i = 0; i < 5; i++) {
			if(array[i] >= 60) {
				count += 1;
			}
		}	
		System.out.println("합격생수 : " + count);
	}

}
