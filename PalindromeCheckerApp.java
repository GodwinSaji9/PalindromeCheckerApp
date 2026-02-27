/**
Description:
This class demonstrates palindrome validation by implementing strategy design pattern

 @author Godwin
 @version 12.0
**/
interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        if (input == null) return false;

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : normalized.toCharArray())
            stack.push(c);

        for (char c : normalized.toCharArray())
            if (c != stack.pop())
                return false;

        return true;
    }
}

public class PalindromeCheckerApp {

    private PalindromeStrategy strategy;

    public PalindromeCheckerApp(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String input) {
        return strategy.check(input);
    }

    public static void main(String[] args) {

        PalindromeCheckerApp app =
                new PalindromeCheckerApp(new StackStrategy());

        String input = "Level";

        System.out.println(app.check(input)
                ? "It is a palindrome."
                : "It is not a palindrome.");
    }
}