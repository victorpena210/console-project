package entities;

public class Author {
	int id;
	String firstName;
	String lastName;
	
	public Author() {
		
	}
	
	@Override
	public String toString() {
		return "Author: " + firstName + " " + lastName;
	}
	

}
