package ____자바정리5_조건문;

import java.util.Scanner;
/*
	[문제]
	[ATM]
		[1] ATM 기능중 로그인기능을 구현한다.
				
		[2] 변수설명
	  		(1) cash 	: 현재 가지고있는 현금
		    (2) balance : 저축되어있는 예금
		    (3) join_id : 가입한 아이디
		    (4) join_pw : 가입한 비밀번호
		    	    
		[3] 기능설명	    				
			(1) [1.로그인] [0.종료]	의 메인 메뉴가 등장한다.    	
	    	(2) [1.로그인]을 선택한경우 아이디와 비밀번호를 입력받고 일치할경우 
	    		"로그인성공"을 출력하고,  
	    		[1.입금] [2.출금] 의 새로운 메뉴가 등장한다.     		
	    	(3) [1.로그인]을 선택한경우 아이디와 비밀번호를 입력받고 불일치할경우 
	    		"로그인실패"을 출력한다.     	
	    	(4) [1.입금]을 선택한경우는 입금할 돈을 입력받고 현금이 줄어들고 예금이 늘어난다.
	    	(5) [2.출금]을 선택한경우는 출금할 돈을 입력받고 예금이 줄어들고 현금이 늘어난다.   
	    	(6) [0.종료]를 선택한경우 "종료"를 출력한다.
*/
public class 조건문3_문제03_은행ATM2 {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);		
		int cash = 20000;    
		int balance = 30000; 
		String join_id = "qwer"; 
		String join_pw = "1234";  	
		System.out.println("=== [ATM] ===");
		System.out.println("[1.로그인] [0.종료]");
		int select = scan.nextInt();
		if (select == 1) {
			
		}else if (select == 0) {
			System.out.println("종료");
		}
	}
}
