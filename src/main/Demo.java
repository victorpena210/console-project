package main;

import java.math.BigDecimal;

import main.entities.Author;
import main.entities.Book;
import main.entities.CoverType;
import main.entities.Publisher;
import main.services.BookService;

public class Demo {
	
	public static void main(String[] args) {
		
		Book[] books = new Book[] {
				new Book(1, "Book_1", new Author[] { new Author(1, "Jon", "Johnson") }, new Publisher(1, "Publisher_1"), 1990, 231, BigDecimal.valueOf(24.99), CoverType.PAPERBACK),

				new Book(2, "Book_2", new Author[] { new Author(1, "Jon", "Johnson"), new Author(2, "William", "Wilson") }, new Publisher(2, "Publisher_2"), 2000, 120, BigDecimal.valueOf(14.99), CoverType.PAPERBACK),

				new Book(3, "Book_3", new Author[] { new Author(3, "Walter", "Peterson") }, new Publisher(1, "Publisher_1"), 1997, 350, BigDecimal.valueOf(34.99), CoverType.HARDCOVER),

				new Book(4, "Book_4", new Author[] { new Author(4, "Craig", "Gregory") }, new Publisher(3, "Publisher_3"), 1992, 185, BigDecimal.valueOf(19.99), CoverType.PAPERBACK) };

	
		BookService bookService = new BookService();
		
		Author author1 = new Author();
		author1.setFirstName("Jon");
		author1.setLastName("Johnson");
		
		Publisher publisher1 = new Publisher();
		publisher1.setPublisherName("Publisher_1");

		System.out.println(bookService.filterBooksByAuthor(author1, books));
		System.out.println("=========");
		System.out.println(bookService.filterBooksByPublisher(publisher1, books));
		
		System.out.println("=========");
		
		System.out.println(bookService.filterBooksAfterSpecifiedYear(1997, books));
		
		
		
		
	}
}



		
		
		