package bank;

public class Kakao extends Bank {

	
	
	
	
	//�ܾ���ȸ
	@Override
	boolean moneyBalance(String password) {
		if(password.equals(this.password)) {
			this.money = this.money / 2;
			return true;
		}
		return false;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
