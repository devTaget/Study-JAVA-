package exceptionTest;

import java.util.Scanner;

public class Chatting {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String message = null;
			
			
			System.out.printf("메세지 : ");
			message = sc.nextLine();
			
			
			if(message.contains("바보")) {
						try {
							throw new BadWordException("바보 ?? 뒤질래?");
						} catch (BadWordException e) {
							System.out.println(e.getMessage());
						}
			}
			
			
			
			
			
			
		}

}
