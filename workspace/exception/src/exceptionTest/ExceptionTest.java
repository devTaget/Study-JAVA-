package exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
			System.out.println("���� ����");
		} catch (ArithmeticException e) {
//			e.printStackTrace(); //�����ϴ� ģ��
//			System.out.println(e.getMessage()); // �����޽����� ���
			System.out.println("�������� ��ž� �������� ?");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	 
	}
}
