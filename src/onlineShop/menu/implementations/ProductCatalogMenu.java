package onlineShop.menu.implementations;

import onlineShop.configurations.*;
import onlineShop.services.*;
import onlineShop.services.implementations.DefaultProductManagementService;
import onlineShop.menu.Menu;

public class ProductCatalogMenu implements Menu {
	
	private static final String CHECKOUT_COMMAND = "checkout";
	private ApplicationContext context;
	private ProductManagementService productManagementService;
	
	{
		context = ApplicationContext.getInstance();
		productManagementService = DefaultProductManagementService.getInstance()
	}
	

	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printMenuHeader() {
		// TODO Auto-generated method stub

	}

}
