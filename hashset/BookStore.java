package hashset;

import java.util.*;

public class BookStore {
	HashSet<Book> books ;
	
	public BookStore(HashSet<Book> books) {
		this.books = books;
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public Book searchBook(int id) {
		for(Book book: books) {
			if(book.getId() == id) {
				return book;
			}
		}
		return null;
	}
	
	public void removeBook(int id) {
		Book book = searchBook(id);
		if(book != null) {
			books.remove(book);
			System.out.println("Book removed successfully...!");
		}
		else {
			System.out.println("Book not found...!");
		}
	}
	
	public void displayBooks() {
		for(Book book : books) {
			System.out.println(book);
		}
	}
}
