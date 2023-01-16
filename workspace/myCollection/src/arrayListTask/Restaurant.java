package arrayListTask;

import java.util.ArrayList;

public class Restaurant {
	ArrayList<Food> foods = DB.foods;
	 
	private final double RATE = 1.1;
	
	
	
	// ���� �߰�
	public void foodAdd(Food food) {
		foods.add(food);
		System.out.println("�߰�");
	}

	// ���� �̸����� �������� ��ȸ
	public String foodNameSelect(String name) {
		for (Food food : foods) {
			if (food.foodName.equals(name)) {
				return food.kinds;
			}

		}
		return null;
	}

	// ����ڰ� ���ϴ� ������ ���� ��ü ��ȸ
	public ArrayList<String> selectAll(Food food) {
		ArrayList<String> all = new ArrayList<String>();
		for (int i = 0; i < foods.size(); i++) {
			if(foods.get(i).getKinds().equals(food.kinds)) {
				 all.add(foods.get(i).getFoodName());
			}
		}
		return all;
	}

	// ���� ���� ���� �� ���� 10% ���
	public void priceRise(Food food , String name) {
		food.setKinds(name);
		food.setFoodPrice((int)(food.getFoodPrice() * RATE));
	}

	// ����ڰ� ���ϴ� ������ ���� ���� ��ȸ
	public Food foodCount(Food food) {
	
		return food;
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
