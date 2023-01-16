package codingTest;


import java.util.Arrays;
import java.util.Scanner;

import threadTest.Thread1;

//[실습]
//동석이네 동물원에는 3마리의 동물이 있다.
//각 동물은 울음 소리가 다르고 2마리의 동물은 동시에 운다.
//나머지 1마리 동물은 2마리 동물이 모두 울고 나서 마지막에 운다.
//
//package명은 threadTask으로 만들고 클래스는 2개만 선언한다.
//하나의 클래스에는 main 쓰레드가 있다.
//Runnable 인터페이스로 멀티 쓰레드를 구현하고 반드시 join()을 사용한다.
//※ 각 동물은 10번씩만 운다.
//
//
//- 주석을 작성하였는가
//- Thread의 name필드를 사용할 수 있는가
//- 배열을 사용하였는가
//- 클래스를 두 개 선언하였는가
//- 가산점 : 람다식을 사용하였는가, main 쓰레드를 사용하였는가

//------------------------------------------------------

//제한시간 : 1시간
		// 3개의 쓰레드가 있다.
		// Thread1, Thread2, Thread3
		// 사용자가 입력한 순서대로 각 알맞는 문자열이 출력된다. (배열을 써볼까) ?

		// 입력 예) 3 1 2 
		// 출력 예) third first second

		// 단, Thread들은 항상 1, 2, 3 순서로 실행되어야 한다.

		// Thread1 : third
		// Thread2 : first
		// Thread3 : second

		// 출력 시 쓰레드의 번호도 출력할 경우 가산점으로 처리한다.

public class ThreadMain {
	public static void main(String[] args) {
		ThreadTask task = new ThreadTask();
		Scanner sc = new Scanner(System.in);
		String num1 = "";
//		Thread1 thread1 = new Thread1();
//		Thread2 thread2 = new Thread2();
//		Thread3 thread3 = new Thread3();
		Thread[] arr = new Thread[3];
		
//		arr[0] = new Thread(task);
//		arr[1] = new Thread(task);
//		arr[2] = new Thread(task);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Thread(task);
		}
		
		
		System.out.println("숫자 입력");
		for (int i = 0; i < arr.length; i++) {
			num1 = sc.next();
			arr[i].setName(num1);
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].start();
			try {
				arr[i].join();
			} catch (InterruptedException e) {;}
		}
		
		
		
		
		
		
	}
}
