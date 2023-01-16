package bank;

import java.util.Random;

public class Bank {
	Bank[][] users =  new Bank[3][100];
	String name;	//고객이름
	int deposit;	 //입금
	int withdraw;    //출금
	int moneyBalance;  //잔액조회
	int accountNumber; //계좌번호
	String phoneNumber; //폰번호
	boolean check;
	int count;
	int money;
	String password = "1";
	
	
	public Bank() {;}
	
	public Bank(String name, int deposit, int withdraw, int moneyBalance, int accountNumber, String phoneNumber,
			boolean check) {
		super();
		this.name = name;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.moneyBalance = moneyBalance;
		this.accountNumber = accountNumber;
		this.phoneNumber = phoneNumber;
		this.check = check;
	}  
	
//	 void withdraw(Bank bank) {
//		 if(bank instanceof Kakao) {
//			 Kakao kakao = (Kakao)bank;
//			 
//		 }else if(bank instanceof Kakao) {
//			 KB kb = (KB)bank;
//			 
//		 }else if(bank instanceof Kakao) {
//			 Sinhan sh = (Sinhan)bank;
//			 
//		 }
//	 }
	
	
	//회원가입
	
	
	//로그인
	boolean login(int account, String password) {
		if(this.accountNumber == account && this.password.equals(password)) {
			return true;
		}else {
			return false;
		}
	}
	 
	//계좌개설
	 int account() {
		 Random random = new Random();
		 this.accountNumber = random.nextInt(999999);
		 return this.accountNumber;
	 }
	 
	 	//입금
		int deposit(int num) {
			this.money = this.money + num;
			
			return this.money;
			}
		
		//출금
		int withdraw(int num) {
			this.money = this.money - num;
			
			return this.money;
			}
		
		//잔액조회
		boolean moneyBalance(String password) {
			if(password.equals(this.password)) {
				return true;
			}
			return false;
			}
		
		//폰 중복검사
		boolean phoneNumberCheck(String phone){
			if(phone.equals(phoneNumber)) {
				return false;
			}
			return true;
		}
	
	
}
