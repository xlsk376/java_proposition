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
public class 변수1_문제04_소풍재료2 {
	public static void main(String[] args) {
		int 햄 = 2500;
		int 계란 = 3000;
		int 당근 = 2000;
		
		int 햄개수 = 4;
		int 계란개수 = 2;
		int 당근개수 = 8;
		
		햄개수 = 햄개수 - 1;
		당근개수 = 당근개수 - 2;
		
		int 요금 = 햄 * 햄개수 + 계란 * 계란개수 + 당근 * 당근개수;
		System.out.println(요금);
	}
}
