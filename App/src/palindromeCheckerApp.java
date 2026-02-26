/**
 * MAIN CLASS: UseCase11PalindromeCheckerApp
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * This class demonstrates object-oriented design.
 * The palindrome logic is encapsulated inside
 * a separate service class.
 *
 * This proves:
 *  - Reusability
 *  - Encapsulation
 *  - Clean architecture design
 *
 * @author Developer
 * @version 11.0
 */

public class palindromeCheckerApp {

    /**
     * Application entry point
     * @param args Command-Line arguments
     */
    public static void main(String[] args) {

        String input = "racecar";
        System.out.println("Input: " + input);

        // Create service object
        PalindromeService service = new PalindromeService();

        boolean result = service.checkPalindrome(input);

        System.out.println("Is Palindrome?: " + result);
    }
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     *
     * @param input String to check
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters using two-pointer technique
        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}