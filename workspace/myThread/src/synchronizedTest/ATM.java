package synchronizedTest;

public class ATM implements Runnable{
   public int money;
   
   public ATM() {this(10000);}

   public ATM(int money) {
      super();
      this.money = money;
   }
   
   @Override
   public void run() {
      synchronized (this) {
		for (int i = 0; i < 5; i++) {
			withdraw(1000);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				;
			}
		}
	}
   }
   
	public /* synchronized */ void withdraw(int money) {
//      synchronized (this) {
		this.money -= money;
		System.out.println(Thread.currentThread().getName() + "��(��) " + money + "�� ���");
		System.out.println("���� �ܾ� : " + this.money + "��");
//	}
   }
}










