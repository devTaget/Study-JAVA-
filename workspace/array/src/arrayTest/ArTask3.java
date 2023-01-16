package arrayTest;

import java.util.Scanner;

public class ArTask3 {
   public static void main(String[] args) {
      String[] arButton = {"btn1", "btn2", "btn3", "btn4"};
      String[] arMessage = {"ȸ������ ����", "�α��� ����", "�ѵ���(20)", "�α׾ƿ� ����"};
      String[] arError = {"ȸ�������� ���� �������ּ���.", "�α����� ���� �������ּ���"};
      String errorMessage = "�ٽ� �õ����ּ���", result = null;
      
      Scanner sc = new Scanner(System.in);
      int choice = 0, temp = 0;
      boolean condition = false;
      
      while(true) {
         for (int i = 0; i < arButton.length; i++) {
            System.out.println(i + 1 + "." + arButton[i]);
         }
         temp = choice;
         choice = sc.nextInt();
         condition = choice - 1 == temp;
         
         switch(choice) {
         case 1: case 4:
            result = arMessage[choice - 1];
            break;
         case 2: case 3:
            result = condition ? arMessage[choice - 1] : arError[choice - 2]; 
            if(!condition) { choice = 0; }
            break;
         default:
            result = errorMessage;
            break;
         }
         
         System.out.println(result);
         if(choice == 4) { break; }
      }
   }
}















