package objectTest;

class Student {
   private int number;
   private String name;
   
   public Student() {;}

   public int getNumber() {
      return number;
   }

   public void setNumber(int number) {
      this.number = number;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return "Student [number=" + number + ", name=" + name + "]";
   }
   
   
   
   
   
   
}

public class ToStringTest {
   public static void main(String[] args) {
      Student �ѵ��� = new Student();
      
      �ѵ���.setNumber(1);
      �ѵ���.setName("�ѵ���");
      
      System.out.println(�ѵ���);
   }
}


















