package ____자바정리2_변수;
/*
	[문제] 
		소풍 재료를 위해 김밥 재료를 구입하려 한다. 
   		김밥 재료로는 햄과 계란 당근이 필요하다.
   		햄 1개의 가격은 2500원이고 총 4개 필요하다.
   		계란 한 판은 3000원이고 총 2판 필요하다.
   		당근 1개의 가격은 2000원이고 총 8개가 필요하다.
   		집에 냉장고를 열어봤더니 당근이 2개 햄이 1개 있었다. 
   		철수가 부족한 재료를 사는데 필요한 총 금액을 구하시오. 
   	[정답] 
   		25500
 */
public class 변수1_문제04_소풍재료 {
	public static void main(String[] args) {
		int 햄 = 2500;
		int 계란 = 3000;
		int 당근 = 2000;
		int 필요햄 = 4;
		int 필요계란 = 2;
		int 필요당근 = 8;
		int 냉장당근 = 2;
		int 냉장햄 = 1;
		필요햄 = 필요햄 - 냉장햄;
		필요당근 = 필요당근 - 냉장당근;
		System.out.println(필요햄*햄 + 필요계란*계란 + 필요당근*당근);
		
	}
}
