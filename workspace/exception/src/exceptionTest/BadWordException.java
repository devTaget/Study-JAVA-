package exceptionTest;


// Exception ��� : �����Ϸ��� üũ 
// RuntimeException ��� ��: �����Ϸ��� üũ���� ����
public class BadWordException extends Exception {
	public BadWordException(String message) {
		super(message);
		
	}
}
