import java.util.Scanner;

/**
Description:
 This class checks whether a string is a palindrome by reversing the string and comparing it with the original value.

 @author Godwin
 @version 3.0
**/
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        String reversed = new StringBuilder(input).reverse().toString();
        
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
        
        sc.close();
    }
}
