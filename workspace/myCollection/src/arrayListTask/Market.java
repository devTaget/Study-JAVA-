package arrayListTask;

import java.util.ArrayList;

public class Market {
	ArrayList<Fruit> fruits = DB.fruits;
	Fruit fruit = new Fruit();
	
	
	
	//���� �߰�
	public void fruitAdd(Fruit fruit) {
		fruits.add(fruit);
	}
	
	
	//���� ����
	public void fruitDel(Fruit fruit) {
		for (int i = 0; i < fruits.size(); i++) {
			if(fruits.get(i).getFruitName().equals(fruit)) {
				fruits.remove(fruit);
			}
		}
		
	}
	
	//���� ��հ��� �˻�
	public void fruitPrice(Fruit fruit) {
		
	}
	
	//���� ���
	 private double getAverage() {
	      int total = 0;
	      
	      for (Fruit fruit : fruits) {
	         total += fruit.getPrice();
	      }
	      
	      return (double)total / fruits.size();
	   }

	
	
	
	//���� ��ü ��ȸ
	public ArrayList<Fruit> selectAll(){
		return fruits;
	}
	
	
	
	
	
	//���� �̸����� ������ȸ
	public static void  name() {
		
	}
	
	
	
	
	
	
	
	
	
	
}
