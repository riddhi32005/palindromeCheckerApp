/**
 * Use Case 10: Normalized Palindrome Validation
 * Description:
 * This class validates a palindrome after preprocessing
 * the input string.
 *
 * Normalization includes:
 * 1. Removing spaces and symbols
 * 2. Converting to lowercase
 *
 * This ensures the palindrome check is logical rather
 * than character-format dependent.
 *
 * Example:
 * "A man a plan a canal Panama"
 *
 * @author Developer
 * @version 10.0
 */

import java.util.Scanner;

public class palindromeCheckerApp {

    /**
     * Application entry point for UC10
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String input = scanner.nextLine();

        // Step 1: Normalize string
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        // Step 2: Apply palindrome logic
        boolean isPalindrome = true;

        for (int i = 0; i < normalized.length() / 2; i++) {

            // Compare symmetric characters
            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome?");
        System.out.println(isPalindrome);

        scanner.close();
    }
}