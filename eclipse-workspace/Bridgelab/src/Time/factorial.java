package Time;
import java.util.*;
public class factorial {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = takeInput(sc);
        long fact = factorial(num);

        displayResult(num, fact);

        sc.close();
    }
    public static int takeInput(Scanner sc) {
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void displayResult(int n, long fact) {
        System.out.println("Factorial of " + n + " = " + fact);
    }

}
