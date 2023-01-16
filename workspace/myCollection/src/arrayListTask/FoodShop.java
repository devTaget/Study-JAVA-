package arrayListTask;

public class FoodShop {
	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();
		Food food = new Food();
		
		
		food.setKinds("중식");
		food.setFoodName("비빔밥");
		food.setFoodPrice(2000);
		
		//추가
		restaurant.foodAdd(food);
		//이름으로 종류 찾기
		System.out.println(restaurant.foodNameSelect("비빔밥"));
		//종류 의 음식조회
		System.out.println(restaurant.selectAll(food));
		//종류 수정하면 가격 10% 상승
		restaurant.priceRise(food, "일식");
		
		
		
	}
}
