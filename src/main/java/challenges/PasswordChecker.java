package challenges;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 🎯 Goal
 *
 * Create a program that:
 * - Takes a password as input.
 * - Checks:
 *     - Length ≥ 8
 *     - Contains uppercase, lowercase, number, and symbol
 * - Outputs a strength rating:
 *     - “Weak”, “Moderate”, or “Strong”
 *     - “Weak” if length < 8 or missing 2+ types
 *     - “Moderate” if length ≥ 8 and missing 1 type
 *     - “Strong” if length ≥ 8 and has all 4 types
 * 
 *
 * 💡 Hints
 * - Loop through each character with: for (char c : password.toCharArray()).
 * - Use Character.isUpperCase(), Character.isLowerCase(), and Character.isDigit().
 * - Symbol = not upper/lower/digit.
 */


public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Prompt the user to enter a password and read it from input
        // String password = scanner.nextLine();

        // Call the method to check password strength
        // String strength = checkPasswordStrength(password);

        // TODO: Output the strength rating
        // System.out.println(strength);

        System.out.println("enter your password: ");
        String password = scanner.nextLine();

        String strength = checkPasswordStrength(password);
        System.out.println(strength);

        scanner.close();
    }

    /**
     * Checks the strength of the given password.
     * Returns "Weak", "Moderate", or "Strong".
     *
     * @param password The password to check
     * @return The strength rating
     */
    public static String checkPasswordStrength(String password) {
        // TODO: Implement the logic to check password strength
        // - Check length
        // - Check for uppercase, lowercase, digit, and symbol
        // - Return the appropriate rating

        if (password.length() < 8) {
            return "Weak";
        }

        int types = 0;

        ArrayList<Character> upperCase = new ArrayList<>();
        ArrayList<Character> lowerCase = new ArrayList<>();
        ArrayList<Character> digit = new ArrayList<>();
        ArrayList<Character> symbol = new ArrayList<>();

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCase.add(c);
            }

            else if (Character.isLowerCase(c)) {
                lowerCase.add(c);
            }

            else if (Character.isDigit(c)) {
                digit.add(c);
            }

            else {
                symbol.add(c);
            }
        }

        if (upperCase.size() > 0) {
            types++;
        }

        if (lowerCase.size() > 0) {
            types++;
        }

        if (digit.size() > 0) {
            types++;
        }
        
        if (symbol.size() > 0) {
            types++;
        }

        if (types == 4) {
            return "Strong";
        }

        else if (types == 3) {
            return "Moderate";
        }

        else {
            return "Weak";
        }

    }
}