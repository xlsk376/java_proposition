package ____�ڹ�����6_�����ݺ���;

import java.util.Random;

/*
	[����] 
		10 ~ 100������ ���� �������� �����ϰ� �������� ����� ū������ 4�� ���ʴ�� ����Ͻÿ�.
		���࿡ ����� ������ 4���� �ȵȴٸ� ���ڴ�� "x" �� ����Ͻÿ�.
	[����]
		14 : 14, 7, 2, 1
		13 : 13, 1 : 13�� ���� ����ǰ����� 4�����ȵǹǷ� ���ڸ� ����������� x �� ����Ͻÿ�.
	[��Ʈ]
		�ѹ��� �ذ��Ҽ� ����. 
		for�� ����Ͻÿ�.
 */
public class �ݺ���5_����05_for���ū�� {
	public static void main(String[] args) {
		Random ran = new Random();
		int r = ran.nextInt(91)+1;
		int count = 0;
		System.out.println("r : " + r);
		for(int i = r; i >= 1; i--) {
			if(r % i == 0) {
				count += 1;
			}
		}
		if(count >= 4) {
			for(int i = r; i >= 1; i--) {
				if(r % i == 0) {
					System.out.print(i + " ");
				}
			}
		}else {
			System.out.println("x");
		}
		

	}
}
