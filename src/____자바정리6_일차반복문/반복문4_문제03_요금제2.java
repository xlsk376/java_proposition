package ____�ڹ�����6_�����ݺ���;
/*
	[����]
		�Ʒ��Ͱ��� �޴������� �ִ� 
	  	B�� �����Ұ�� A���� �� �������̵ɷ���,
	  	��ȭ�ð��� ���̻� ����ؾߵǴ��� �ʷα��Ͻÿ�.
	[�����]
	  	A����� : �⺻��� 17500�� + �ʴ� 5�� 
	  	B����� : �⺻��� 31000�� + �ʴ� 2��
	[����]
		4501��
 */	
public class �ݺ���4_����03_�����2 {
	public static void main(String[] args) {		
		int b�⺻ = 31000;
		int a�⺻ = 17500;
		int a = 5;
		int b = 2;		
		int �� = 0;
		int a�߰���� = 0;
		int b�߰���� = 0;
		boolean run = true;
		while(run) {
			//System.out.println((a�⺻ + a�߰����) + " " + (b�⺻ + b�߰����));
			if(a�⺻ + a�߰���� > b�⺻ + b�߰����) {
				System.out.println(�� + "��");
				run = false;
			}else {
				a�߰���� += a;
				b�߰���� += b;
				�� += 1;
			}			
		}
	}
}
