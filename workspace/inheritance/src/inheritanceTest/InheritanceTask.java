package inheritanceTest;

class Car {
	String brand;
	String color;
	int price;
	
	public Car() {;}
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart() {
		System.out.println("����� �õ� Ŵ");
	}
	
	void engineStop() {
		System.out.println("����� �õ� ��");
	}
}

class SuperCar extends Car{
	String mode;

	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}
	
//	����ī�� �������� �õ��� �Ѱ� �� �� �ִ�.
	@Override
	void engineStart() {
		super.engineStart();
		System.out.println("�������� �õ� �ѱ�");
	}
	
	@Override
	void engineStop() {
		System.out.println("�������� �õ� ����");
	}
}

public class InheritanceTask {
	public static void main(String[] args) {
		SuperCar ferrari = new SuperCar("Ferrari", "Red", 55000, "Sport");
		ferrari.engineStart();
		ferrari.engineStop();
	}
}







