package libraryConsoleProgram;

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
	
	public String filterBooksByPublisher(Publisher publisher, Book[] books) {
		String searchedPublisher = publisher.getPublisherName();
		String result = "";
		for(int i = 0; i< books.length; i++) {

			if(books[i].getPublishers().getPublisherName().equals(searchedPublisher)) {
				result += books[i] + System.lineSeparator();
			}
		}
		return result;
	}
	
	public String filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
		int searchedYear = yearFromInclusively;
		String result = "";
				for(int i =0; i < books.length; i++) {
			
			if(books[i].getPublishingYear() >= searchedYear) {
				result += books[i] + System.lineSeparator();
			}
		}
		
		return result;
		
	}

}
