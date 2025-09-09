package constructor;

public class Library {
	 private String title;
	    private String author;
	    private double price;
	    private boolean available;

	    public Library() {
	        this.title = "Unknown";
	        this.author = "Unknown";
	        this.price = 0.0;
	        this.available = true; 
	    }

	    // Parameterized constructor
	    public Library(String title, String author, double price, boolean available) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	        this.available = available;
	    }

	    // Method to borrow a book
	    public void borrowBook() {
	        if (available) {
	            available = false;
	            System.out.println("You have successfully borrowed \"" + title + "\" by " + author + ".");
	        } else {
	            System.out.println("Sorry, \"" + title + "\" is currently not available.");
	        }
	    }

	    public void returnBook() {
	        if (!available) {
	            available = true;
	            System.out.println("You have returned \"" + title + "\". Thank you!");
	        } else {
	            System.out.println("\"" + title + "\" was not borrowed.");
	        }
	    }
	    public void displayDetails() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Price: $" + price);
	        System.out.println("Available: " + (available ? "Yes" : "No"));
	        System.out.println("----------------------------");
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	        Library b1 = new Library("Java Programming", "James Gosling", 499.99, true);

	        System.out.println("Book details:");
	        b1.displayDetails();

	        b1.borrowBook();  // borrow the book
	        b1.displayDetails();

	        b1.borrowBook();  // try borrowing again (should show unavailable)
	        b1.returnBook();  // return the book
	        b1.displayDetails();
	    }
}
