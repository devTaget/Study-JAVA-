package classTest;

import java.util.Scanner;

public class ClassArray {
	public static void main(String[] args) {
		Shop shop = new Shop("����", 3000, 10);
		Customer[] customers = {
				new Customer("Tom", "01012341234", 50000, 10),
				new Customer("Jack", "01055556666", 100000, 50)
		};
		Scanner sc = new Scanner(System.in);
		int choice = 0, result = 0;
		
//		for (int i = 0; i < customers.length; i++) {
//			customers[i] = new Customer();
//		}
		
		System.out.println("� �մ����� �����Ͻðھ��?");
		System.out.println("1. Tom");
		System.out.println("2. Jack");
		choice = sc.nextInt();
		result = shop.sell(customers[choice - 1]);
		System.out.println("���� ����");
		System.out.println("��ǰ��: " + shop.name);
		System.out.println("��ǰ����: " + shop.price);
		System.out.println("������: " + customers[choice - 1].discount);
		System.out.println("���� ���� �ݾ�: " + result);
	}
}

















