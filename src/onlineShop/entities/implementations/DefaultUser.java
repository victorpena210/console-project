package onlineShop.entities.implementations;

import onlineShop.entities.User;

public class DefaultUser implements User {
	
	private static int userCounter = 0;
	
	private int id;
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	
	{
		id = ++userCounter;
	}
	
	public DefaultUser() {
		
	}
	
	
	public DefaultUser(String firstName, String lastName, String password, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
	}


	@Override
	public String toString() {
		return "DefaultUser [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
				+ password + ", email=" + email + "]";
	}

	@Override
	public String getFirstName() {
		return this.firstName;
	}
	@Override
	public String getLastName() {
		return this.lastName;
	}
	@Override
	public String getPassword() {
		return this.password;
	}
	@Override
	public String getEmail() {
		return this.email;
	}
	@Override
	public int getId() {
		return this.id;
	}
	@Override
	public void setPassword(String newPassword) {
		if (password == null) {
			return;
		}
		this.password = password;
		
	}
	@Override
	public void setEmail(String newEmail) {
		if (newEmail == null) {
			return;
		}
		this.email = email;
	}

}
