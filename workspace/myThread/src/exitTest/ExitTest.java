package exitTest;

import javax.swing.JOptionPane;

public class ExitTest {
   public static void main(String[] args) {
      ThreadTest threadTest = new ThreadTest();
      Thread thread = new Thread(threadTest);
      
      String[] buttons = {"������", "���ϱ�"};
      
      thread.start();
      while(true) {
         int choice = JOptionPane.showOptionDialog(null, "", "������ ����", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, buttons, null);
         
         if(choice == 0) {
//            ThreadTest.isExit = true;
            thread.interrupt();
//            break;
            System.exit(0);
         }else {
            synchronized (threadTest) {
               threadTest.notify();
            }
         }
      }
   }
}