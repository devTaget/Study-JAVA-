package controllStatement;

import java.util.Scanner;

public class ForTask {
   public static void main(String[] args) {
//      �����
//      1~100���� ���
//      for (int i = 0; i < 100; i++) {
//         System.out.println(i + 1);
//      }
//      100~1���� ���
//      for (int i = 0; i < 100; i++) {
//         System.out.println(100 - i);
//      }
//      1~100���� �� ¦���� ���
//      for (int i = 0; i < 50; i++) {
//         System.out.println((i + 1) * 2);
//      }
      
//      �ǹ�
//      1~10���� �� ���
//      int total = 0;
//      for (int i = 0; i < 10; i++) {
////         total = total + i + 1;
//         total += i + 1;
//      }
//      System.out.println(total);
      
//      1~n���� �� ���
//      Scanner sc = new Scanner(System.in);
//      String message = "1~n���� ��\nn: ";
//      int end = 0, total = 0;
//      System.out.print(message);
//      end = sc.nextInt();
//      
//      for (int i = 0; i < end; i++) {
//         total += i + 1;
//      }
//      System.out.println(total);
      
//      ���
//      A~F���� ���
//      for (int i = 0; i < 6; i++) {
//         System.out.println((char)(i + 65));
//      }
//      A~F���� �� C�����ϰ� ���
//      for (int i = 0; i < 5; i++) {
//         System.out.println((char)(i > 1 ? i + 66 : i + 65));
//      }
      
//      ���̾�
//      0 1 2 3 0 1 2 3 0 1 2 3 ���
//      for (int i = 0; i < 12; i++) {
//         System.out.print(i % 4 + " ");
//      }
      
//      aBcDeFgH...Z ���
      for (int i = 0; i < 26; i++) {
         System.out.print((char)(i % 2 == 0 ? i + 97 : i + 65));
      }
   }
}

























