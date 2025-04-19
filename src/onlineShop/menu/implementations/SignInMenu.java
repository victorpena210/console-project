package onlineShop.menu.implementations;

import java.util.Scanner;
import onlineShop.entities.*;

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
		printMenuHeader();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please, enter your email: ");
		String userEmail = scanner.next();
		
		System.out.print("Please, enter your password");
		String userPassword = scanner.next();
		
		User user = userManagementService.getUserByEmail(userEmail);
		if (user != null && user.getPassword().equals(userPassword)) {
			System.out.printf("Glad to see you back %s %s", user.getFirstName(),
					user.getLastName() + System.lineSeparator());
			context.setLoggedInUser(user);
		} else {
			System.out.println("Unfortunately, such login and password does not exist");
		}
	}

	@Override
	public void printMenuHeader() {
		System.out.println("**** Sign In ****");
	}

}
