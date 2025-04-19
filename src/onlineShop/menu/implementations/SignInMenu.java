package onlineShop.menu.implementations;

import onlineShop.configurations.ApplicationContext;
import onlineShop.menu.Menu;
import onlineShop.services.UserManagementService;
import onlineShop.services.implementations.DefaultUserManagementService;

public class SignInMenu implements Menu {
	
	private ApplicationContext context;
	private UserManagementService userManagementService;
	
	{
		context = ApplicationContext.getInstance();
		userManagementService = DefaultUserManagementService.getInstance();
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
