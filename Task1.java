import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max = 100;
        int attempts = 0;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have 10 attempts to guess the number between 1 and 100.");

        while (true) {
            int numberToGuess = random.nextInt(max - min + 1) + min;
            System.out.println("New round! Guess the number: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == numberToGuess) {
                System.out.println("Congratulations You guessed the number in " + attempts + " attempts.");
                score++;
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }

            attempts = 0;
        }

        System.out.println("Thanks for playing! Your score is: " + score);
    }
}
