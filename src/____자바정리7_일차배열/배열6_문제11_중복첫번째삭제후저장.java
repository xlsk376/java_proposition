package ____자바정리7_일차배열;
import java.util.Arrays;
/*
	[문제] 값을 입력받고 삭제 
	[조건] 만약에 같은값이 여러개 있으면 가장첫번째의 값  한개만 삭제 후 
			b 에 순차적으로 저장 
			data[] = {5,2,6,8,5,6};
			  
	[예] 2 ==>  b [] = {5,6,8,5,6};
	[예] 6 ==>  b [] = {5,2,8,5,6};
*/
public class 배열6_문제11_중복첫번째삭제후저장 {
	public static void main(String[] args) {	
		int data[] = {5,2,6,8,5,6};
		int b [] = null;
		int value = 6;		
		int index = -1;	
		for(int i = 0; i < data.length; i++) {
			if(value == data[i]) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("없음");
		}else {
			int bindex = 0;
			for(int i = 0; i < data.length; i++) {
				if(i != index) {
					b[bindex] = data[i];
					bindex += 1;
				}
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
