package apiTest;

public class API_TEST {
	public static void main(String[] args) {
		Calc calc = new Calc();
		
		try {
			System.out.println(calc.div(10, 3));
		} catch (Exception e) {
			System.out.println("0으로 왜나줘 시발아");
		}
	}

}
