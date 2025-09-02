package Time;
import java.util.Scanner;
public class MaximumThreenumbers {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a = takeInput(sc, "Enter first number: ");
	        int b = takeInput(sc, "Enter second number: ");
	        int c = takeInput(sc, "Enter third number: ");
	        int max = findMaximum(a, b, c);

	        System.out.println("The maximum number is: " + max);
	        sc.close();
	    }

	    
	    public static int takeInput(Scanner sc, String msg) {
	        System.out.print(msg);
	        return sc.nextInt();
	    }


	    public static int findMaximum(int a, int b, int c) {
	        return Math.max(a, Math.max(b, c));
	    }
}
