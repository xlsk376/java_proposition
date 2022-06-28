package ____자바정리6_일차반복문;
/*
	[영수증 출력]
		[1] 5번 주문을 받는다.
		[2] 주문이 끝난 후, 돈을 입력받는다.
		[3] 각 메뉴별 주문수량과 총금액을 출력한다.	
		[예시]
			[1] 메뉴선택 : 1, 1, 2, 2, 3
			[2] 입력 : 32000
		[결과]
			=== 롯데리아 영수증 ===
			불고기버거 : 2개
			새우버거 : 2개
			콜라 : 1개
			총금액 : 31300원
			현금 : 32000
			거스름돈 : 700원
*/
public class 반복문8_문제05_영수증 {
	public static void main(String[] args) {
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기버거 : " + price1 + "원");
		System.out.println("2.새우버거 : " + price2 + "원");
		System.out.println("3.콜라 : " + price3 + "원");
		
	}

}
