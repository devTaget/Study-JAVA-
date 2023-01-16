package objectTest;

public class HashCodeTest {
	public static void main(String[] args) {
		String data = "ABC";
		String data2 = "ABC";
		
		System.out.println(data);
		System.out.println(data2);
		System.out.println(data.toString());
		System.out.println(data.hashCode());
		System.out.println(data2.hashCode());
		System.out.println(data2);
		
		
	}
	
	

}
