package onlineShop.menu.implementations;

import java.util.Scanner;

import onlineShop.entities.User;
import onlineShop.entities.implementations.DefaultUser;
import onlineShop.configurations.ApplicationContext;
import onlineShop.menu.Menu;
import onlineShop.services.UserManagementService;
import onlineShop.services.implementations.DefaultUserManagementService;

public class SignUpMenu implements Menu {
	
	private UserManagementService userManagementService;
	private ApplicationContext context;
	
	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
	}
	

	@Override
	public void start() {
		printMenuHeader();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please, enter your first name: ");
		String firstName = scanner.next();
		System.out.print("Please, enter your last name: ");
		String lastName = scanner.next();
		System.out.print("Please, enter your password: ");
		String password = scanner.next();
		
		scanner = new Scanner(System.in);
		
		System.out.print("Please, enter your email: ");
		String email = scanner.nextLine(); 
		
		User user = new DefaultUser(firstName, lastName, password, email);
	}


	@Override
	public void printMenuHeader() {
		System.out.println("**** SIGN UP ****");
		
	}

}
