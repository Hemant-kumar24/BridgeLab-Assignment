package constructor;

public class Book {
	String title;
	String Author;
	int Price;
	public Book() {
		title="Unknown";
		Author="Unknown";
		Price=0;
	}
	public Book(String title,String Author,int price) {
		this.title=title;
		this.Author=Author;
		this.Price=price;
	}
	 public void display() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + Author);
	        System.out.println("Price: " + Price);
	        System.out.println("---------------------------");
	  }
	public static void main(String[] args) {
		Book book=new Book();
		System.out.println("default constructor ");
		book.display();
		
		Book book1=new Book("java Programming","James Gosling", 499);
		System.out.println("Parametrised  constructor ");
		book1.display();
	}
}
