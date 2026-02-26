
/**
 * MAIN CLASS: UseCase13PalindromeCheckerApp
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution performance
 * of palindrome validation algorithms.
 *
 * At this stage, the application:
 *  - Uses a palindrome strategy implementation
 *  - Captures execution start and end time
 *  - Calculates total execution duration
 *  - Displays benchmarking results
 *
 * This use case focuses purely on performance measurement
 * and algorithm comparison concepts.
 *
 * @author Developer
 * @version 13.0
 */

public class palindromeCheckerApp {

    /**
     * Application entry point
     * @param args Command-Line arguments
     */
    public static void main(String[] args) {

        String input = "level";
        System.out.println("Input: " + input);

        long startTime = System.nanoTime();

        boolean result = checkPalindrome(input);

        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Is Palindrome?: " + result);
        System.out.println("Execution Time: " + executionTime + " ns");
    }

    /**
     * Simple Two-Pointer Palindrome Algorithm
     */
    private static boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

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
