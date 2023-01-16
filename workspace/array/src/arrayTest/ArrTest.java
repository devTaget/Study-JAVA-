package arrayTest;

public class ArrTest {

	public static void main(String[] args) {
		int[][] arrData = {{3,4,5,6},{8,9,0,9},{1,2,3,4}};
		int length = 0;
		
		
		for (int i = 0; i < arrData.length; i++) {
			length += arrData[i].length;
		}
		System.out.println(length);
	}

}
