/**
Description:
This class does performance test of palindrome checking algorithms

 @author Godwin
 @version 13.0
**/
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";
        int iterations = 100000;

        benchmark("Two Pointer", iterations, () -> twoPointer(input));
        benchmark("Stack", iterations, () -> stackMethod(input));
        benchmark("Recursion", iterations, () -> recursionMethod(input));
    }

    static void benchmark(String name, int iterations, Runnable method) {

        long start = System.nanoTime();

        for (int i = 0; i < iterations; i++)
            method.run();

        long end = System.nanoTime();

        System.out.println(name + " Execution Time: " + (end - start) + " ns");
    }

    static boolean twoPointer(String input) {

        String s = input.replaceAll("\\s+", "").toLowerCase();
        int start = 0, end = s.length() - 1;

        while (start < end)
            if (s.charAt(start++) != s.charAt(end--))
                return false;

        return true;
    }

    static boolean stackMethod(String input) {

        String s = input.replaceAll("\\s+", "").toLowerCase();
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : s.toCharArray())
            stack.push(c);

        for (char c : s.toCharArray())
            if (c != stack.pop())
                return false;

        return true;
    }

    static boolean recursionMethod(String input) {
        String s = input.replaceAll("\\s+", "").toLowerCase();
        return recursiveCheck(s, 0, s.length() - 1);
    }

    static boolean recursiveCheck(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return recursiveCheck(s, start + 1, end - 1);
    }
}