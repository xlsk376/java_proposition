package ____자바정리9_이차배열;
/*  
scoreList[] = {31, 76, 54, 2, 100, 23};
위 데이터는 학생 6명의 점수이다.		
위 데이터를 그래프로 표현해볼려고한다.
	표시는 10의 자리숫자로 표현해서 개수만큼  * 로 출력할려고한다.
	전에는 왼쪽에서 오른쪽으로 표현했지만 이번엔 아래서 위로 표현할려고한다.		
  
---------------------------------		                
                 *
                 *
                 *
        *        *
 	    *        *
  	    *  *     *
        *  *     *
     *  *  *     *
     *  *  *     *  *
  	 *  *  *     *  *
    31 76 54 2 100 23
---------------------------------		    
*/
public class 이차원배열3_문제02_그래프세로 {


	public static void main(String[] args) {
		int scoreList[] = {31, 76, 54, 2, 100, 23};
		int [][] temp = new int[10][scoreList.length];
		int y = temp.length;
		int x = temp[0].length;
		for(int i = 0; i < x; i++) {
			int score = scoreList[i]/10; 	
			for(int j = 0; j < y - score; j++) {
				temp[j][i] = 1;
			}
		}
		for(int i = 0; i < temp.length; i++) {
			for(int j = 0; j < temp[i].length; j++) {
				if(temp[i][j] == 1) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
			//	System.out.print(temp[i][j]);
			}
			System.out.println();
		}		
	}
}
