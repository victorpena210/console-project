package onlineShop.menu.implementations;

import onlineShop.configurations.ApplicationContext;
import onlineShop.entities.User;
import onlineShop.menu.Menu;
import onlineShop.services.*;
import onlineShop.services.implementations.DefaultUserManagementService;

public class CustomerLIstMenu implements Menu {

	private ApplicationContext context;
	private UserManagementService userManagementService;
	
	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
	}
	
	
	
	@Override
	public void start() {
		printMenuHeader();
		User[] users = userManagementService.getUsers();
		
		if (users.length == 0) {
			System.out.println("no customers to show");
		} else {
			for (User user : users) {
				System.out.println(user);
			}
		}
		
	}

	@Override
	public void printMenuHeader() {
		System.out.println("**** USERS *****");
		
		
	}

}
