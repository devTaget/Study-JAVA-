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
			System.out.println("1.계좌 개설\n2.로그인");
			int num = sc.nextInt();
//			String name = "";
			String password = "";
			int a = 0;
			if(num == 1) {
				System.out.print("예금주 : ");
				bank.name = sc.next();
				System.out.print("핸드폰 : ");
				bank.phoneNumber = sc.next();
				System.out.print("비밀번호 : ");
				bank.password = sc.next();
				System.out.println(
				" 예금자 명 : "+bank.name
				+" 핸드폰번호 : "+bank.phoneNumber
				+" 비밀번호 : "+bank.password
				+" 계좌번호 : "+bank.account());
			}else if(num == 2) {
				System.out.println("계좌번호");
				a = sc.nextInt();
				if(a == bank.accountNumber) {
					System.out.print("비밀번호 입력 : ");
					password = sc.next();
					if(password.equals(bank.password)) {
						System.out.println("1 입금하기 2 출금하기 3 나가기");
						num = sc.nextInt();
						
					}
				}
			}
			System.out.println();
		}
//				System.out.printf("비번 : ");		
//				String password = sc.next();
//		if(kakao.password.equals(password)) {
//			System.out.println(kakao.money);
//		}else {
//			System.out.println("비밀번호를 확인해주세요");
//		}
//	

	}
}
