package bank;

public class Kakao extends Bank {

	
	
	
	
	//ÀÜ¾×Á¶È¸
	@Override
	boolean moneyBalance(String password) {
		if(password.equals(this.password)) {
			this.money = this.money / 2;
			return true;
		}
		return false;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
