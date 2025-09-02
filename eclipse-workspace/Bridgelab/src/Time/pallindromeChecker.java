package Time;
import java.util.*;
public class pallindromeChecker {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = takeInput(sc);
        boolean result = isPalindrome(input);

        displayResult(input, result);
    }
    public static String takeInput(Scanner sc) {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase(); // normalize (ignore spaces & case)
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void displayResult(String str, boolean isPalin) {
        if (isPalin) {
            System.out.println("\"" + str + "\" is a Palindrome ✅");
        } else {
            System.out.println("\"" + str + "\" is NOT a Palindrome ❌");
        }
    }
}
