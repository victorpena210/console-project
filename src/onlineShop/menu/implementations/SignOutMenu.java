package onlineShop.menu.implementations;

import onlineShop.menu.Menu;
import onlineShop.configurations.*;

public class SignOutMenu implements Menu {
	
	private ApplicationContext context;
	
	{
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		printMenuHeader();
		context.setLoggedInUser(null);

	}

	@Override
	public void printMenuHeader() {
		System.out.println("**** Sign Out ****");
		System.out.println("Have a nice day! Look forward to welcoming back!");
	}

}
