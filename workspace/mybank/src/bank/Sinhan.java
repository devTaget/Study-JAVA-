package bank;

public class Sinhan extends Bank {

	// �Ա�
	@Override
	int deposit(int num) {
		this.money = this.money + num;
		
		return this.money / 2;
	}

}
