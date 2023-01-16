package arrayListTask;

import java.util.ArrayList;

public class Restaurant {
	ArrayList<Food> foods = DB.foods;
	 
	private final double RATE = 1.1;
	
	
	
	// 음식 추가
	public void foodAdd(Food food) {
		foods.add(food);
		System.out.println("추가");
	}

	// 음식 이름으로 음식종류 조회
	public String foodNameSelect(String name) {
		for (Food food : foods) {
			if (food.foodName.equals(name)) {
				return food.kinds;
			}

		}
		return null;
	}

	// 사용자가 원하는 종류의 음식 전체 조회
	public ArrayList<String> selectAll(Food food) {
		ArrayList<String> all = new ArrayList<String>();
		for (int i = 0; i < foods.size(); i++) {
			if(foods.get(i).getKinds().equals(food.kinds)) {
				 all.add(foods.get(i).getFoodName());
			}
		}
		return all;
	}

	// 음식 종류 수정 후 가격 10% 상승
	public void priceRise(Food food , String name) {
		food.setKinds(name);
		food.setFoodPrice((int)(food.getFoodPrice() * RATE));
	}

	// 사용자가 원하는 종류의 음식 갯수 조회
	public Food foodCount(Food food) {
	
		return food;
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
