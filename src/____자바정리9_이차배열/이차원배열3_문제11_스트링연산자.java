package ____자바정리9_이차배열;
/*
	[테스트]
 	연산자 게임을 하려고 한다. 
 	연산자 게임이란 숫자들만 화면에 나오고 연산자를 맞추는게임이다.
 	예를 들어 3+3=6 이라면 화면에 아래와같이 출력이되고, 사용자는 연산자를 맞추는게임이다.
 	-----------------------------
 	3 ? 3 = 6 
 	[1] + [2] - [3] *
 	-----------------------------
	
	아래 배열은 5문제이고 
		첫번째 세로줄은 앞의 숫자의 데이터이고 ,
		두번째 세로줄은 뒤의 숫자의 데이터이고 , 
		세번재 세로줄은 연산자의 데이터이다.  
	게임을 만들고, 맞춘개수를 출력하시오.
	
	예) 첫번째 값은 5이고 두번째 값은 9 이고 연산자는 0 이면  		
		5 ? 9 = 14 이고, 정답은 1 이다.
		[1] + [2] - [3] * 	 	
*/
public class 이차원배열3_문제11_스트링연산자 {
	
	public static void main(String[] args) {
		String arr[][] = {
				{"5","9","+"},
				{"3","7","-"},
				{"8","4","*"},
				{"9","2","*"},
				{"4","6","+"},
		};
	}
}