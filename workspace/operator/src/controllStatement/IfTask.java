package controllStatement;

import java.util.Scanner;

public class IfTask {

	public static void main(String[] args) {
		
//		����ڿ��� �Ʒ��� �޴��� ����ϰ� 
//		��ȣ�� �Է¹޴´�
//		1. ������
//		2. ������
//		3. �����
//		4. ���
		
//		����ڰ� �Է��� ��ȣ�� ������ ����� ����Ѵ�.
		
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.������");
		System.out.println("2.������");
		System.out.println("3.�����");
		System.out.println("4.���");
		num = sc.nextInt();
		
		if (num == 1) {
			System.out.println("r");
		}else if(num == 2){
			System.out.println("b");
		}else if(num == 3) {
			System.out.println("y");
		}else if(num == 4) {
			System.out.println("w");
		}else {
			System.out.println("�������� �ʴ� ��ȣ�Դϴ�");
		}
	}

}
