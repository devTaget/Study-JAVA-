package controllStatement;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		String message = "1.요금조회\n2.통신사 이동\n3.기기 변경\n0.상담원 연걸";
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		while(true) {
			System.out.println(message);
			choice = sc.nextInt();
			if(choice == 0) {
				break;
			}
		}
	}

}
