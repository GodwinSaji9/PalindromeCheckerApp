/**
Description:
This class demonstrates palindrome validation using recursive function

 @author Godwin
 @version 9.0
**/
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "level";

        if (isPalindrome(input, 0, input.length() - 1)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }

    static boolean isPalindrome(String str, int start, int end) {

        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return isPalindrome(str, start + 1, end - 1);
    }
}