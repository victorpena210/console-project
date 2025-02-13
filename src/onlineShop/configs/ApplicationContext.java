package onlineShop.configs;

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
	
	public User getLoogedInUser() {
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
			this.sessionCart = (Cart) new DefaultCart();
		}
		return this.sessionCart;
	}
	
	

}
