package operTest;

import java.util.Scanner;

public class Oper4 {
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
	   
	   Scanner sc = new Scanner(System.in);
	   
	   int choice = 0;
	   String result = null;
	   
	   String color = "1. ������\n2. �����\n3. ������\n4. ���\n";
	   System.out.println(color);
	   choice = sc.nextInt();
	   
	   result = choice == 1 ? "������ : �Ұ��� �������̰� �������̴�.": 
		   choice == 2 ?  "����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�." :
			   choice == 3 ? "�����ϰ� ����ϰ� ��ö�ϰ� ������." : 
				   choice == 4 ?  "��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����." : "�ٽ� Ȯ���� �ּ���";
	   
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