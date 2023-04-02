import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess;
        int count = 0;

        System.out.println("Guess the number between 1 and 100.");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            count++;

            if (guess < number) {
                System.out.println("Too low. Guess again.");
            } else if (guess > number) {
                System.out.println("Too high. Guess again.");
            }
        } while (guess != number);

        scanner.close();

        System.out.println("Congratulations! You guessed the number in " + count + " tries.");
    }
}
