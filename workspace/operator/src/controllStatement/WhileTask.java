package controllStatement;

import java.util.Scanner;

public class WhileTask {
   public static void main(String[] args) {

//      �ɸ� �׽�Ʈ
      /*
       * Q. ����� �����ϴ� ���� �����ϼ���.
       * 1. ������
       * 2. �����
       * 3. ������
       * 4. ���
       * 
       * ������ : �Ұ��� �������̰� �������̴�.
       * ����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.
       * ������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.
       * ��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.
       * 
       */
      String message = "Q. ����� �����ϴ� ���� �����ϼ���.";
      String choiceMessage = "1.������\n2.�����\n3.������\n4.���\n5.������";
      String redMessage = "�Ұ��� �������̰� �������̴�."; 
      String yellowMessage = "�߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�."; 
      String blackMessage = "�����ϰ� ����ϰ� ��ö�ϰ� ������."; 
      String whiteMessage = "õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.";
      String goodByeMessage = "�����մϴ�.";
      String errorMessage = "�ٽ� �Է����ּ���.";
      String result = null;
      Scanner sc = new Scanner(System.in);
      int choice = 0;
      
      while(true) {
         System.out.println(message + "\n" + choiceMessage);
         choice = sc.nextInt();
         
         switch(choice) {
         case 1:
            result = redMessage;
            break;
         case 2:
            result = yellowMessage;
            break;
         case 3:
            result = blackMessage;
            break;
         case 4:
            result = whiteMessage;
            break;
         case 5:
            result = goodByeMessage;
            break;
         default:
            result = errorMessage;
            break;
         }
         
         System.out.println(result);
         if(choice == 5) {
            break;
         }
      }
   
   }
}