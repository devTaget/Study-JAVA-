package classTest;

class A{
	int data;
	
	A(int data){
		System.out.println("�⺻ ������");
		this.data = data;
	}
	
	void printData() {
		System.out.println(data);
	}
}

public class ClassTest {
	public static void main(String[] args) {
		A a = new A(20);
		A a2 = new A(10);
		a.printData();
		a2.printData();
	}
}
