package ____자바정리8_이차반복문;
/*
	[문제] 
		배열의 값을 그래프로 출력하려고한다.
		graph 배열의 각각의 값만큼 * 을반복적으로 가로로 출력하고,
		다음숫자는 줄을바꿔서 출력하시오.
	[예]
		 3   ==> ***
		 10  ==> **********
		 5   ==> *****
		 6   ==> ******
		 0   ==> 
		 1   ==> *	
*/
public class 이차원반복문1_문제05_그래프가로 {
	public static void main(String[] args) {
		int[] graph = {3, 10, 5, 6, 0, 1};
		
		for(int i = 0; i < graph.length; i++) {
			System.out.printf("%2d",graph[i]);
			System.out.print(" ==> ");
			for(int j = 0; j < graph[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//이중반복문을 통해서 그래프의 y축을 첫번째반복문으로 두고 graph의 값만큼 출력되는 x축을 두번째반복문으로 두어 출력해준다.
					
	}
}
