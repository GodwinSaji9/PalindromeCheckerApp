/**
Description:
This class demonstrates palindrome validation after preprocessing the input string 

 @author Godwin
 @version 10.0
**/
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man, a plan, a canal: Panama";
        
        if (isPalindrome(input)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String input) {

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for (int i = 0; i < normalized.length() / 2; i++) {

            if (normalized.charAt(i) != 
                normalized.charAt(normalized.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}