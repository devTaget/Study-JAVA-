package operTest;

import java.util.Scanner;

public class Oper3 {

	public static void main(String[] args) {
//		����ڿ��� Ű�� �Է¹ް�
//		������� ������ ���
//		�Ǽ���� �Ǽ��� ���
//		�� ) 183 -> 183 ���
//			183.5 ->183.5 ���
//		���� �����ڸ� ���!
		Scanner sc = new Scanner(System.in);

		double heigth = 0;
		String result = null;

		System.out.print("Ű �Է� : ");
		heigth = sc.nextDouble();

//		result = (heigth - (int)heigth  == 0 ? " "+ heigth : " "+heigth);
//		result = num == (int)num  ? (int)num : num;
//		   System.out.printf("%.1f",heigth);
//		result ���ٰ� �������� �ٷ� ������ Ÿ�ԽŰ�Ƚᵵ �ɰŰ��������̴�.
//		heigth - (int) heigth == 0 ? "%.0f" : "%.1f", heigth, heigth
		
		result = heigth - (int) heigth == 0 ? "%.0f" : "%.1f";

		System.out.printf(result,heigth);

		
//		 double height = 0.0;
//	      String message = "Ű: ";
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
