package OOPs;

public class Book {
	static String libraryName="Central Library";
	final String isbn;
	String author;
	String title;
	
	public Book(String isbn,String author,String title) {
		this.isbn=isbn;
		this.author=author;
		this.title=title;
		
	}
	public static void displayLibraryName() {
		System.out.println("Library Name: " + libraryName);
	}
	public void displayBooks() {
		if (this instanceof Book) {
	           System.out.println("Title: " + title);
	           System.out.println("Author: " + author);
	           System.out.println("ISBN: " + isbn);
	       } else {
	           System.out.println("The object is not an instance of the Book class.");
	       }
		System.out.println("_____________________________");

	}
	public static void main(String[] args) {
		Book.displayLibraryName();
		Book book1=new Book("12a345b","james Gosling","java");
		Book book2=new Book("34c567j","Hemant","The Greate Man");
		book1.displayBooks();
		
	
		book2.displayBooks();
	}
}
