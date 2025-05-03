package onlineShop.menu.implementations;

import java.util.Scanner;


import onlineShop.configurations.ApplicationContext;
import onlineShop.menu.Menu;
import onlineShop.entities.*;
import onlineShop.entities.implementations.*;
import onlineShop.services.OrderManagementService;
import onlineShop.services.implementations.DefaultOrderManagementService;

public class CheckoutMenu implements Menu {

	private ApplicationContext context;
	private OrderManagementService orderManagementService;
	
	{
		context = ApplicationContext.getInstance();
		orderManagementService = DefaultOrderManagementService.getInstance();
	}
	
	@Override
	public void start() {
		while (true) {
			printMenuHeader();
			Scanner scanner = new Scanner(System.in);
			String userInput = scanner.next();
			
			if (!createOrder(userInput) ) {
				continue;
			}
			context.getSessionCart().clear();
			break;
			
		}
	}
	
	private boolean createOrder(String creditCardNumber) {
		Order order = new DefaultOrder();
		if (!order.isCreditCardNumberValid(creditCardNumber)) {
			return false;
		}
		
		order.setCreditCardNumber(creditCardNumber);
		order.setProducts(context.getSessionCart().getProducts());
		order.setCustomerId(context.getLoggedInUser().getId());
		orderManagementService.addOrder(order);
		return true;
	}

	@Override
	public void printMenuHeader() {
		System.out.println("**** CHECKOUT *****");
		System.out.print("Enter your credit card number without spaces and press enter if you confirm purchase: ");

	}

}
