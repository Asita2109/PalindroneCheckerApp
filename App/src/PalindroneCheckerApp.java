/**
 * ================================================================
 * MAIN CLASS - UseCase1PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 1: Application Entry & Welcome Message
 *
 * Description:
 * This class represents the entry point of the
 * Palindrome Checker Management System.
 *
 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message
 * - Shows application version
 *
 * No palindrome logic is implemented yet.
 *
 * The goal is to establish a clear startup flow.
 *
 * @author Asrita
 * @version 1.0
 */

public class PalindroneCheckerApp {

    /**
     * Application entry point.
     *
     * This is the first method executed by the JVM
     * when the program starts.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // version 2.0
// author Abc
// useCase 2: Palindrome Checker App

import java.util.Scanner;

        public class PalindromeCheckerApp {

            public static void main(String[] args) {

                System.out.println("Welcome to Palindrome Checker App Management System");

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a word or sentence: ");
                String input = scanner.nextLine();

                // Remove spaces and convert to lowercase
                String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

                // Reverse the string
                String reversed = new StringBuilder(cleanedInput).reverse().toString();

                // Check if palindrome
                if (cleanedInput.equals(reversed)) {
                    System.out.println("Result: It is a Palindrome!");
                } else {
                    System.out.println("Result: It is NOT a Palindrome.");
                }

                scanner.close();
            }
        }
    }
}