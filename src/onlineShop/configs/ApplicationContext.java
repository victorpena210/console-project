package onlineShop.configs;

import onlineShop.menu.Menu;


public class ApplicationContext {
	
	private static ApplicationContext instance;
	
	private User loggedInUser;
	private Menu mainMenu;
	private Cart sessionCart;
	
	private ApplicationContext() {
		
	}
	
	

}
