package libraryConsoleProgram;

import java.math.BigDecimal;
import java.util.Arrays;

public class Book {
	
	int id;
	String name;
	Author[] authors;
	Publisher publishers;
	int publishingYear;
	int amountOfPages;
	BigDecimal price;
	CoverType coverType;

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", authors=" + Arrays.toString(authors) + ", publishers="
				+ publishers + ", publishingYear=" + publishingYear + ", amountOfPages=" + amountOfPages + ", price="
				+ price + ", coverType=" + coverType + "]";
	}

	public Book(int id, String name, Author[] authors, Publisher publishers, int publishingYear, int amountOfPages,
			BigDecimal price, CoverType coverType) {
		this.id = id;
		this.name = name;
		this.authors = authors;
		this.publishers = publishers;
		this.publishingYear = publishingYear;
		this.amountOfPages = amountOfPages;
		this.price = price;
		this.coverType = coverType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author[] getAuthors() {
		return authors;
	}

	public void setAuthors(Author[] authors) {
		this.authors = authors;
	}

	public Publisher getPublishers() {
		return publishers;
	}

	public void setPublishers(Publisher publishers) {
		this.publishers = publishers;
	}

	public int getPublishingYear() {
		return publishingYear;
	}

	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}

	public int getAmountOfPages() {
		return amountOfPages;
	}

	public void setAmountOfPages(int amountOfPages) {
		this.amountOfPages = amountOfPages;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public CoverType getCoverType() {
		return coverType;
	}

	public void setCoverType(CoverType coverType) {
		this.coverType = coverType;
	}
	
	
	
	

}
