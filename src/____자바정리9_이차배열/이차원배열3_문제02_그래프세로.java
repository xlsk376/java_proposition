package ____�ڹ�����9_�����迭;
/*  
scoreList[] = {31, 76, 54, 2, 100, 23};
�� �����ʹ� �л� 6���� �����̴�.		
�� �����͸� �׷����� ǥ���غ������Ѵ�.
	ǥ�ô� 10�� �ڸ����ڷ� ǥ���ؼ� ������ŭ  * �� ����ҷ����Ѵ�.
	������ ���ʿ��� ���������� ǥ�������� �̹��� �Ʒ��� ���� ǥ���ҷ����Ѵ�.		
  
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
public class �������迭3_����02_�׷������� {


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
