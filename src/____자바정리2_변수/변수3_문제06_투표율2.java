package ____?ڹ?????2_????;
/*
	[????]
 		ö???? ???? ?л??? 40???̴?.
 	 	ö??, ????, ?μ? ?̷??? ?? ?л??? ???弱?ſ? ?⸶?ߴ?.
 	 	?μ??? ??ǥ?? 40%?? ȹ???߰?, 
 	 	?????? 9ǥ?? ȹ???ߴ?.
 	 	???????? ö???? ??ǥ?? ?ߴ?.
 	 	ö???? ??ǥ?? ?? % ???? ???Ͻÿ?. 	
 	[????] 
 		37.50
 */
public class ????3_????06_??ǥ??2 {
	public static void main(String[] args) {
		int ???л? = 40;
		double ?μ? = ???л? * 0.4;
		System.out.println(?μ?);
		int ???? = 9;
		double ö?? = ???л? - ?μ? - ????;
		System.out.println(ö??);
		
		double ???ۼ?Ʈ = ???л? / 100.0;			
		double ö???ۼ?Ʈ = ö?? / ???ۼ?Ʈ;
		System.out.printf("%.2f", ö???ۼ?Ʈ);
	}
}
