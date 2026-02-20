/**
Description:
This class validates a palindrome by converting the string into a character array and comparing characters using the two-pointer technique.

 @author Godwin
 @version 5.0
**/
import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "noon";

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
}
