package anonymous;

public class Computer {
	public static void main(String[] args) {
		Game game = new Game() {
//			�������̽��� �������� ���� �ʵ尡 �����ϱ� ������,
//			�͸� Ŭ������������ �������̽��� �����Ͽ� ������Ų��.
//			������ �͸� Ŭ������ �ʵ尡 �޸𸮿� �Ҵ�� �� �������̽� Ÿ����
//			��ü�� up casting�� �ȴ�.
			
			@Override
			public void play() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void exit() {
				// TODO Auto-generated method stub
				
			}
			
		};
		game.exit();
	}
}
