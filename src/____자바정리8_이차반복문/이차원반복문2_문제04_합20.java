package ____자바정리8_이차반복문;
import java.util.Arrays;
import java.util.Random;
/*
	아래배열에 랜덤으로 1~10 사이의숫자  3개를 저장한다.
	[조건]
		단, 3개의 숫자의 합은 반드시 20이여야하며, 똑같은 숫자는 없어야한다. 
		위치는 상관없다. 
		[예] 1,10,9
		[예] 9,10,1
	
 */
public class 이차원반복문2_문제04_합20 {
	public static void main(String[] args) {	
		int arr[] = new int[3];
		Random ran = new Random();
		while(true) {		
			int total = 0; // 초기화
			for(int i = 0; i < arr.length; i++) {
				int r = ran.nextInt(10) + 1;
				total += r;
				arr[i] = r; 
			}
			boolean check = false;
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr.length; j++) {
					if( i != j && arr[i] == arr[j]) {
						check = true;
					}
				}
			}		
			if(check == false && total == 20 ) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
