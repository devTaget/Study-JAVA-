package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
//		<?> : 제네릭
//		객체화 시 타입을 지정하는 기법
//		설계할 때에는 타입을 지정할 수 없기 때문에 임시로 타입을 선언할 때 사용한다.
//		따로 다운캐스팅을 할 필요가없으면, 지정할 타입에 제한을 줄 수 있다.
		ArrayList<Integer> datas = new ArrayList<>(); 
		final int SIZE = 9;
		
		
//		C
		for (int i = 0; i < SIZE; i++) {
			if(i > 4) {
				datas.add((14 - i) * 10);
				System.out.println(datas.size());
				continue;
			}
			datas.add((i + 1) * 10);
			System.out.println(datas.size());
		}
		
		
		
//		R
		for (int i = 0; i < datas.size(); i++) {
			System.out.println(datas.get(i));
		}
//		빠른 for 문 (ForEach )
//		for(자료형 변수명 : 순서가 있는 무언가){}
//		변수에 하나씩 값이 순서대로 들어간다.
		
		for (Integer integer : datas) {
			System.out.println(integer);
		};
		
		
		
		System.out.println("===============================");
		
//		추가(삽입)
//   	50 뒤에 500 삽입
		if(datas.contains(50)) {
			System.out.println(datas + "50 뒤에 500 추가");
		}
		
		
//		수정 
//		90을 9로 수정
//		if(datas.contains(90)) {
//			datas.set(Integer.valueOf(90), 9);
//			System.out.println(datas + "90을 9로 수정");
//		}
		
//		삭제
//		80 삭제
//		1. 인덱스로 삭제
//		datas.remove(7);
//		System.out.println(datas + "80을 삭제");
		
//		2. 값으로 삭제
//		datas.remove(Integer.valueOf(9));
//		System.out.println(datas + "9라는 값으로 삭제");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
