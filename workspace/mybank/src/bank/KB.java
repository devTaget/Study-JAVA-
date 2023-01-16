package bank;

public class KB extends Bank{

	
	@Override
	int withdraw(int num) {
		this.money = this.money - num;
		return this.money / 2;
	}
	
	
	
}
