package ____�ڹ�����7_�����迭;
import java.util.Arrays;
/*
	1) seatList �� ���� ��ȭ�� ���Ż�Ȳ �̴�.
	2) seatIndex �� ���� �ҷ��� �¼� ��ȣ�̰�
	3) userList �� ȸ����ȣ�̴�  
	4) seatIndex �� user �� ������ ������ ��ü ���Ż�Ȳ ��� 
	5) �¼��� ��������� �����Ҽ��ִ�.
	6) �¼��� �̹� ���� �Ǿ������� 2���������� �Ѱ������� 
	7) [���� 1] �̹� ���ŵǾ�������, ȸ����ȣ�� ������ ������� 0���� ����
	8) [���� 2) �̹� ���ŵǾ��ְ� , ȸ����ȣ�� �ٸ��� "x" ��� 
	��) 1 , 1003 ==> ���� �Ǿ�������, 1003���� ���������Ƿ� ���� ��ҵȴ� 
     	==> seatList[] = {1003,0,0,0,1002,0,1001};		
	��) 1 , 1002 ==> ������ ������������Ƿ� ���� ����
    	==> seatList[] = {1003,1002,0,0,1002,0,1001};
	��) 4 , 1005 ==> ���� �Ǿ��ְ�, ȸ����ȣ�� �ٸ��� ==> "x"
 */
public class �迭6_����12_�¼���ұ�� {
	public static void main(String[] args) {
		int seatList[]  = {1003,1003,0,0,1002,0,1001};		
		int seatIndex[] = {1,1,4};
		int userList [] = {1003,1002,1005};		
		for(int i = 0; i < seatIndex.length; i++) {
			int index = seatIndex[i];
			if(seatList[index] == 0) {
				seatList[index] = userList[i];
				System.out.println(index + "�� �ڸ��� �����մϴ�.");
				System.out.println(Arrays.toString(seatList));
			}
			else if(seatList[index] == userList[i]) {
				seatList[index] = 0;
				System.out.println(index + "�� �ڸ��� ����մϴ�.");
				System.out.println(Arrays.toString(seatList));
			}
			else {
				System.out.println(index + "�� �ڸ��� ���ŵǾ��ֽ��ϴ�.");
				System.out.println(Arrays.toString(seatList));
			}
		}
	}
}
