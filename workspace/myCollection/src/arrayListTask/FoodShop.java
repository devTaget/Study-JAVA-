package arrayListTask;

public class FoodShop {
	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();
		Food food = new Food();
		
		
		food.setKinds("�߽�");
		food.setFoodName("�����");
		food.setFoodPrice(2000);
		
		//�߰�
		restaurant.foodAdd(food);
		//�̸����� ���� ã��
		System.out.println(restaurant.foodNameSelect("�����"));
		//���� �� ������ȸ
		System.out.println(restaurant.selectAll(food));
		//���� �����ϸ� ���� 10% ���
		restaurant.priceRise(food, "�Ͻ�");
		
		
		
	}
}
