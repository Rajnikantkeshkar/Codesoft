import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text or provide a file path:");
        String input = scanner.nextLine();

        // Split the input into words using space or punctuation as delimiters
        String[] words = input.split("[\\s\\p{Punct}]+");

        // Initialize a counter variable to keep track of the number of words
        int wordCount = 0;

        // Iterate through the array of words and increment the counter for each word encountered
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount++;
            }
        }

        // Display the total count of words to the user
        System.out.println("Total words: " + wordCount);
    }
}
