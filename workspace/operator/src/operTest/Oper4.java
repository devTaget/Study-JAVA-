package operTest;

import java.util.Scanner;

public class Oper4 {
   public static void main(String[] args) {
//      심리 테스트
      /*
       * Q. 당신이 좋아하는 색을 선택하세요.
       * 1. 빨간색
       * 2. 노란색
       * 3. 검은색
       * 4. 흰색
       * 
       * 빨간색 : 불같고 열정적이고 적극적이다.
       * 노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
       * 검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
       * 흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
       * 
       */
	   
	   Scanner sc = new Scanner(System.in);
	   
	   int choice = 0;
	   String result = null;
	   
	   String color = "1. 빨간색\n2. 노란색\n3. 검은색\n4. 흰색\n";
	   System.out.println(color);
	   choice = sc.nextInt();
	   
	   result = choice == 1 ? "빨간색 : 불같고 열정적이고 적극적이다.": 
		   choice == 2 ?  "노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다." :
			   choice == 3 ? "묵묵하고 든든하고 냉철하고 멋지다." : 
				   choice == 4 ?  "흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다." : "다시 확인해 주세요";
	   
	   System.out.println(result);
	   
//	     switch(choice) {
//	      case 1:
//	         result = redMessage;
//	         break;
//	      case 2:
//	         result = yellowMessage;
//	         break;
//	      case 3:
//	         result = blackMessage;
//	         break;
//	      case 4:
//	         result = whiteMessage;
//	         break;
//	      default:
//	         result = errorMessage;
//	         break;
//	      }
	   
	   
	   int money = 10000;
	   
	   for (int i = 0; i < 10; i++) {
		   money -=  1000;
		System.out.println(money);
	}

	   
	   
	   
	   
	   
   }
}