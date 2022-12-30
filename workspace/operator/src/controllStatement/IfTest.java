package controllStatement;


import java.util.Scanner;

public class IfTest {

   public static void main(String[] args) {
//      두 정수 대소비교
      int firstNumber = 0, lastNumber = 0;
      String message = "정수 두 개를 입력하세요", result = null;
      
      
      Scanner sc = new Scanner(System.in);

      System.out.println(message);
      firstNumber = sc.nextInt();
      lastNumber = sc.nextInt();

      
      if (firstNumber > lastNumber) {
		result = "큰값" + firstNumber;
	}else if(firstNumber != lastNumber) {
		result = "큰값" + firstNumber;
	}else {
		result = "둘다 같음요 ㅋ";
	}
      
      System.out.println(result);

      
   }

}

