package ____�ڹ�����7_�����迭;
/*
	[�׽�Ʈ]	
	���� �ýô� 5 , 5 ��ġ�� �ִ�.
	dir �迭�� ������ ���ϰ� 0 , 1, 2 ,3 �� �� , �� , �� , ���� ���Ѵ�. 	
	speed �迭�� �ӵ��� ���Ѵ�.	
	dir �� speed �迭�� �ýð� �Ź��̵��� ������ ����Ѱ��̴�. 	
	��) ó���� dir �� 0 �̴� ������ ���Ѵ�. 
	   speed �� 4 �̹Ƿ�, y�� 4������  x : 5 , y : 9 ���ȴ�.  	   
	   �ι�°�� dir �� 2 �̴� ���� ���ϰ�, speed �� 2 �̹Ƿ� 
	   y �� 2������  x : 5 , y : 7 �̵ȴ�.    
	   6�� ��� �̵����� �ý��� ��ġ�� ����Ͻÿ�. 	
*/
public class �迭7_����02_�迭�ý� {
	public static void main(String[] args) {
		int speed[] = {4,2,1,5,4,2};
		int   dir[] = {0,1,3,2,2,1};
		int x = 5;
		int y = 5;
		System.out.println("ó�� ��ġ : "+x + " " + y);
		for(int i = 0; i < 6; i++) {
			if(dir[i] == 0) { // ��
				y += speed[i];
			}else if(dir[i] == 1) { // �� 
				x += speed[i];
			}else if(dir[i] == 2) { // ��
				y -= speed[i];
			}else if(dir[i] == 3) { // ��
				x -= speed[i];
			}
			System.out.println("�̵� ��� : "+x + " " + y);
		}
		
		
	}
}
