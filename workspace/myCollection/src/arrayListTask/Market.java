package arrayListTask;

import java.util.ArrayList;

public class Market {
	ArrayList<Fruit> fruits = DB.fruits;
	Fruit fruit = new Fruit();
	
	
	
	//과일 추가
	public void fruitAdd(Fruit fruit) {
		fruits.add(fruit);
	}
	
	
	//과일 삭제
	public void fruitDel(Fruit fruit) {
		for (int i = 0; i < fruits.size(); i++) {
			if(fruits.get(i).getFruitName().equals(fruit)) {
				fruits.remove(fruit);
			}
		}
		
	}
	
	//과일 평균가격 검사
	public void fruitPrice(Fruit fruit) {
		
	}
	
	//가격 평균
	 private double getAverage() {
	      int total = 0;
	      
	      for (Fruit fruit : fruits) {
	         total += fruit.getPrice();
	      }
	      
	      return (double)total / fruits.size();
	   }

	
	
	
	//과일 전체 조회
	public ArrayList<Fruit> selectAll(){
		return fruits;
	}
	
	
	
	
	
	//과일 이름으로 가격조회
	public static void  name() {
		
	}
	
	
	
	
	
	
	
	
	
	
}
