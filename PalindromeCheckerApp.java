/**
Description:
This class demonstrates palindrome validation by implementing encapsulation

 @author Godwin
 @version 11.0
**/
class PalindromeCheckerApp {

    public boolean checkPalindrome(String input) {

        if (input == null)
            return false;

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        char[] arr = normalized.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            if (arr[start] != arr[end]) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        PalindromeCheckerApp checker = new PalindromeCheckerApp();

        String input = "Level";

        if (checker.checkPalindrome(input)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
}