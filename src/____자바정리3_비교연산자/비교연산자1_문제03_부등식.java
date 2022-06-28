package ____자바정리3_비교연산자;
/*
	[문제]
		모두 true가 출력 되도록 값을 변경하시오.
		단, 변수의 값은  0을 사용하지마시오.
 */
public class 비교연산자1_문제03_부등식 {
	public static void main(String[] args) {		
		int a = 0;
	    int b = 0;	    	    
	    System.out.println(a + 4 < 4 - b);	//a :     
	    double c = 0;
	    double d = 0;	    
	    System.out.println(c - 4.5 >= d * 0.2 - 0.3);    
	    int e = 0;	
		System.out.println(e * 2 - 3 < e - 3);	
		int f = 0;		
		System.out.println(7 * 2 - f <= -5);
		int g = 0;
		boolean h = (2 * g - 1 > 4);
		System.out.println(h);	
		int i = 0;
		boolean j = (8 - 2 * i < i + 2);
		System.out.println(j);		
		int k = 0;	
		System.out.println(k + 1 <= -2 * 2 - 5);	
		int l = 0;		
		System.out.println(4 + (5 +  3 * l) <= -2 * (l - 2));		
	}
}
