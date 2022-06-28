package ____자바정리7_일차배열;

import java.util.Arrays;

/*
	편의점 물건채우기 
	철수는 편의점에서 아르바이트를 하고있다. 
	오늘 장사가 잘되서 라면이 많이 판매되었다.
	라면진열장에 라면들이 전부 채워질수있도록 라면을 채워보자.
	
	라면은 진열장은 한칸에 최대 5개씩 진열할수있으며,
	재고는 6개 밖에 없고 앞에서부터 순차적으로 채워넣는다. 
	재고를 다채웠을때 라면진열장의 모습을 출력해보자.
	
	[예] 
		{3,5,2,1,2}
		
		1번은 3이므로 2개를 추가해 ==> -2
		2번은 5이므로 0개를 추가해 ==> -0
		3번은 2이므로 3개를 추가해 ==> -3
		4번은 1이므로 4개를 추가해야되지만 재고가 1개밖에없어서 -1	
		최종으론 {5,5,5,2,2} 가된다. 
*/
public class 배열5_문제02_물건채우기 {

	public static void main(String[] args) {
		
		int [] a = {3,5,2,1,2};
		int b = 6;
		
		for(int i = 0; i < a.length; i++) {
			boolean check = false;
			if(a[i] != 5) {
				while(true) {
					if(a[i] == 5) {
						break;
					}else {
						a[i] += 1;
						b -= 1;
						if(b == 0) {
							check = true;
							break;
						}
					}
				}
				if(check == true) {
					break;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		
		
		
		
		
	}
}