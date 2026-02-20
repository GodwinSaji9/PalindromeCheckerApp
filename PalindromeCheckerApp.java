/**
Description:
This class validates a palindrome by converting the string into a character array and comparing characters using the two-pointer technique.

 @author Godwin
 @version 4.0
**/
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "radar";
        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
}
