package variableTest;

public class FormatTest {

	public static void main(String[] args) {
		String name = "김정표";
		int age = 20;
		double height = 123.56;
		System.out.printf("이름 : %s\n",name);
		System.out.printf("이름 : %d", 10+age);
		System.out.printf("이름 : %.1fkg", height);

	}

}
