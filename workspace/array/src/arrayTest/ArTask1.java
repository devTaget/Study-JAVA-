package arrayTest;

import java.util.Scanner;

public class ArTask1 {
   public static void main(String[] args) {
//      �����
//      1~10���� �迭�� ��� ���
//      int[] arData = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//      int[] arData = new int[10];
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i + 1; 
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }
      
//      10~1���� �� ¦���� �迭�� ��� ���
//      int[] arData = new int[5];
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = 10 - i * 2;
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }
      
//      1~100���� �迭�� ���� �� Ȧ���� ���
//      int[] arData = new int[100];
      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i + 1;
//         if(arData[i] % 2 == 0) {continue;}
//         System.out.println(arData[i]);
//         if(arData[i] % 2 == 1) {
//            System.out.println(arData[i]);
//         }
//      }
      
//      �ǹ�
//      1~100���� �迭�� ���� �� ¦���� �� ���
//      int[] arData = new int[100];
//      int total = 0;
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i + 1;
//         if(arData[i] % 2 == 0) {
//            total += arData[i];
//         }
//      }
//      
//      System.out.println(total);
      
      
//      A~F���� �迭�� ��� ���
//      char[] arData = new char[6];
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = (char)(i + 65);
//         System.out.println(arData[i]);
//      }
//      for (char i = 'A'; i < 'G'; i ++) {
//         arData[i - 65] = i;
//         System.out.println(arData[i - 65]);
//      }
      
//      A~F���� �� C�����ϰ� �迭�� ���� �� ���
//      char[] arData = new char[5];
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = (char)(i > 1 ? i + 66 : i + 65);
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }
      
//      ���
//      5���� ������ �Է¹ް� �迭�� ���� �� �ִ밪�� �ּҰ� ���
//      Scanner sc = new Scanner(System.in);
//      String message = "5���� ������ �Է��ϼ���\n��)1 3 4 5 6";
//      int[] arData = new int[5];
//      int max = 0, min = 0;
//      
//      System.out.println(message);
////      ����ڰ� �Է��� ������ �迭�� ����ش�.
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = sc.nextInt();
//      }
//      
////      ù ��°�� �Է¹��� ���� max�� min�� ���� ����ش�.
//      max = arData[0];
//      min = arData[0];
//      
//      for (int i = 1; i < arData.length; i++) {
////         ���� max�� ��� ������ �� ū ���� �ִٸ�, �� ���� max�� ����ش�.
//         if(max < arData[i]) {max = arData[i];}
////         ���� min�� ��� ������ �� ���� ���� �ִٸ�, �� ���� min�� ����ش�.
//         if(min > arData[i]) {min = arData[i];}
//      }
//      
//      System.out.println("�ִ밪 : " + max);
//      System.out.println("�ּҰ� : " + min);
//      
//      ���̾�
//      ����ڰ� �Է��� ������ ������ŭ �迭�� ���� �� ������ �Է¹ް� ��� ���ϱ�
      int[] arData = null;
      Scanner sc = new Scanner(System.in);
      String message = "�� ���� ������ �Է��Ͻðھ��?";
      int total = 0;
      double average = 0.0;
      
      System.out.println(message);
      
      arData = new int[sc.nextInt()];
      
      for (int i = 0; i < arData.length; i++) {
         System.out.print(i + 1 + "��° ���� : ");
         arData[i] = sc.nextInt();
         total += arData[i];
      }
      
      average = (double)total / arData.length;
      
      System.out.println("��� : " + average);
   }
}





