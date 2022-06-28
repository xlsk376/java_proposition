package ____자바정리9_이차배열;
/*
영화관 예매를 기록할려고한다. 영화관크기는 4 * 3 사이즈이다 (y , x) 		
input의 데이터는 3개씩 5 번이다. 
input의 데이터3개는 각각 {y , x , 회원번호}를 뜻한다. 		
input의 데이터를 영화관에 기록후 출력 
[예]  

---------------------------------------------------------
[1] { 1,1,1001 } 
{출력 : 예매를 완료합니다.}
	{
	{0	,   0,	0},
	{0	,1001,	0},
	{0	,   0,	0},
	{0	,   0,	0}
}; 

---------------------------------------------------------
[2] { 2,2,1003 } 
{출력 : 예매를 완료합니다.}
	{
	{0   ,    0,    0},
	{0   , 1001,    0},
	{0   ,    0, 1003},
	{0   ,    0,	0}
}; 

---------------------------------------------------------
[3] { 0,0,1006 } 
{출력 : 예매를 완료합니다.}
	{
	{1006,  0,	 0},
	{0	,1001,	 0},
	{0	,   0,1003},
	{0	,   0,	 0}
}; 

---------------------------------------------------------
[4] { 1,1,5422 } 
	{출력 : 이미 예매한 자리입니다.}

---------------------------------------------------------
[5] {0,0,1006} //이미예매를 한자리이므로
{출력 : 예매를 취소합니다.}
	{
	{0  ,   0,	 0},
	{0	,1001,	 0},
	{0	,   0,1003},
	{0	,   0,	 0}
}; 
*/

public class 이차원배열4_문제07_인풋예매 {

	
	public static void main(String[] args) {

		int[][] 영화관 = {
				{0,0,0},
				{0,0,0},
				{0,0,0},
				{0,0,0}
			};
		
		int input[][] = {
				{1,1,1001},
				{2,2,1003},
				{0,0,1006},
				{1,1,5422},
				{0,0,1006},
		};
		
		
		
		
		
	}
}
