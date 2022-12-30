package operTest;

import java.util.Scanner;

public class Oper3 {

	public static void main(String[] args) {
//		사용자에게 키를 입력받고
//		정수라면 정수로 출력
//		실수라면 실수로 출력
//		예 ) 183 -> 183 출력
//			183.5 ->183.5 출력
//		삼함 연산자를 사용!
		Scanner sc = new Scanner(System.in);

		double heigth = 0;
		String result = null;

		System.out.print("키 입력 : ");
		heigth = sc.nextDouble();

//		result = (heigth - (int)heigth  == 0 ? " "+ heigth : " "+heigth);
//		result = num == (int)num  ? (int)num : num;
//		   System.out.printf("%.1f",heigth);
//		result 에다가 담지말고 바로 담으면 타입신경안써도 될거같은느낌이다.
//		heigth - (int) heigth == 0 ? "%.0f" : "%.1f", heigth, heigth
		
		result = heigth - (int) heigth == 0 ? "%.0f" : "%.1f";

		System.out.printf(result,heigth);

		
//		 double height = 0.0;
//	      String message = "키: ";
//	      Scanner sc = new Scanner(System.in);
//	      boolean check = false;
//	      String format = null;
//	      String forLength = "";
//	      int length = 0;
//	      
//	      System.out.print(message);
//	      height = sc.nextDouble();
//	      check = height - (int)height == 0;
//	      forLength = height - (int)height + "";
//	      
//	      length = forLength.length() > 8 ? 8 : forLength.length();
//	      
//	      format = check ? "%.0fcm" : "%." + (length - 2) + "fcm";
//	      System.out.printf(format, height); 

	}

}
