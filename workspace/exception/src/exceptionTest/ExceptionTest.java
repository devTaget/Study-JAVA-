package exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
			System.out.println("연산 성공");
		} catch (ArithmeticException e) {
//			e.printStackTrace(); //검증하는 친구
//			System.out.println(e.getMessage()); // 오류메시지만 출력
			System.out.println("생각을해 븅신아 나눠지냐 ?");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	 
	}
}
