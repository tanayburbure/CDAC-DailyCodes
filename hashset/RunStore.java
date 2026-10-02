package hashset;
import java.util.*;

public class RunStore {
	public static void main(String[] args) {
		HashSet<Book> books = new HashSet<>();
		BookStore store = new BookStore(books);
		
		store.addBook(new Book(101, "Java", "James", 500));
		store.addBook(new Book(102, "Cpp", "robin", 450));
		store.addBook(new Book(103, "JavaScript", "russo", 600));
		store.addBook(new Book(104, "rust", "marlin", 500));
		
		System.out.println("All books");
		store.displayBooks();
		
		System.out.println("Searching book with an id 102 : ");
		Book book = store.searchBook(102);
		
		if(book != null) {
			System.out.println(book);
		}else {
			System.out.println("Book not found..!");
		}
		
		System.out.println("Removing book with an id : 103");
		store.removeBook(103);
		
		System.out.println("Books after removing : ");
		store.displayBooks();
	}
}
