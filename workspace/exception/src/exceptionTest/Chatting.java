package exceptionTest;

import java.util.Scanner;

public class Chatting {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String message = null;
			
			
			System.out.printf("�޼��� : ");
			message = sc.nextLine();
			
			
			if(message.contains("�ٺ�")) {
						try {
							throw new BadWordException("�ٺ� ?? ������?");
						} catch (BadWordException e) {
							System.out.println(e.getMessage());
						}
			}
			
			
			
			
			
			
		}

}
