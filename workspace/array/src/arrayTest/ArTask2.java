package arrayTest;

import java.util.Scanner;

public class ArTask2 {

	public static void main(String[] args) {
//		�� ��ư�� ������ �� , �̵��ϴ� �������� ������ ����.
		
//		"btn1" : ȸ������ ������
//		"btn2" : �α��� ������
//		"btn3" : ���� ������
		
//		ȸ������ -> �α��� -> ����������
//		�� ������� �Է��ؾ� �ϸ�, ���� ���� �ܰ踦 �����ϱ� ���� ���� �ܰ� ��ư�� �������, ���� �ܰ迡 ���� �޼����� ������ش�.
//		��) �α��� Ŭ�� ��, "ȸ�������� ���� �������ּ���" ���
		
//		�˸��� �ܰ��� ��ư�� ������, �ش� �ܰ迡 ���� �޼����� ������ش�.
//		��) ȸ������ Ŭ�� ��, ȸ������ ����
//			���������� Ŭ�� ��, ���� �̸��� ���� ���.
		Scanner sc = new Scanner(System.in);
		String[] arBtn = {"btn1","btn2","btn3"};
		int[] arData = null;
		int num = 0;
		String msg ="1.ȸ������\n2.�α���\n3.����������\n0.������";
		String[] error = {"ȸ�������� �������ּ���","�α��� �� �̿밡���մϴ�","��ȣ�� �ٽ� Ȯ�����ּ���"};
		String[] join = {"�̸��� ���� �Է����ּ���"};
		String[] login = {"�α��� ����"};
		String[] mypage = new String[2];
		String[] info = {"�̸� : ","���� : "};
		int[] check = new int[3];
		
//		System.out.println(msg);
//		num = sc.nextInt();
		while(true) {
			System.out.println(msg);
			num = sc.nextInt();
			if(num == 1) {
				check[0] = 1;
				System.out.println(join[0]);
				mypage[0] = sc.next();
				mypage[1] = sc.next();
				System.out.println("ȸ������ ����");
			}else if(num == 2) {
				if(check[0] != 1) {
					System.out.println(error[0]);
					continue;
				}
				check[1] = 2;
				System.out.println(login[0]);
			}else if(num == 3) {
				if(check[1] != 2) {
					System.out.println(error[1]);
					continue;
				}
				System.out.printf(info[0] + mypage[0]+"\n");
				System.out.printf(info[1] + mypage[1]+"\n");
			}else if(num == 0) {
				System.out.println("�����մϴ�");
				break;
			}else {
				System.out.println(error[2]);
			}
				
		}
				

	}

}
