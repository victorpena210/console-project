package onlineShop.menu.implementations;

import java.util.Scanner;

import onlineShop.configurations.*;
import onlineShop.entities.Cart;
import onlineShop.entities.Product;
import onlineShop.services.*;
import onlineShop.services.implementations.DefaultProductManagementService;
import onlineShop.menu.Menu;

public class ProductCatalogMenu implements Menu {
	
	private static final String CHECKOUT_COMMAND = "checkout";
	private ApplicationContext context;
	private ProductManagementService productManagementService;
	
	{
		context = ApplicationContext.getInstance();
		productManagementService = DefaultProductManagementService.getInstance();
	}
	

	@Override
	public void start() {
		Menu menuToNavigate = null;
		while (true) {
			printMenuHeader();
			printProductsToConsole();
			
			String userInput = readUserInput();
			
			if (context.getLoggedInUser() == null) {
				menuToNavigate = new MainMenu();
				System.out.println("you are not logged in. Please, sign in or create new account");
				break;
			}
				
			if (userInput.equalsIgnoreCase(MainMenu.MENU_COMMAND)) {
				menuToNavigate = new MainMenu();
				break;
			}
			
			if (userInput.equalsIgnoreCase(CHECKOUT_COMMAND)) {
				Cart sessionCart = context.getSessionCart();
				if (sessionCart == null || sessionCart.isEmpty()) {
					System.out.println("Your cart is empty.  Please, add product to cart before proceeding to checkout");
				} else {
					menuToNavigate = new CheckoutMenu();
				}
			}
			
			
		}

	}

	private String readUserInput() {
		System.out.print("Product ID to add to cart or enter CHECKOUT to proceed with checkout: ");
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.next();
		return userInput;
	}

	private void printProductsToConsole() {
		Product[] products = productManagementService.getProducts();
		
		for (Product product : products) {
			System.out.println(product);	}
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** PRODUCT CATALOG *****");
		System.out.println("Enter product ID to add it to the card or menu if you want to navigate back to the main menu");
	}

}
