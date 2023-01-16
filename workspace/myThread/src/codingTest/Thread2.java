package codingTest;

public class Thread2 implements Runnable {
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("1")) {
			System.out.println("first");
		}else if(Thread.currentThread().getName().equals("2")) {
			System.out.println("second");
		}else if(Thread.currentThread().getName().equals("3")) {
			System.out.println("third");
		}
	}
}
