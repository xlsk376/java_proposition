package ____자바정리2_변수;
/*
	[문제]
 		공장에서 장난감을 1000개 만들면 불량이 30개 나온다. 
		장난감 하나 만드는데 비용이 42원일 때 
 		정상적인 장난감 12000개를 만들 때 필요한 총비용을 구하시오.
 	[정답]
 		519120
 */
public class 변수1_문제08_불량2 {
	public static void main(String[] args) {
		int 천개장남감 = 1000;
		int 천개불량 = 30;
		int 한개비용 = 42;
		int 천개비용 = (천개장남감 + 천개불량) * 한개비용;
		int 만이천개비용 = 천개비용 * 12;
		
		System.out.println(만이천개비용);
	}
}
