package arrayListTask;

import java.util.Arrays;

public class Food {
	String foodName;
	int foodPrice;
	String kinds;
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
	public String getKinds() {
		return kinds;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	
	@Override
	public String toString() {
		return "Food [foodName=" + foodName + ", foodPrice=" + foodPrice + ", kinds=" + kinds + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
