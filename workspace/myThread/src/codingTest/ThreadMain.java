package codingTest;


import java.util.Arrays;
import java.util.Scanner;

import threadTest.Thread1;

//[�ǽ�]
//�����̳� ���������� 3������ ������ �ִ�.
//�� ������ ���� �Ҹ��� �ٸ��� 2������ ������ ���ÿ� ���.
//������ 1���� ������ 2���� ������ ��� ��� ���� �������� ���.
//
//package���� threadTask���� ����� Ŭ������ 2���� �����Ѵ�.
//�ϳ��� Ŭ�������� main �����尡 �ִ�.
//Runnable �������̽��� ��Ƽ �����带 �����ϰ� �ݵ�� join()�� ����Ѵ�.
//�� �� ������ 10������ ���.
//
//
//- �ּ��� �ۼ��Ͽ��°�
//- Thread�� name�ʵ带 ����� �� �ִ°�
//- �迭�� ����Ͽ��°�
//- Ŭ������ �� �� �����Ͽ��°�
//- ������ : ���ٽ��� ����Ͽ��°�, main �����带 ����Ͽ��°�

//------------------------------------------------------

//���ѽð� : 1�ð�
		// 3���� �����尡 �ִ�.
		// Thread1, Thread2, Thread3
		// ����ڰ� �Է��� ������� �� �˸´� ���ڿ��� ��µȴ�. (�迭�� �Ẽ��) ?

		// �Է� ��) 3 1 2 
		// ��� ��) third first second

		// ��, Thread���� �׻� 1, 2, 3 ������ ����Ǿ�� �Ѵ�.

		// Thread1 : third
		// Thread2 : first
		// Thread3 : second

		// ��� �� �������� ��ȣ�� ����� ��� ���������� ó���Ѵ�.

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
		
		
		System.out.println("���� �Է�");
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
