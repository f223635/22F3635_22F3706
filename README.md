# 22F3635_22F3706
Library Class
The Library class is a simple implementation to manage a collection of books. It allows you to add books and list all the books currently in the library. This class is designed to demonstrate basic object-oriented programming principles in Java.

Features
Add Books: You can add a book to the library using the addBook(String bookName) method.
List Books: You can retrieve a list of all books in the library with the listBooks() method.
Methods
addBook(String bookName)

Description: Adds a book to the library.
Parameters:
bookName: A String representing the name of the book to be added.
Output: Prints a confirmation message that the book has been added.
listBooks()

Description: Displays all the books currently in the library.
Output: Prints a list of books in the library.
Example Usage
java
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("1984 by George Orwell");
        library.addBook("To Kill a Mockingbird by Harper Lee");
        library.listBooks();
    }
}

Dependencies
This class uses Java's built-in ArrayList from the java.util package.

Notes
This implementation is a starting point and can be expanded with additional features such as removing books, searching for specific titles, and more.
Ensure that your Java environment is set up to run this class.
