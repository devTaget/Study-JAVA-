package codingTest;


public class ThreadTask  implements Runnable   {
		int a;
		// ���ѽð� : 1�ð�
		// 3���� �����尡 �ִ�.
		// Thread1, Thread2, Thread3
		// ����ڰ� �Է��� ������� �� �˸´� ���ڿ��� ��µȴ�.

		// �Է� ��) 3 1 2
		// ��� ��) third first second

		// ��, Thread���� �׻� 1, 2, 3 ������ ����Ǿ�� �Ѵ�.

		// Thread1 : third
		// Thread2 : first
		// Thread3 : second

		// ��� �� �������� ��ȣ�� ����� ��� ���������� ó���Ѵ�.
		
		public ThreadTask() {;}
		
		
		
		public void printFirst(Runnable first) {
			first.run(); // ���� ����
		}

		public void printSecond(Runnable second) {
			second.run(); // ���� ����
		}

		public void printThird(Runnable third) {
			third.run(); // ���� ����
		}
		
		
		@Override
		public void run() {
			if(Thread.currentThread().getName().equals("1")) {
				++a;
				printFirst(()->System.out.println("Thread : "+ a +"first"));
			}else if(Thread.currentThread().getName().equals("2")) {
				++a;
				printSecond(()->System.out.println("Thread : " + a +"second"));
			}else if(Thread.currentThread().getName().equals("3")) {
				++a;
				printThird(()->System.out.println("Thread : " + a +"third"));
			}
		}
		
		
		
		
		
		
		
		
	}






	
	
	
	
	
