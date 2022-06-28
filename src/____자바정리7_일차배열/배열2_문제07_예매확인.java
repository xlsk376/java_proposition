package ____자바정리7_일차배열;

import java.util.Scanner;

/*
	[문제] 
	[예매확인]	  
		[1] seatList 는 영화관 7자리를 나타낸다. 	 
		[2] seatList 의 값들은 영화관 예매한 회원번호를 나타낸다. 	
		[3] find에는 검색하고자하는 회원번호를 입력 한다.	
		[4] find 의 값을 영화관에서 찾아 자리를 출력해주자		
		[5] 찾는 값이 없으면 "없다" 를 출력한다.
	[예시] 
		입력 : 1003
		결과 : 0, 1
	[예시]
		입력 : 1005
		결과 : "없다"
 */
public class 배열2_문제07_예매확인 {
	public static void main(String[] args) {		
		int seatList[] = {1003, 1003, 0, 0, 1002, 0, 1001};		
		int find = 0;	
		
		Scanner scan = new Scanner(System.in);
		find = scan.nextInt();
		boolean check = false;
		for(int i = 0; i < seatList.length; i++) {
			if(find == seatList[i]) {
				System.out.print(i + " ");
				check = true;
			}
		}
		if(check == false) {
			System.out.println("없다");
		}
		
	}
}
