package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
//		<?> : ���׸�
//		��üȭ �� Ÿ���� �����ϴ� ���
//		������ ������ Ÿ���� ������ �� ���� ������ �ӽ÷� Ÿ���� ������ �� ����Ѵ�.
//		���� �ٿ�ĳ������ �� �ʿ䰡������, ������ Ÿ�Կ� ������ �� �� �ִ�.
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
//		���� for �� (ForEach )
//		for(�ڷ��� ������ : ������ �ִ� ����){}
//		������ �ϳ��� ���� ������� ����.
		
		for (Integer integer : datas) {
			System.out.println(integer);
		};
		
		
		
		System.out.println("===============================");
		
//		�߰�(����)
//   	50 �ڿ� 500 ����
		if(datas.contains(50)) {
			System.out.println(datas + "50 �ڿ� 500 �߰�");
		}
		
		
//		���� 
//		90�� 9�� ����
//		if(datas.contains(90)) {
//			datas.set(Integer.valueOf(90), 9);
//			System.out.println(datas + "90�� 9�� ����");
//		}
		
//		����
//		80 ����
//		1. �ε����� ����
//		datas.remove(7);
//		System.out.println(datas + "80�� ����");
		
//		2. ������ ����
//		datas.remove(Integer.valueOf(9));
//		System.out.println(datas + "9��� ������ ����");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
