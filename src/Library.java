import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<String> books = new ArrayList();

	// Add Books in the List
	public void addBook(String bookName) {
		if (bookName.isEmpty() || bookName.isBlank() || bookName == null) {
			System.out.println("Invalid name");
			return;
		}
		books.add(bookName);
		System.out.println(bookName + " added to library.");
	}

	// Print List of Books
	public void listBooks() {
		System.out.println("Books in library: " + books);
	}

	public void removeBook(String bookName) {
		if (books.remove(bookName)) {
			System.out.println(bookName + "removed from library");
		} else {
			System.out.println(bookName + " not found in library");
		}
	}

}
