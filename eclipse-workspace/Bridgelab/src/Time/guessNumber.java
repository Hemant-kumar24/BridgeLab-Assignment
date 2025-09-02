package Time;
import java.util.*;
public class guessNumber {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");
        System.out.println("Respond with 'high', 'low', or 'correct'.");

        int low = 1, high = 100;
        boolean correct = false;

        while (!correct) {
            int guess = generateGuess(low, high, random);
            System.out.println("Is it " + guess + "?");

            String feedback = sc.nextLine().toLowerCase();

            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed your number 🎉");
                correct = true;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid input! Please type 'high', 'low', or 'correct'.");
            }
        }
        sc.close();
    }

    // Function to generate guess
    public static int generateGuess(int low, int high, Random random) {
        return random.nextInt(high - low + 1) + low;
    }
}
