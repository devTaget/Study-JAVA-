package bank;

import java.util.Scanner;

public class BankTest {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Sinhan sinhan = new Sinhan();
		Kakao kakao  = new Kakao();
		KB kb = new KB();

//		bank.users[0][0] = new Sinhan[100];
//		bank.users[0] = new Sinhan[100];
//		bank.users[1] = new Kakao[100];
//		bank.users[2] = new KB[100];

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.���� ����\n2.�α���");
			int num = sc.nextInt();
//			String name = "";
			String password = "";
			int a = 0;
			if(num == 1) {
				System.out.print("������ : ");
				bank.name = sc.next();
				System.out.print("�ڵ��� : ");
				bank.phoneNumber = sc.next();
				System.out.print("��й�ȣ : ");
				bank.password = sc.next();
				System.out.println(
				" ������ �� : "+bank.name
				+" �ڵ�����ȣ : "+bank.phoneNumber
				+" ��й�ȣ : "+bank.password
				+" ���¹�ȣ : "+bank.account());
			}else if(num == 2) {
				System.out.println("���¹�ȣ");
				a = sc.nextInt();
				if(a == bank.accountNumber) {
					System.out.print("��й�ȣ �Է� : ");
					password = sc.next();
					if(password.equals(bank.password)) {
						System.out.println("1 �Ա��ϱ� 2 ����ϱ� 3 ������");
						num = sc.nextInt();
						
					}
				}
			}
			System.out.println();
		}
//				System.out.printf("��� : ");		
//				String password = sc.next();
//		if(kakao.password.equals(password)) {
//			System.out.println(kakao.money);
//		}else {
//			System.out.println("��й�ȣ�� Ȯ�����ּ���");
//		}
//	

	}
}
