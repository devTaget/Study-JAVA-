package controllStatement;

import java.util.Scanner;

public class IfTask {

	public static void main(String[] args) {
		
//		사용자에게 아래의 메뉴를 출력하고 
//		번호를 입력받는다
//		1. 빨간색
//		2. 검은색
//		3. 노란색
//		4. 흰색
		
//		사용자가 입력한 번호의 색상을 영어로 출력한다.
		
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.빨간색");
		System.out.println("2.검은색");
		System.out.println("3.노란색");
		System.out.println("4.흰색");
		num = sc.nextInt();
		
		if (num == 1) {
			System.out.println("r");
		}else if(num == 2){
			System.out.println("b");
		}else if(num == 3) {
			System.out.println("y");
		}else if(num == 4) {
			System.out.println("w");
		}else {
			System.out.println("존재하지 않는 번호입니다");
		}
	}

}
