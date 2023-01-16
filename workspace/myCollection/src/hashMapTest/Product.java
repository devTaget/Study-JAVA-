package hashMapTest;

public class Product {
	private int number;
	private String productName;
	private int price;
	private int stock;

	
	
	public Product() {;}
	
	
	
	public Product(int number, String productName, int price, int stock) {
		super();
		this.number = number;
		this.productName = productName;
		this.price = price;
		this.stock = stock;
	}



	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Product [number=" + number + ", productName=" + productName + ", price=" + price + ", stock=" + stock
				+ "]";
	}
	
	

}
