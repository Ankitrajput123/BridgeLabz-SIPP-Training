import java.util.Scanner;

public class SubstringComparison {

   
    public static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

   
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter the original text: ");
        String text = input.next();

        System.out.print("Enter the start index: ");
        int start = input.nextInt();

        System.out.print("Enter the end index: ");
        int end = input.nextInt();

     
        String customSub = customSubstring(text, start, end);

     
        String builtInSub = text.substring(start, end);

   
        System.out.println("\nSubstring using charAt(): " + customSub);
        System.out.println("Substring using built-in method: " + builtInSub);

        boolean areEqual = compareStrings(customSub, builtInSub);
        System.out.println("Are both substrings equal? " + areEqual);
    }
}
