package hashset;
import java.util.*;

public class Book {
	private int id;
	private String title;
	private String author;
	private int price;
	
	public Book(int id,String title,String author,int price) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	
	public String toString() {
		return id+" "+title+" "+author+" "+price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Book)) {
			return false;
		}
		Book other = (Book) obj;
		return id == other.id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
