package inheritanceTest;

class A {
	String name = "A";
	int data = 10;
	
	public A() {
		System.out.println("�θ� ������ ȣ��");
	}
	
	void printName() {
		System.out.println(name);
	}
}

class B extends A{
	
	public B() {
		super();
		System.out.println("�ڽ� ������ ȣ��");
	}
	
	void printData() {
		System.out.println(data);
	}
}

public class InheritanceTest1 {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b);
		b.name = "B";
		b.printName();
		b.printData();
	}
}












