package bank;

import java.util.Random;

public class Bank {
	Bank[][] users =  new Bank[3][100];
	String name;	//���̸�
	int deposit;	 //�Ա�
	int withdraw;    //���
	int moneyBalance;  //�ܾ���ȸ
	int accountNumber; //���¹�ȣ
	String phoneNumber; //����ȣ
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
	
	
	//ȸ������
	
	
	//�α���
	boolean login(int account, String password) {
		if(this.accountNumber == account && this.password.equals(password)) {
			return true;
		}else {
			return false;
		}
	}
	 
	//���°���
	 int account() {
		 Random random = new Random();
		 this.accountNumber = random.nextInt(999999);
		 return this.accountNumber;
	 }
	 
	 	//�Ա�
		int deposit(int num) {
			this.money = this.money + num;
			
			return this.money;
			}
		
		//���
		int withdraw(int num) {
			this.money = this.money - num;
			
			return this.money;
			}
		
		//�ܾ���ȸ
		boolean moneyBalance(String password) {
			if(password.equals(this.password)) {
				return true;
			}
			return false;
			}
		
		//�� �ߺ��˻�
		boolean phoneNumberCheck(String phone){
			if(phone.equals(phoneNumber)) {
				return false;
			}
			return true;
		}
	
	
}
