package main.services;

import main.entities.Author;
import main.entities.Book;
import main.entities.Publisher;

public class BookService {
	
	public String filterBooksByAuthor(Author authors, Book[] books) {
		String searchedAuthor = "Author: " + authors.getFirstName() + " " + authors.getLastName();
		String result = "";
		for (int i = 0; i < books.length; i++) {
			if(books[i].getAuthors()[0].toString().equals(searchedAuthor)) {
				result += books[i] + System.lineSeparator();
			}
		}
	return result;
	}
	
	
	
	public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
		String searchedPublisher = publisher.getPublisherName();
		return books;
	}
	
	public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
		return books;
		
	}

}
