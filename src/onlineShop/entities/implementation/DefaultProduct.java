package onlineShop.entities.implementation;

public class DefaultProduct {
	
	private int id;
	private String productName;
	private String categoryName;
	private double price;
	
	public DefaultProduct() {
		
	}

	public DefaultProduct(int id, String productName, String categoryName, double price) {
		this.id = id;
		this.productName = productName;
		this.categoryName = categoryName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", categoryName=" + categoryName
				+ ", price=" + price + "]";
	}

	public int getId() {
		return id;
	}

	public String getProductName() {
		return productName;
	}

	
	
	
	
	
	

}
