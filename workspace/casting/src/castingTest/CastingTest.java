package castingTest;


class Car{
	
	void engineStart() {
		System.out.println("¿­¼è·Î ½Ãµ¿ Å´");
	}
	
}

class SuperCar extends Car{

	@Override
	void engineStart() {
		System.out.println("À½¼ºÀ¸·Î ½Ãµ¿ Å´");
	}
	
	void openRoof() {
		System.out.println("°£Áö ÀÛ»ì!!¶Ñ²± ¿ÀÇÂ");
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
