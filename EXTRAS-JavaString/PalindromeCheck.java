import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string to check for palindrome: ");
        String input = scanner.nextLine();

        
        boolean isPalindrome = checkPalindrome(input);

        
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    
    public static boolean checkPalindrome(String str) {
        
        String cleanStr = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = cleanStr.length() - 1;

      
        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
