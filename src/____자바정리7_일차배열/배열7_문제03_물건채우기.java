package ____자바정리7_일차배열;

import java.util.Arrays;

/*
	철수는 편의점에서 아르바이트를 하고있다. 
	장사가 잘되서 라면이 많이 팔렸다. 
	진열장은 최대 10개까지 물건을 채울수있다.
	
	재고는 4칸의 상자에 5개씩 담겨져있다.
	
	진열장을 앞에서부터 순처적으로채워넣고 결과를 출력하시오.
	
	[예]
		각진열장마다 필요한개수는 아래와같다.
		{6, 10, 1, 7, 9}
		
		하지만 가진 재고가 모자르기때문에 최대 아래와같이 채워넣을수있다.
		{10, 10, 10, 6, 1};		
*/
public class 배열7_문제03_물건채우기 {
	public static void main(String[] args) {
		int a[] = {4,0,9,3,1};	
		int b[] = {5,5,5,5};
		int count = 4;
		boolean check = false;
		for(int i = 0; i < a.length; i++) {
			if(a[i] != 10) {
				while(true) {
					if(a[i] == 10) {
						break;
					}else {
						a[i] += 1;
						b[0] -= 1;
						if(b[0] == 0) {
							for(int j = 0; j < count-1; j++) {
								b[j] = b[j+1];
							}
							b[count-1] = 0;
							count -= 1;
							if(count == 0) {
								check = true;
								break;
							}
						}
						
					}
				}
				if(check == true) {
					break;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		
		
	}
}
