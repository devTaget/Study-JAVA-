package methodTest;

public class MethodTest {
//	�� ������ ���� �޼ҵ� ����
	 int miltiple(int number, int number2){
		int result = number * number2;
		return result;
	}
	
//	static
//	 �����Ϸ��� ���� ���� �޸𸮿� �Ҵ����ش�.
//	 �Ϲ� �޼ҵ带 static �޼ҵ忡�� ����ϱ� ���ؼ��� �Ʒ��� �� ���� ����� �����Ѵ�.
//	 1. �Ϲ� �޼ҵ忡 static�� �ۼ��Ͽ� ���� �ð��뿡 �޸𸮷� �÷��ش�.
//	 2. �Ϲ� �޼ҵ��� �Ҽ��� �˷��ش�.
	 
	public static void main(String[] args) {
		MethodTest methodTest = new MethodTest();
		System.out.println(methodTest.miltiple(5, 3));
	}
	
	
}
