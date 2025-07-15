import java.util.Scanner;

public class ReverseString {
    public static String reverse(String input) {
        // Create a StringBuilder and append the input string
        StringBuilder sb = new StringBuilder(input);

        // Use reverse() method
        sb.reverse();

        // Convert back to string and return
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input string
        System.out.print("Enter a string to reverse: ");
        String str = sc.nextLine();

        // Reverse and display
        String reversedStr = reverse(str);
        System.out.println("Reversed string: " + reversedStr);
    }
}
