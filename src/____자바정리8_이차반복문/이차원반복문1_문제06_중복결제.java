package ____자바정리8_이차반복문;

import java.util.Arrays;

/*
	쇼핑몰에서는 7월8일 과 7월9일에 결제오류가 발생되어,
	중복결제되는 일이 발생되었다. 
	환불을 진행 하기위해서 환불대상인 회원번호를  출력해보시오.
	아래배열은 7월8일과 7월9일에 결제를 한 회원번호이다. 
	7월8일에 결제된회원은 7월9일 명단에서 빼야한다. 
	중첩된회원수만큼 환불배열을 생성하고 중복번호들을 담아서 출력하시오.
	[결과]
		1003과 1006번 두번호가 겹친다. 
*/
public class 이차원반복문1_문제06_중복결제 {	
	public static void main(String[] args) {
		int 칠월팔일[] = {1001, 1003, 1006, 1004, 1005, 1090};
		int 칠월구일[] = {1009, 1006, 1012, 1003, 1011};
		
		int 환불[] = null;
		int count  = 0;
		
		for(int i = 0; i < 칠월팔일.length; i++) {
			for(int j = 0; j < 칠월구일.length; j++) {
				if(칠월팔일[i] == 칠월구일[j]) {
					count += 1;
				}
			}
		}
		환불 = new int[count];
		int index = 0;
		for(int i = 0; i < 칠월팔일.length; i++) {
			for(int j = 0; j < 칠월구일.length; j++) {
				if(칠월팔일[i] == 칠월구일[j]) {
					환불[index] = 칠월구일[j];
					index += 1;
				}
			}
		}
		System.out.println(Arrays.toString(환불));
		
		// 7월 8일에 결제한 사람이 7월9일에 결제가 되면 취소
		// 7월 8일 기준으로 7월 9일에 중복되는 값을 찾아서 취소하기
	}
}
