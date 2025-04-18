package onlineShop.configurations;

import onlineShop.entities.Cart;
import onlineShop.entities.User;
import onlineShop.entities.implementations.DefaultCart;
import onlineShop.menu.Menu;

public class ApplicationContext {
	
	private static ApplicationContext instance;
	
	private User loggedInUser;
	private Menu mainMenu;
	private Cart sessionCart;
	
	private ApplicationContext() {
		
	}
	
	public void setLoggedInUser(User user) {
		if (this.sessionCart != null) {
			this.sessionCart.clear();
		}
	}
	
	public User getLoggedInUser() {
		return this.loggedInUser;
	}
	
	public void setMainMenu(Menu menu) {
		this.mainMenu = menu;
		
	}
	
	public Menu getMainMenu() {
		return this.mainMenu;
	}
	
	public static ApplicationContext getInstance() {
		if (instance == null) {
			instance = new ApplicationContext();
		}
		return instance;
	}
	
	public Cart getSessionCart() {
		if (this.sessionCart == null) {
			this.sessionCart = new DefaultCart();
		}
		return this.sessionCart;
	}

}
