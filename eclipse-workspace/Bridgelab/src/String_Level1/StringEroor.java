package String_Level1;
import java.util.*;
public class StringEroor {

	    // Method that generates StringIndexOutOfBoundsException
	    public static void generateException(String text) {
	        // Accessing character beyond string length
	        System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
	    }

	    // Method that handles StringIndexOutOfBoundsException
	    public static void handleException(String text) {
	        try {
	            // Trying to access an invalid index
	            System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Caught StringIndexOutOfBoundsException: " + e);
	        }
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Take user input
	        System.out.print("Enter a string: ");
	        String userInput = sc.nextLine();

	        // 1. Call method that generates exception
	        System.out.println("\nCalling generateException():");
	        try {
	            generateException(userInput);
	        } catch (Exception e) {
	            System.out.println("Exception occurred in generateException(): " + e);
	        }

	        // 2. Call method that handles exception internally
	        System.out.println("\nCalling handleException():");
	        handleException(userInput);

	        sc.close();
	    }
	}


