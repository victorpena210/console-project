package onlineShop.entities.implementations;

import onlineShop.entities.Cart;
import onlineShop.entities.Product;

public class DefaultCart implements Cart {
	
	private static final int Default_Product_Capacity = 10;
	private Product[] products;
	private int lastIndex;
	@Override
	public boolean isEmpty() {
		if (products == null || products.length ==0 ) {
			return true;
		}
		
		for(Product product : products) {
			if (product != null) {
				return false;
			}
		}
		return true;

	}
	@Override
	public void addProduct(Product product) {
		if (product == null) {
			return;
		}
		if(products.length <= lastIndex) {
			
		}
	}

	@Override
	public Product[] getProducts() {
		int nonNullProductsAmount = 0;
		for (Product product : products) {
			if (product != null) {
				nonNullProductsAmount++;
			}
		}
		
		Product[] nonNullProducts = new Product[nonNullProductsAmount];
		int index = 0;
		for (Product product : products) {
			if (product != null) {
				nonNullProducts[index++] = product;
			}
		}
		
		return nonNullProducts;
	}
	
	
	@Override
	public void clear() {
		products = new Product[Default_Product_Capacity];
	}

}
