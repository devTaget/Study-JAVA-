package exitTest;

public class ThreadTest implements Runnable {
   public static boolean isExit;
   
   @Override
   public void run() {
      int count = 0;
      System.out.println(count);
      while(true) {
         System.out.println("������...");
         if(Thread.interrupted()) {
            System.out.println("InterruptedException���� ����");
            break;
         }
//         if (++count == 5) {
//            synchronized (this) {
//               try {count = 0; System.out.println(count); wait();} catch (InterruptedException e) {System.out.println("Exception���� ������ ����"); break;}
//            }
//         }
//         try {Thread.sleep(1000);} catch (InterruptedException e) {System.out.println("Exception���� ������ ����"); break;}
//         if(isExit) {System.out.println("static �ʵ�� ������ ����"); break;}
      }
   }
}