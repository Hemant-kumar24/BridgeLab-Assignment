package Time;
import java.util.*;
public class fibonacciGenerator {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();

        generateFibonacci(terms);

        sc.close();
    }
    public static void generateFibonacci(int n) {
        int a = 0, b = 1;

        System.out.println("Fibonacci Sequence up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
