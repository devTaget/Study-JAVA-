package castingTest;


class Car{
	
	void engineStart() {
		System.out.println("����� �õ� Ŵ");
	}
	
}

class SuperCar extends Car{

	@Override
	void engineStart() {
		System.out.println("�������� �õ� Ŵ");
	}
	
	void openRoof() {
		System.out.println("���� �ۻ�!!�Ѳ� ����");
	}
	
}


public class CastingTest {
	public static void main(String[] args) {
		Car matiz = new Car();
		SuperCar ferrari = new SuperCar();
//		up casting
		Car noOptionFerrari = new SuperCar();
//		SuperCar brokenFerrari = (SuperCar)new Car();
//		down casting
		SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;
		
//		matiz
		
		
		
		
		
	}
}
