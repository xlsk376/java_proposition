package ____?ڹ?????7_?????迭;
/*
	[?׽?Ʈ]
		ö???? ?μ??? ???????????? 6ȸ ?Ͽ???. 
		????(0) , ????(1) , ??(2) ?? ???Ѵ?. 
		?Ʒ? ?迭?? ???? ???????????? ?? ?????? ?????Ѱ??̴?. 
		
		ö???? ?μ??? ???? 50??° ???? ?????? ?????Ͽ???. 
		ö???? ?μ??? ?????? ???? ????ġ?? ???????????
		[??Ģ]
			?̱??? 5ĭ ?ö󰣴?.
			?????? 1ĭ ?ö󰣴?.
			???? 3ĭ ????????. 
*/
public class ?迭7_????01_?迭?????????? {
	public static void main(String[] args) {
		int ö??list[] = {0,1,2,2,1,0}; // ö?? ?̱? : 3??, ???? : 2??, ?? : 1?? 15+2-3
		int ?μ?list[] = {2,1,1,2,0,1};
		int ö????ġ = 50;
		int ?μ???ġ = 50;
		// 0 > 2 , 1 > 0 , 2 > 1
		for(int i = 0; i < 6; i++) {
			if(ö??list[i]==0 && ?μ?list[i]== 2) {
				ö????ġ += 5;
				?μ???ġ -= 3;
			}else if(ö??list[i]==1 && ?μ?list[i]== 0) {
				ö????ġ += 5;
				?μ???ġ -= 3;
			}else if(ö??list[i]==2 && ?μ?list[i]== 1) {
				ö????ġ += 5;
				?μ???ġ -= 3;
			}else if(ö??list[i] == ?μ?list[i]) {
				ö????ġ += 1;
				?μ???ġ += 1;
			}else{
				?μ???ġ += 5;
				ö????ġ -= 3;
			}
			System.out.println(ö????ġ + " " + ?μ???ġ);
		}
	}
}
