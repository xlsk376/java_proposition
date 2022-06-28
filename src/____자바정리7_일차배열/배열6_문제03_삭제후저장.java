package ____자바정리7_일차배열;
/*
	[문제]
	아래배열 a 의 안에 있는 값을 하나 입력받는다.
	b배열안에 위에서 입력한 값을 제외하고 복사한다.
	[예] 30 ==> b[] = {10,20,40,50};
 */
public class 배열6_문제03_삭제후저장 {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = null;
		int input = 30; // 가정했을때
		int room = 0;
		int count = 0;
		for(int i = 0; i < 5; i++) {
			if(input != a[i]) {
				count += 1;
			}
		}
		b = new int[count];
		for(int i = 0; i < 5; i++) {
			if(input != a[i]) {
				b[room] = a[i];
				room += 1;
			}
		}
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}	
	}
}
