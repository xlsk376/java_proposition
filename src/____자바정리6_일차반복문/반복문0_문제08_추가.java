package ____자바정리6_일차반복문;

public class 반복문0_문제08_추가 {
	public static void main(String[] args) {
		/*
		계단이 50 계단이 있다. 철수는 제일 윗계단에 서있다. 
		철수는 한번에 두계단씩 내려간다. 
		철수가 왼발로 디딘 계단을 출력하시오.
		아래조건을 참고하시오.
		[1] 철수는 한번에 두계단씩 내려간다.
		[2] 철수는 왼쪽발부터 내려간다.
		[3] 5번출력할때마다 다른 발을 출력하시오.
		
		48 44 40 36 32 
		30 26 22 18 14
		12 8  4
		*/
		int pos = 50;
		int count = 0;
		for(int i = 0; i <= 50; i++) {
			if(count == 0 || count == 5) {
				pos -= 2;
				count += 1;
				System.out.print(pos + " ");
			}else {
				pos -= 4;
				count += 1;
				System.out.print(pos + " ");
				if(count == 5) {
					count = 0;
					System.out.println();
				}
			}
			if(pos <= 4) {
				break;
			}
		}
	}
}
