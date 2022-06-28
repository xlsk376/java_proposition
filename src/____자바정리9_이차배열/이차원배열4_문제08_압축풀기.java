package ____자바정리9_이차배열;

import java.util.Arrays;
/*
array[][] = {3,2},{5,6},{2,1},{4,3}
 위 데이터는 압축한 데이터이다.
 위데이터의 규칙은 2개씩 짝을 이룬다.
  1) 앞의 숫자 ==> 데이터 
  2) 뒤의 숫자 ==> 개수이다.
 예) {3,2} ==> 33
 예) {5,6} ==> 555555
 예) {2,1} ==> 2
 예) {4,3} ==> 444
	 실제 데이터는 335555552444 인것이다. 
 문제) 위데이터사이즈만큼 배열을 만들고 각각의 값을 저장후 출력 
 예) temp = {3,3,5,5,5,5,5,5,2,4,4,4}
*/	
public class 이차원배열4_문제08_압축풀기 {			
	
	public static void main(String[] args) {
		int array[][] = {
				{3,2},{5,6},{2,1},{4,3}
			};
		int [] temp;
		
		int size = 0;
		for(int i = 0; i < array.length; i++) {
			size += array[i][1];
		}
		System.out.println(size);
		
		temp = new int[size];
		int index = 0;
		
		for(int i = 0; i < array.length; i++) {
			int num = array[i][0];			
			for(int j = 0; j < array[i][1]; j++) {
				temp[index] = num;
				index += 1;
			}
		}
		
		System.out.println(Arrays.toString(temp));
		
	}
}
