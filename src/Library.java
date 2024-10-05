import java.util.ArrayList;
import java.util.List;

public class Library {
private List<String> books = new ArrayList();

	// Add Books in the List
	public void addBook(String bookName) {
		books.add(bookName);
		System.out.println(bookName + " added to library.");
	}
	
	// Print List of Books
	public void listBooks() {
		System.out.println("Books in library: " + books);
	} 
}

