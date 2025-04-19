package onlineShop;
import onlineShop.menu.Menu;
import onlineShop.menu.implementations.MainMenu;

public class Main {
	
	public static final String EXIT_COMMAND = "exit";
	
	public static void main(String[] args) {
		Menu mainMenu = new MainMenu();
		mainMenu.start();
	}

}
