package ____자바정리9_이차배열;

import java.util.Arrays;
/*
nameList 배열은 상품이름리스트 , 
dataList 2차원배열은 각각 가격 , 상품개수 리스트목록이다 .		
예) 현재 재고는 새우깡은 3개 , 감자깡 1개 , 고래밥 1개 있다.			
아래 배열은 오늘 주문이 들어온순서이다.
총매출을 출력해보세요.	


예) 첫번째 1 ==> 감자깡의 개수는 1이므로 판매할수있다.
예) 두번째 2 ==> 고래밥의 개수는 1이므로 판매할수있다.
예) 세번째 2 ==> 고래밥의 개수가 이미 두번째에서 구입해서 0이되므로 판매불가.
  ....
  .... 		
주문은 총  새우깡 2개 , 감자깡 3개 , 고래밥 3개 들어왔지만 ,
실제 판매한 품목은  새우깡 2개 , 감자깡 1개 , 고래밥 1개 이다.
*/
public class 이차원배열4_문제04_인풋쇼핑 {

	public static void main(String[] args) {
		
		String titleList[] = {"새우깡" , "감자깡" , "고래밥"};
		int dataList[][] = {
				{1000, 3},
				{2300, 1},
				{3100, 1}
		};
		int [] input = {1,2,2,0,0,2,1,1};	
		int price = 0;
		for(int i = 0; i < input.length; i++) {
			int index = input[i];
			if(dataList[index][1] > 0) {
				
				System.out.print(titleList[index] + " 판매 : ");
				System.out.println(dataList[index][0]);
				dataList[index][1] -= 1;
				
				price += dataList[index][0];
			}else {
				System.out.print(titleList[index] + " ");
				System.out.println("재고부족");
			}
		}
		for(int i = 0; i < dataList.length; i++) {
			System.out.println(Arrays.toString(dataList[i]));
		}
		
		
		System.out.println(price);
	}
}
