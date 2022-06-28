package ____자바정리8_이차반복문;

import java.util.Arrays;
import java.util.Random;
/*
  [max게임]
  
  1. 가장 큰 값을 찾아 입력한다.
  2. 정답이면 해당 값을 0으로 변경한다.
  3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
  예)
  11, 87, 42, 100, 24
  입력 : 100
  
  11, 87, 42, 0, 24
  입력 : 87
  
  11, 0, 42, 0, 24
  입력 : 24 ==> 최대값이 아니므로 아무일안생김
 */
public class 이차원반복문3_문제03_맥스게임 {
	public static void main(String[] args) {
		
		int[] arr = {11, 87, 42, 100, 24};
		Random ran = new Random();
		int count = arr.length;
		while(true) {
			System.out.println("--------------------------");
			System.out.println(Arrays.toString(arr));		
			if(count == 0) { // 마지막까지 출력되고 반복문 종료
				break;
			}			
			int r = ran.nextInt(arr.length);
			int max = 0; // max 값을 매번 초기화 해줌
			for(int i = 0; i < arr.length; i++) {
				if(max < arr[i]) {
					max = arr[i];
				}
			}			
			if(arr[r] == max) {
				arr[r] = 0; // 인덱스를 따로 구분하지 않고 맥스 값과 입력한 인덱스에 들어있는 값이 같으면 인덱스의 값을 초기화 한다.
				System.out.println(r + " : " + max + " : 정답. ");
				count -= 1;
			}else {
				System.out.println(r + " : " + arr[r] + " : 가장큰값이 아닙니다. ");
			}		
		}		
	}
}
