package entities;

import java.math.BigDecimal;

public class Book {
	
	int id;
	String name;
	Author[] authors;
	Publisher publisher;
	int publishingYear;
	int amountOfPages;
	BigDecimal price;
	CoverType coverType;

	public Book() {
		
	}
	
	@Override
	public String toString() {
		return "book: " + id + " \n" + name + "\n" + authors + "\n" + publisher + "\n" + publishingYear + "\n" + amountOfPages + "\n" + price + "\n" + coverType;
	}

}
