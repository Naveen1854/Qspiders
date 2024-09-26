package constructors;

public class Book {
	String title;
	String author;
	
	public Book(String title,String author) {
		this.title=title;
		this.author=author;
	}
	
	int price;
	public Book(String title, String author, int price) {
		this(title, author);
		this.price=price;
	}
	
	public void displayBookInfo() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
	}
	
	public static void main(String[] args) {
		Book b = new Book("Java Programming", "John Doe",30);
		b.displayBookInfo();
	}
}
